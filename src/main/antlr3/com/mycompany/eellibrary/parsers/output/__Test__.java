import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;

import com.mycompany.eellibrary.parsers.*;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        eelLexer lex = new eelLexer(new ANTLRFileStream("C:\\Users\\Administrator\\Documents\\NetBeansProjects\\EELLibrary\\src\\main\\antlr3\\com\\mycompany\\eellibrary\\parsers\\output\\__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        eelParser g = new eelParser(tokens, 49100, null);
        try {
            g.root();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}