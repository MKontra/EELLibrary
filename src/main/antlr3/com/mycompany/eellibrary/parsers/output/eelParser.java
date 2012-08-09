// $ANTLR 3.4 C:\\Users\\Administrator\\Documents\\NetBeansProjects\\EELLibrary\\src\\main\\antlr3\\com\\mycompany\\eellibrary\\parsers\\eel.g 2012-08-02 17:37:57

package com.mycompany.eellibrary.parsers;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class eelParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "EXPONENT", "FLOAT", "HEX_DIGIT", "ID", "INT", "LEFTPAR", "QID", "RIGHTPAR", "STRING", "WS"
    };

    public static final int EOF=-1;
    public static final int EXPONENT=4;
    public static final int FLOAT=5;
    public static final int HEX_DIGIT=6;
    public static final int ID=7;
    public static final int INT=8;
    public static final int LEFTPAR=9;
    public static final int QID=10;
    public static final int RIGHTPAR=11;
    public static final int STRING=12;
    public static final int WS=13;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


public static final String[] ruleNames = new String[] {
    "invalidRule", "expression", "root"
};

public static final boolean[] decisionCanBacktrack = new boolean[] {
    false, // invalid decision
    false, false, false
};

 
    public int ruleLevel = 0;
    public int getRuleLevel() { return ruleLevel; }
    public void incRuleLevel() { ruleLevel++; }
    public void decRuleLevel() { ruleLevel--; }
    public eelParser(TokenStream input) {
        this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
    }
    public eelParser(TokenStream input, int port, RecognizerSharedState state) {
        super(input, state);
        DebugEventSocketProxy proxy =
            new DebugEventSocketProxy(this,port,adaptor);
        setDebugListener(proxy);
        setTokenStream(new DebugTokenStream(input,proxy));
        try {
            proxy.handshake();
        }
        catch (IOException ioe) {
            reportError(ioe);
        }
        TreeAdaptor adap = new CommonTreeAdaptor();
        setTreeAdaptor(adap);
        proxy.setTreeAdaptor(adap);
    }

public eelParser(TokenStream input, DebugEventListener dbg) {
    super(input, dbg);
     
    TreeAdaptor adap = new CommonTreeAdaptor();
    setTreeAdaptor(adap);


}

protected boolean evalPredicate(boolean result, String predicate) {
    dbg.semanticPredicate(result, predicate);
    return result;
}

protected DebugTreeAdaptor adaptor;
public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = new DebugTreeAdaptor(dbg,adaptor);


}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}

    public String[] getTokenNames() { return eelParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Administrator\\Documents\\NetBeansProjects\\EELLibrary\\src\\main\\antlr3\\com\\mycompany\\eellibrary\\parsers\\eel.g"; }


    public static class root_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "root"
    // C:\\Users\\Administrator\\Documents\\NetBeansProjects\\EELLibrary\\src\\main\\antlr3\\com\\mycompany\\eellibrary\\parsers\\eel.g:11:8: public root : expression ^;
    public final eelParser.root_return root() throws RecognitionException {
        eelParser.root_return retval = new eelParser.root_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        eelParser.expression_return expression1 =null;



        try { dbg.enterRule(getGrammarFileName(), "root");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(11, 7);

        try {
            // C:\\Users\\Administrator\\Documents\\NetBeansProjects\\EELLibrary\\src\\main\\antlr3\\com\\mycompany\\eellibrary\\parsers\\eel.g:11:14: ( expression ^)
            dbg.enterAlt(1);

            // C:\\Users\\Administrator\\Documents\\NetBeansProjects\\EELLibrary\\src\\main\\antlr3\\com\\mycompany\\eellibrary\\parsers\\eel.g:11:16: expression ^
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(11,26);
            pushFollow(FOLLOW_expression_in_root35);
            expression1=expression();

            state._fsp--;

            root_0 = (Object)adaptor.becomeRoot(expression1.getTree(), root_0);

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(12, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "root");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "root"


    public static class expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expression"
    // C:\\Users\\Administrator\\Documents\\NetBeansProjects\\EELLibrary\\src\\main\\antlr3\\com\\mycompany\\eellibrary\\parsers\\eel.g:14:1: expression : ( ( LEFTPAR ! expression RIGHTPAR !) ( ID ^ expression )? | ( ( QID | ID ) ID ^ ( STRING | INT | QID | FLOAT ) ) ( ID ^ expression )? );
    public final eelParser.expression_return expression() throws RecognitionException {
        eelParser.expression_return retval = new eelParser.expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LEFTPAR2=null;
        Token RIGHTPAR4=null;
        Token ID5=null;
        Token set7=null;
        Token ID8=null;
        Token set9=null;
        Token ID10=null;
        eelParser.expression_return expression3 =null;

        eelParser.expression_return expression6 =null;

        eelParser.expression_return expression11 =null;


        Object LEFTPAR2_tree=null;
        Object RIGHTPAR4_tree=null;
        Object ID5_tree=null;
        Object set7_tree=null;
        Object ID8_tree=null;
        Object set9_tree=null;
        Object ID10_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "expression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(14, 0);

        try {
            // C:\\Users\\Administrator\\Documents\\NetBeansProjects\\EELLibrary\\src\\main\\antlr3\\com\\mycompany\\eellibrary\\parsers\\eel.g:15:2: ( ( LEFTPAR ! expression RIGHTPAR !) ( ID ^ expression )? | ( ( QID | ID ) ID ^ ( STRING | INT | QID | FLOAT ) ) ( ID ^ expression )? )
            int alt3=2;
            try { dbg.enterDecision(3, decisionCanBacktrack[3]);

            int LA3_0 = input.LA(1);

            if ( (LA3_0==LEFTPAR) ) {
                alt3=1;
            }
            else if ( (LA3_0==ID||LA3_0==QID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(3);}

            switch (alt3) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Administrator\\Documents\\NetBeansProjects\\EELLibrary\\src\\main\\antlr3\\com\\mycompany\\eellibrary\\parsers\\eel.g:15:4: ( LEFTPAR ! expression RIGHTPAR !) ( ID ^ expression )?
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(15,4);
                    // C:\\Users\\Administrator\\Documents\\NetBeansProjects\\EELLibrary\\src\\main\\antlr3\\com\\mycompany\\eellibrary\\parsers\\eel.g:15:4: ( LEFTPAR ! expression RIGHTPAR !)
                    dbg.enterAlt(1);

                    // C:\\Users\\Administrator\\Documents\\NetBeansProjects\\EELLibrary\\src\\main\\antlr3\\com\\mycompany\\eellibrary\\parsers\\eel.g:15:5: LEFTPAR ! expression RIGHTPAR !
                    {
                    dbg.location(15,12);
                    LEFTPAR2=(Token)match(input,LEFTPAR,FOLLOW_LEFTPAR_in_expression49); 
                    dbg.location(15,14);
                    pushFollow(FOLLOW_expression_in_expression52);
                    expression3=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression3.getTree());
                    dbg.location(15,33);
                    RIGHTPAR4=(Token)match(input,RIGHTPAR,FOLLOW_RIGHTPAR_in_expression54); 

                    }

                    dbg.location(15,36);
                    // C:\\Users\\Administrator\\Documents\\NetBeansProjects\\EELLibrary\\src\\main\\antlr3\\com\\mycompany\\eellibrary\\parsers\\eel.g:15:36: ( ID ^ expression )?
                    int alt1=2;
                    try { dbg.enterSubRule(1);
                    try { dbg.enterDecision(1, decisionCanBacktrack[1]);

                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==ID) ) {
                        alt1=1;
                    }
                    } finally {dbg.exitDecision(1);}

                    switch (alt1) {
                        case 1 :
                            dbg.enterAlt(1);

                            // C:\\Users\\Administrator\\Documents\\NetBeansProjects\\EELLibrary\\src\\main\\antlr3\\com\\mycompany\\eellibrary\\parsers\\eel.g:15:37: ID ^ expression
                            {
                            dbg.location(15,39);
                            ID5=(Token)match(input,ID,FOLLOW_ID_in_expression59); 
                            ID5_tree = 
                            (Object)adaptor.create(ID5)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(ID5_tree, root_0);

                            dbg.location(15,41);
                            pushFollow(FOLLOW_expression_in_expression62);
                            expression6=expression();

                            state._fsp--;

                            adaptor.addChild(root_0, expression6.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(1);}


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\Administrator\\Documents\\NetBeansProjects\\EELLibrary\\src\\main\\antlr3\\com\\mycompany\\eellibrary\\parsers\\eel.g:16:4: ( ( QID | ID ) ID ^ ( STRING | INT | QID | FLOAT ) ) ( ID ^ expression )?
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(16,4);
                    // C:\\Users\\Administrator\\Documents\\NetBeansProjects\\EELLibrary\\src\\main\\antlr3\\com\\mycompany\\eellibrary\\parsers\\eel.g:16:4: ( ( QID | ID ) ID ^ ( STRING | INT | QID | FLOAT ) )
                    dbg.enterAlt(1);

                    // C:\\Users\\Administrator\\Documents\\NetBeansProjects\\EELLibrary\\src\\main\\antlr3\\com\\mycompany\\eellibrary\\parsers\\eel.g:16:5: ( QID | ID ) ID ^ ( STRING | INT | QID | FLOAT )
                    {
                    dbg.location(16,5);
                    set7=(Token)input.LT(1);

                    if ( input.LA(1)==ID||input.LA(1)==QID ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(set7)
                        );
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        dbg.recognitionException(mse);
                        throw mse;
                    }

                    dbg.location(16,16);
                    ID8=(Token)match(input,ID,FOLLOW_ID_in_expression76); 
                    ID8_tree = 
                    (Object)adaptor.create(ID8)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ID8_tree, root_0);

                    dbg.location(16,18);
                    set9=(Token)input.LT(1);

                    if ( input.LA(1)==FLOAT||input.LA(1)==INT||input.LA(1)==QID||input.LA(1)==STRING ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(set9)
                        );
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        dbg.recognitionException(mse);
                        throw mse;
                    }


                    }

                    dbg.location(16,42);
                    // C:\\Users\\Administrator\\Documents\\NetBeansProjects\\EELLibrary\\src\\main\\antlr3\\com\\mycompany\\eellibrary\\parsers\\eel.g:16:42: ( ID ^ expression )?
                    int alt2=2;
                    try { dbg.enterSubRule(2);
                    try { dbg.enterDecision(2, decisionCanBacktrack[2]);

                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==ID) ) {
                        alt2=1;
                    }
                    } finally {dbg.exitDecision(2);}

                    switch (alt2) {
                        case 1 :
                            dbg.enterAlt(1);

                            // C:\\Users\\Administrator\\Documents\\NetBeansProjects\\EELLibrary\\src\\main\\antlr3\\com\\mycompany\\eellibrary\\parsers\\eel.g:16:43: ID ^ expression
                            {
                            dbg.location(16,45);
                            ID10=(Token)match(input,ID,FOLLOW_ID_in_expression91); 
                            ID10_tree = 
                            (Object)adaptor.create(ID10)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(ID10_tree, root_0);

                            dbg.location(16,47);
                            pushFollow(FOLLOW_expression_in_expression94);
                            expression11=expression();

                            state._fsp--;

                            adaptor.addChild(root_0, expression11.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(2);}


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(17, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "expression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "expression"

    // Delegated rules


 

    public static final BitSet FOLLOW_expression_in_root35 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFTPAR_in_expression49 = new BitSet(new long[]{0x0000000000000680L});
    public static final BitSet FOLLOW_expression_in_expression52 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RIGHTPAR_in_expression54 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_ID_in_expression59 = new BitSet(new long[]{0x0000000000000680L});
    public static final BitSet FOLLOW_expression_in_expression62 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_expression70 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_expression76 = new BitSet(new long[]{0x0000000000001520L});
    public static final BitSet FOLLOW_set_in_expression79 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_ID_in_expression91 = new BitSet(new long[]{0x0000000000000680L});
    public static final BitSet FOLLOW_expression_in_expression94 = new BitSet(new long[]{0x0000000000000002L});

}