// $ANTLR 3.4 C:\\Users\\Administrator\\Documents\\NetBeansProjects\\EELLibrary\\src\\main\\antlr3\\com\\mycompany\\eellibrary\\parsers\\eel.g 2012-08-02 17:37:57

package com.mycompany.eellibrary.parsers;
import java.io.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class eelLexer extends Lexer {
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
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public eelLexer() {} 
    public eelLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public eelLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "C:\\Users\\Administrator\\Documents\\NetBeansProjects\\EELLibrary\\src\\main\\antlr3\\com\\mycompany\\eellibrary\\parsers\\eel.g"; }

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Administrator\\Documents\\NetBeansProjects\\EELLibrary\\src\\main\\antlr3\\com\\mycompany\\eellibrary\\parsers\\eel.g:25:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // C:\\Users\\Administrator\\Documents\\NetBeansProjects\\EELLibrary\\src\\main\\antlr3\\com\\mycompany\\eellibrary\\parsers\\eel.g:25:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // C:\\Users\\Administrator\\Documents\\NetBeansProjects\\EELLibrary\\src\\main\\antlr3\\com\\mycompany\\eellibrary\\parsers\\eel.g:25:32: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Administrator\\Documents\\NetBeansProjects\\EELLibrary\\src\\main\\antlr3\\com\\mycompany\\eellibrary\\parsers\\eel.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "QID"
    public final void mQID() throws RecognitionException {
        try {
            int _type = QID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Administrator\\Documents\\NetBeansProjects\\EELLibrary\\src\\main\\antlr3\\com\\mycompany\\eellibrary\\parsers\\eel.g:24:6: ( ID ( '.' ID )* )
            // C:\\Users\\Administrator\\Documents\\NetBeansProjects\\EELLibrary\\src\\main\\antlr3\\com\\mycompany\\eellibrary\\parsers\\eel.g:24:8: ID ( '.' ID )*
            {
            mID(); 


            // C:\\Users\\Administrator\\Documents\\NetBeansProjects\\EELLibrary\\src\\main\\antlr3\\com\\mycompany\\eellibrary\\parsers\\eel.g:24:10: ( '.' ID )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='.') ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Administrator\\Documents\\NetBeansProjects\\EELLibrary\\src\\main\\antlr3\\com\\mycompany\\eellibrary\\parsers\\eel.g:24:11: '.' ID
            	    {
            	    match('.'); 

            	    mID(); 


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "QID"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Administrator\\Documents\\NetBeansProjects\\EELLibrary\\src\\main\\antlr3\\com\\mycompany\\eellibrary\\parsers\\eel.g:30:5: ( ( '0' .. '9' )+ )
            // C:\\Users\\Administrator\\Documents\\NetBeansProjects\\EELLibrary\\src\\main\\antlr3\\com\\mycompany\\eellibrary\\parsers\\eel.g:30:7: ( '0' .. '9' )+
            {
            // C:\\Users\\Administrator\\Documents\\NetBeansProjects\\EELLibrary\\src\\main\\antlr3\\com\\mycompany\\eellibrary\\parsers\\eel.g:30:7: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\Administrator\\Documents\\NetBeansProjects\\EELLibrary\\src\\main\\antlr3\\com\\mycompany\\eellibrary\\parsers\\eel.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "LEFTPAR"
    public final void mLEFTPAR() throws RecognitionException {
        try {
            int _type = LEFTPAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Administrator\\Documents\\NetBeansProjects\\EELLibrary\\src\\main\\antlr3\\com\\mycompany\\eellibrary\\parsers\\eel.g:33:9: ( '(' )
            // C:\\Users\\Administrator\\Documents\\NetBeansProjects\\EELLibrary\\src\\main\\antlr3\\com\\mycompany\\eellibrary\\parsers\\eel.g:33:11: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LEFTPAR"

    // $ANTLR start "RIGHTPAR"
    public final void mRIGHTPAR() throws RecognitionException {
        try {
            int _type = RIGHTPAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Administrator\\Documents\\NetBeansProjects\\EELLibrary\\src\\main\\antlr3\\com\\mycompany\\eellibrary\\parsers\\eel.g:36:9: ( ')' )
            // C:\\Users\\Administrator\\Documents\\NetBeansProjects\\EELLibrary\\src\\main\\antlr3\\com\\mycompany\\eellibrary\\parsers\\eel.g:36:11: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RIGHTPAR"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Administrator\\Documents\\NetBeansProjects\\EELLibrary\\src\\main\\antlr3\\com\\mycompany\\eellibrary\\parsers\\eel.g:40:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT )
            int alt10=3;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // C:\\Users\\Administrator\\Documents\\NetBeansProjects\\EELLibrary\\src\\main\\antlr3\\com\\mycompany\\eellibrary\\parsers\\eel.g:40:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )?
                    {
                    // C:\\Users\\Administrator\\Documents\\NetBeansProjects\\EELLibrary\\src\\main\\antlr3\\com\\mycompany\\eellibrary\\parsers\\eel.g:40:9: ( '0' .. '9' )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // C:\\Users\\Administrator\\Documents\\NetBeansProjects\\EELLibrary\\src\\main\\antlr3\\com\\mycompany\\eellibrary\\parsers\\eel.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt4 >= 1 ) break loop4;
                                EarlyExitException eee =
                                    new EarlyExitException(4, input);
                                throw eee;
                        }
                        cnt4++;
                    } while (true);


                    match('.'); 

                    // C:\\Users\\Administrator\\Documents\\NetBeansProjects\\EELLibrary\\src\\main\\antlr3\\com\\mycompany\\eellibrary\\parsers\\eel.g:40:25: ( '0' .. '9' )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // C:\\Users\\Administrator\\Documents\\NetBeansProjects\\EELLibrary\\src\\main\\antlr3\\com\\mycompany\\eellibrary\\parsers\\eel.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    // C:\\Users\\Administrator\\Documents\\NetBeansProjects\\EELLibrary\\src\\main\\antlr3\\com\\mycompany\\eellibrary\\parsers\\eel.g:40:37: ( EXPONENT )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='E'||LA6_0=='e') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // C:\\Users\\Administrator\\Documents\\NetBeansProjects\\EELLibrary\\src\\main\\antlr3\\com\\mycompany\\eellibrary\\parsers\\eel.g:40:37: EXPONENT
                            {
                            mEXPONENT(); 


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Administrator\\Documents\\NetBeansProjects\\EELLibrary\\src\\main\\antlr3\\com\\mycompany\\eellibrary\\parsers\\eel.g:41:9: '.' ( '0' .. '9' )+ ( EXPONENT )?
                    {
                    match('.'); 

                    // C:\\Users\\Administrator\\Documents\\NetBeansProjects\\EELLibrary\\src\\main\\antlr3\\com\\mycompany\\eellibrary\\parsers\\eel.g:41:13: ( '0' .. '9' )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0 >= '0' && LA7_0 <= '9')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // C:\\Users\\Administrator\\Documents\\NetBeansProjects\\EELLibrary\\src\\main\\antlr3\\com\\mycompany\\eellibrary\\parsers\\eel.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);


                    // C:\\Users\\Administrator\\Documents\\NetBeansProjects\\EELLibrary\\src\\main\\antlr3\\com\\mycompany\\eellibrary\\parsers\\eel.g:41:25: ( EXPONENT )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='E'||LA8_0=='e') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // C:\\Users\\Administrator\\Documents\\NetBeansProjects\\EELLibrary\\src\\main\\antlr3\\com\\mycompany\\eellibrary\\parsers\\eel.g:41:25: EXPONENT
                            {
                            mEXPONENT(); 


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\Administrator\\Documents\\NetBeansProjects\\EELLibrary\\src\\main\\antlr3\\com\\mycompany\\eellibrary\\parsers\\eel.g:42:9: ( '0' .. '9' )+ EXPONENT
                    {
                    // C:\\Users\\Administrator\\Documents\\NetBeansProjects\\EELLibrary\\src\\main\\antlr3\\com\\mycompany\\eellibrary\\parsers\\eel.g:42:9: ( '0' .. '9' )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0 >= '0' && LA9_0 <= '9')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // C:\\Users\\Administrator\\Documents\\NetBeansProjects\\EELLibrary\\src\\main\\antlr3\\com\\mycompany\\eellibrary\\parsers\\eel.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt9 >= 1 ) break loop9;
                                EarlyExitException eee =
                                    new EarlyExitException(9, input);
                                throw eee;
                        }
                        cnt9++;
                    } while (true);


                    mEXPONENT(); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Administrator\\Documents\\NetBeansProjects\\EELLibrary\\src\\main\\antlr3\\com\\mycompany\\eellibrary\\parsers\\eel.g:46:5: ( '\"' (~ ( '\"' ) )* '\"' )
            // C:\\Users\\Administrator\\Documents\\NetBeansProjects\\EELLibrary\\src\\main\\antlr3\\com\\mycompany\\eellibrary\\parsers\\eel.g:46:8: '\"' (~ ( '\"' ) )* '\"'
            {
            match('\"'); 

            // C:\\Users\\Administrator\\Documents\\NetBeansProjects\\EELLibrary\\src\\main\\antlr3\\com\\mycompany\\eellibrary\\parsers\\eel.g:46:12: (~ ( '\"' ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0 >= '\u0000' && LA11_0 <= '!')||(LA11_0 >= '#' && LA11_0 <= '\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\Users\\Administrator\\Documents\\NetBeansProjects\\EELLibrary\\src\\main\\antlr3\\com\\mycompany\\eellibrary\\parsers\\eel.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "EXPONENT"
    public final void mEXPONENT() throws RecognitionException {
        try {
            // C:\\Users\\Administrator\\Documents\\NetBeansProjects\\EELLibrary\\src\\main\\antlr3\\com\\mycompany\\eellibrary\\parsers\\eel.g:52:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // C:\\Users\\Administrator\\Documents\\NetBeansProjects\\EELLibrary\\src\\main\\antlr3\\com\\mycompany\\eellibrary\\parsers\\eel.g:52:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // C:\\Users\\Administrator\\Documents\\NetBeansProjects\\EELLibrary\\src\\main\\antlr3\\com\\mycompany\\eellibrary\\parsers\\eel.g:52:22: ( '+' | '-' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='+'||LA12_0=='-') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // C:\\Users\\Administrator\\Documents\\NetBeansProjects\\EELLibrary\\src\\main\\antlr3\\com\\mycompany\\eellibrary\\parsers\\eel.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            // C:\\Users\\Administrator\\Documents\\NetBeansProjects\\EELLibrary\\src\\main\\antlr3\\com\\mycompany\\eellibrary\\parsers\\eel.g:52:33: ( '0' .. '9' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0 >= '0' && LA13_0 <= '9')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // C:\\Users\\Administrator\\Documents\\NetBeansProjects\\EELLibrary\\src\\main\\antlr3\\com\\mycompany\\eellibrary\\parsers\\eel.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EXPONENT"

    // $ANTLR start "HEX_DIGIT"
    public final void mHEX_DIGIT() throws RecognitionException {
        try {
            // C:\\Users\\Administrator\\Documents\\NetBeansProjects\\EELLibrary\\src\\main\\antlr3\\com\\mycompany\\eellibrary\\parsers\\eel.g:55:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // C:\\Users\\Administrator\\Documents\\NetBeansProjects\\EELLibrary\\src\\main\\antlr3\\com\\mycompany\\eellibrary\\parsers\\eel.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HEX_DIGIT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Administrator\\Documents\\NetBeansProjects\\EELLibrary\\src\\main\\antlr3\\com\\mycompany\\eellibrary\\parsers\\eel.g:56:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // C:\\Users\\Administrator\\Documents\\NetBeansProjects\\EELLibrary\\src\\main\\antlr3\\com\\mycompany\\eellibrary\\parsers\\eel.g:56:9: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\Administrator\\Documents\\NetBeansProjects\\EELLibrary\\src\\main\\antlr3\\com\\mycompany\\eellibrary\\parsers\\eel.g:1:8: ( ID | QID | INT | LEFTPAR | RIGHTPAR | FLOAT | STRING | WS )
        int alt14=8;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // C:\\Users\\Administrator\\Documents\\NetBeansProjects\\EELLibrary\\src\\main\\antlr3\\com\\mycompany\\eellibrary\\parsers\\eel.g:1:10: ID
                {
                mID(); 


                }
                break;
            case 2 :
                // C:\\Users\\Administrator\\Documents\\NetBeansProjects\\EELLibrary\\src\\main\\antlr3\\com\\mycompany\\eellibrary\\parsers\\eel.g:1:13: QID
                {
                mQID(); 


                }
                break;
            case 3 :
                // C:\\Users\\Administrator\\Documents\\NetBeansProjects\\EELLibrary\\src\\main\\antlr3\\com\\mycompany\\eellibrary\\parsers\\eel.g:1:17: INT
                {
                mINT(); 


                }
                break;
            case 4 :
                // C:\\Users\\Administrator\\Documents\\NetBeansProjects\\EELLibrary\\src\\main\\antlr3\\com\\mycompany\\eellibrary\\parsers\\eel.g:1:21: LEFTPAR
                {
                mLEFTPAR(); 


                }
                break;
            case 5 :
                // C:\\Users\\Administrator\\Documents\\NetBeansProjects\\EELLibrary\\src\\main\\antlr3\\com\\mycompany\\eellibrary\\parsers\\eel.g:1:29: RIGHTPAR
                {
                mRIGHTPAR(); 


                }
                break;
            case 6 :
                // C:\\Users\\Administrator\\Documents\\NetBeansProjects\\EELLibrary\\src\\main\\antlr3\\com\\mycompany\\eellibrary\\parsers\\eel.g:1:38: FLOAT
                {
                mFLOAT(); 


                }
                break;
            case 7 :
                // C:\\Users\\Administrator\\Documents\\NetBeansProjects\\EELLibrary\\src\\main\\antlr3\\com\\mycompany\\eellibrary\\parsers\\eel.g:1:44: STRING
                {
                mSTRING(); 


                }
                break;
            case 8 :
                // C:\\Users\\Administrator\\Documents\\NetBeansProjects\\EELLibrary\\src\\main\\antlr3\\com\\mycompany\\eellibrary\\parsers\\eel.g:1:51: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA10 dfa10 = new DFA10(this);
    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA10_eotS =
        "\5\uffff";
    static final String DFA10_eofS =
        "\5\uffff";
    static final String DFA10_minS =
        "\2\56\3\uffff";
    static final String DFA10_maxS =
        "\1\71\1\145\3\uffff";
    static final String DFA10_acceptS =
        "\2\uffff\1\2\1\1\1\3";
    static final String DFA10_specialS =
        "\5\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\3\1\uffff\12\1\13\uffff\1\4\37\uffff\1\4",
            "",
            "",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "39:1: FLOAT : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT );";
        }
    }
    static final String DFA14_eotS =
        "\1\uffff\1\11\1\13\5\uffff\1\11\3\uffff";
    static final String DFA14_eofS =
        "\14\uffff";
    static final String DFA14_minS =
        "\1\11\2\56\5\uffff\1\56\3\uffff";
    static final String DFA14_maxS =
        "\2\172\1\145\5\uffff\1\172\3\uffff";
    static final String DFA14_acceptS =
        "\3\uffff\1\4\1\5\1\6\1\7\1\10\1\uffff\1\1\1\2\1\3";
    static final String DFA14_specialS =
        "\14\uffff}>";
    static final String[] DFA14_transitionS = {
            "\2\7\2\uffff\1\7\22\uffff\1\7\1\uffff\1\6\5\uffff\1\3\1\4\4"+
            "\uffff\1\5\1\uffff\12\2\7\uffff\32\1\4\uffff\1\1\1\uffff\32"+
            "\1",
            "\1\12\1\uffff\12\10\7\uffff\32\10\4\uffff\1\10\1\uffff\32\10",
            "\1\5\1\uffff\12\2\13\uffff\1\5\37\uffff\1\5",
            "",
            "",
            "",
            "",
            "",
            "\1\12\1\uffff\12\10\7\uffff\32\10\4\uffff\1\10\1\uffff\32\10",
            "",
            "",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( ID | QID | INT | LEFTPAR | RIGHTPAR | FLOAT | STRING | WS );";
        }
    }
 

}