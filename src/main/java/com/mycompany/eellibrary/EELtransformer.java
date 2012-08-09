/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.eellibrary;

import com.mycompany.eellibrary.parsers.eelLexer;
import com.mycompany.eellibrary.parsers.eelParser;
import javax.persistence.criteria.*;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.Tree;

/**
 *
 * @author Administrator
 */
public final class EELtransformer
{

    public static void pprintTree(Tree t, int indent)
    {
        if (t != null)
        {
            StringBuffer sb = new StringBuffer(indent);

            if (t.getParent() == null)
            {
                System.out.println(sb.toString() + t.getText().toString());
            }
            for (int i = 0; i < indent; i++)
            {
                sb = sb.append("   ");
            }
            for (int i = 0; i < t.getChildCount(); i++)
            {
                System.out.println(sb.toString() + t.getChild(i).toString());
                pprintTree((Tree) t.getChild(i), indent + 1);
            }
        }
    }

    public static void printTree(Tree t, StringBuffer sb)
    {
        if (t != null)
        {
            String myval = t.getText();
            //System.out.println(myval);
            if ("or".equals(myval) || "and".equals(myval))
            {
                printTree(t.getChild(0), sb);
                sb.append(myval + "\n");
                printTree(t.getChild(1), sb);
            }

        }
    }

    
    private static Expression getExpression(Tree t, Root entity, CriteriaBuilder cb)
    {
        if ( t != null )
        {
            String myval = t.getText();
            int type = t.getType();
            if ( type == eelLexer.STRING )
            {
                return cb.literal( (String) myval );
            }
            if ( type == eelLexer.INT )
            {
                return cb.literal( Integer.parseInt(myval));
            }
            if ( type == eelLexer.FLOAT )
            {
                return cb.literal( Double.parseDouble(myval));
            }
            return entity.get(myval);     
        } else
            throw new RuntimeException("Invalid Expression");
    }
    
    private static Predicate getPredicate(Tree t, Root entity, CriteriaBuilder cb)
    {
        if ( t != null )
        {
            String myval = t.getText();
            int type = t.getType();
            if ( type == eelLexer.ID && myval.equalsIgnoreCase("or"))
            {
                return cb.or(getPredicate(t.getChild(0),entity,cb), getPredicate(t.getChild(1),entity,cb));
            }
            if ( type == eelLexer.ID && myval.equalsIgnoreCase("and"))
            {
                return cb.and(getPredicate(t.getChild(0),entity,cb), getPredicate(t.getChild(1),entity,cb));
            }
            if ( type == eelLexer.ID && myval.equalsIgnoreCase("eq") )
            {
                return cb.equal(getExpression(t.getChild(0),entity,cb), getExpression(t.getChild(1),entity,cb)); 
            }
            if ( type == eelLexer.ID && myval.equalsIgnoreCase("neq") )
            {
                return cb.notEqual(getExpression(t.getChild(0),entity,cb), getExpression(t.getChild(1),entity,cb)); 
            }
            if ( type == eelLexer.ID && myval.equalsIgnoreCase("lt") )
            {
                return cb.lt(getExpression(t.getChild(0),entity,cb), getExpression(t.getChild(1),entity,cb)); 
            }
            if ( type == eelLexer.ID && myval.equalsIgnoreCase("le") )
            {
                return cb.le(getExpression(t.getChild(0),entity,cb), getExpression(t.getChild(1),entity,cb)); 
            }
            if ( type == eelLexer.ID && myval.equalsIgnoreCase("gt") )
            {
                return cb.gt(getExpression(t.getChild(0),entity,cb), getExpression(t.getChild(1),entity,cb)); 
            }
            if ( type == eelLexer.ID && myval.equalsIgnoreCase("ge") )
            {
                return cb.ge(getExpression(t.getChild(0),entity,cb), getExpression(t.getChild(1),entity,cb)); 
            }  
            throw new RuntimeException("Invalid Expression");
        }else
            throw new RuntimeException("Invalid Expression");
    }
    
    public static <E> CriteriaQuery eelToCriteriaQuery(String eelQuery, Class forClazz, CriteriaBuilder cb) throws RecognitionException
    {
        synchronized (EELtransformer.class)
        {
            CharStream cs = new ANTLRStringStream(eelQuery);
            eelLexer el = new eelLexer(cs);
            CommonTokenStream tokens = new CommonTokenStream(el);
            eelParser ep = new eelParser(tokens);
            eelParser.expression_return er = ep.expression();
            //pprintTree((Tree) er.getTree(), 0);
            CriteriaQuery<E> cq = cb.createQuery(forClazz);
            Root<E> from = cq.from(forClazz);
            CriteriaQuery<E> select = cq.select(from);
            Predicate whc = getPredicate((Tree) er.getTree(), from, cb);
            select.where(whc);
            return select;
        }
    }

    private EELtransformer()
    {
    }
}
