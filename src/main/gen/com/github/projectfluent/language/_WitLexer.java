// Generated by JFlex 1.9.1 http://jflex.de/  (tweaked for IntelliJ platform)
// source: Wit.flex

package com.github.projectfluent.language;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;import com.intellij.util.containers.IntStack;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static com.github.projectfluent.language.psi.FluentTypes.*;


public class _WitLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0, 0
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\25\u0100\1\u0200\11\u0100\1\u0300\17\u0100\1\u0400\u10cf\u0100";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\1\1\1\2\2\1\1\2\22\0\1\1\3\0"+
    "\1\3\5\0\1\4\2\0\1\5\1\6\1\7\12\10"+
    "\1\11\1\12\1\13\1\0\1\14\1\0\1\15\32\16"+
    "\3\0\1\17\2\0\1\20\1\16\1\21\1\22\1\23"+
    "\1\24\1\25\1\16\1\26\1\16\1\27\1\30\1\31"+
    "\1\32\1\33\1\34\1\16\1\35\1\36\1\37\1\40"+
    "\1\16\1\41\3\16\1\42\1\0\1\43\7\0\1\1"+
    "\32\0\1\1\u01df\0\1\1\177\0\13\1\35\0\2\1"+
    "\5\0\1\1\57\0\1\1\240\0\1\1\377\0";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[1280];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\1"+
    "\1\7\1\10\1\11\1\12\1\13\1\14\1\15\4\14"+
    "\1\16\1\17\1\0\1\20\3\0\5\14\1\0\1\20"+
    "\1\21\1\0\4\14\1\22\1\14\1\23\1\0\5\14"+
    "\1\24\4\14\1\25\1\0\1\26\3\14\1\24\1\27"+
    "\1\14\1\30\1\14\1\31";

  private static int [] zzUnpackAction() {
    int [] result = new int[65];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\44\0\110\0\44\0\44\0\44\0\154\0\220"+
    "\0\44\0\44\0\44\0\44\0\44\0\264\0\44\0\330"+
    "\0\374\0\u0120\0\u0144\0\44\0\44\0\u0168\0\u018c\0\u01b0"+
    "\0\220\0\u01d4\0\u01f8\0\u021c\0\u0240\0\u0264\0\u0288\0\u02ac"+
    "\0\u02d0\0\u02f4\0\u0318\0\u033c\0\u0360\0\u0384\0\u03a8\0\264"+
    "\0\u03cc\0\44\0\u03f0\0\u0414\0\u0438\0\u045c\0\u0480\0\u04a4"+
    "\0\u04c8\0\u04ec\0\u0510\0\u0534\0\u0558\0\264\0\u057c\0\264"+
    "\0\u05a0\0\u05c4\0\u05e8\0\u057c\0\264\0\u060c\0\264\0\u0630"+
    "\0\264";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[65];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length() - 1;
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpacktrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\2\3\1\4\1\2\1\5\1\6\1\7\1\10"+
    "\1\11\1\12\1\13\1\14\1\15\1\16\1\17\6\16"+
    "\1\20\5\16\1\21\3\16\1\22\1\23\1\24\1\25"+
    "\45\0\2\3\45\0\1\26\2\0\1\27\42\0\1\30"+
    "\1\0\1\31\40\0\1\32\2\0\1\16\5\0\1\16"+
    "\1\0\22\16\7\0\1\32\2\0\1\16\5\0\1\16"+
    "\1\0\11\16\1\33\1\34\7\16\7\0\1\32\2\0"+
    "\1\16\5\0\1\16\1\0\1\35\21\16\7\0\1\32"+
    "\2\0\1\16\5\0\1\16\1\0\16\16\1\36\3\16"+
    "\7\0\1\32\2\0\1\16\5\0\1\16\1\0\13\16"+
    "\1\37\6\16\2\0\4\26\1\40\37\26\2\41\1\0"+
    "\4\41\1\42\34\41\10\0\1\43\51\0\1\16\1\0"+
    "\22\16\7\0\1\32\2\0\1\16\5\0\1\16\1\0"+
    "\14\16\1\44\5\16\7\0\1\32\2\0\1\16\5\0"+
    "\1\16\1\0\1\16\1\45\15\16\1\46\2\16\7\0"+
    "\1\32\2\0\1\16\5\0\1\16\1\0\1\16\1\47"+
    "\20\16\7\0\1\32\2\0\1\16\5\0\1\16\1\0"+
    "\3\16\1\50\16\16\7\0\1\32\2\0\1\16\5\0"+
    "\1\16\1\0\15\16\1\51\4\16\2\0\4\26\1\40"+
    "\2\26\1\52\34\26\2\41\1\0\41\41\2\42\1\0"+
    "\41\42\6\0\1\53\1\0\1\43\40\0\1\32\2\0"+
    "\1\16\5\0\1\16\1\0\13\16\1\54\6\16\7\0"+
    "\1\32\2\0\1\16\5\0\1\16\1\0\10\16\1\55"+
    "\11\16\7\0\1\32\2\0\1\16\5\0\1\16\1\0"+
    "\3\16\1\56\16\16\7\0\1\32\2\0\1\16\5\0"+
    "\1\16\1\0\7\16\1\57\12\16\7\0\1\32\2\0"+
    "\1\16\5\0\1\16\1\0\10\16\1\60\11\16\12\0"+
    "\1\61\40\0\1\32\2\0\1\16\5\0\1\16\1\0"+
    "\15\16\1\62\4\16\7\0\1\32\2\0\1\16\5\0"+
    "\1\16\1\0\20\16\1\63\1\16\7\0\1\32\2\0"+
    "\1\16\5\0\1\16\1\0\15\16\1\64\4\16\7\0"+
    "\1\32\2\0\1\16\5\0\1\16\1\0\1\65\21\16"+
    "\7\0\1\32\2\0\1\16\5\0\1\16\1\0\2\16"+
    "\1\66\17\16\7\0\1\67\2\0\1\61\40\0\1\32"+
    "\2\0\1\16\5\0\1\16\1\0\17\16\1\70\2\16"+
    "\7\0\1\32\2\0\1\16\5\0\1\16\1\0\2\16"+
    "\1\71\17\16\7\0\1\32\2\0\1\16\5\0\1\16"+
    "\1\0\4\16\1\72\15\16\7\0\1\32\2\0\1\16"+
    "\5\0\1\16\1\0\5\16\1\73\14\16\7\0\2\74"+
    "\1\0\1\74\5\0\1\74\1\0\22\74\7\0\1\32"+
    "\2\0\1\16\5\0\1\16\1\0\3\16\1\75\16\16"+
    "\7\0\1\32\2\0\1\16\5\0\1\16\1\0\1\76"+
    "\21\16\7\0\1\32\2\0\1\16\5\0\1\16\1\0"+
    "\3\16\1\77\16\16\7\0\1\32\2\0\1\16\5\0"+
    "\1\16\1\0\1\16\1\100\20\16\7\0\1\32\2\0"+
    "\1\16\5\0\1\16\1\0\3\16\1\101\16\16\2\0";

  private static int [] zzUnpacktrans() {
    int [] result = new int[1620];
    int offset = 0;
    offset = zzUnpacktrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpacktrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\1\1\3\11\2\1\5\11\1\1\1\11"+
    "\4\1\2\11\1\0\1\1\3\0\5\1\1\0\2\1"+
    "\1\0\6\1\1\11\1\0\13\1\1\0\12\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[65];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** Number of newlines encountered up to the start of the matched text. */
  @SuppressWarnings("unused")
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  @SuppressWarnings("unused")
  protected int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  @SuppressWarnings("unused")
  private boolean zzEOFDone;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public _WitLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** Returns the maximum size of the scanner buffer, which limits the size of tokens. */
  private int zzMaxBufferLen() {
    return Integer.MAX_VALUE;
  }

  /**  Whether the scanner buffer can grow to accommodate a larger token. */
  private boolean zzCanGrow() {
    return true;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      {@code false}, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position {@code pos} from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException
  {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { return BAD_CHARACTER;
            }
          // fall through
          case 26: break;
          case 2:
            { return WHITE_SPACE;
            }
          // fall through
          case 27: break;
          case 3:
            { return DOLLAR;
            }
          // fall through
          case 28: break;
          case 4:
            { return HYPHEN;
            }
          // fall through
          case 29: break;
          case 5:
            { return DOT;
            }
          // fall through
          case 30: break;
          case 6:
            { return SLASH;
            }
          // fall through
          case 31: break;
          case 7:
            { return COLON;
            }
          // fall through
          case 32: break;
          case 8:
            { return SEMICOLON;
            }
          // fall through
          case 33: break;
          case 9:
            { return ANGLE_L;
            }
          // fall through
          case 34: break;
          case 10:
            { return ANGLE_R;
            }
          // fall through
          case 35: break;
          case 11:
            { return AT;
            }
          // fall through
          case 36: break;
          case 12:
            { return SYMBOL;
            }
          // fall through
          case 37: break;
          case 13:
            { return ACCENT;
            }
          // fall through
          case 38: break;
          case 14:
            { return BRACE_L;
            }
          // fall through
          case 39: break;
          case 15:
            { return BRACE_R;
            }
          // fall through
          case 40: break;
          case 16:
            { return COMMENT_LINE;
            }
          // fall through
          case 41: break;
          case 17:
            { return COMMENT_DOCUMENT;
            }
          // fall through
          case 42: break;
          case 18:
            { return KW_USE;
            }
          // fall through
          case 43: break;
          case 19:
            { return COMMENT_BLOCK;
            }
          // fall through
          case 44: break;
          case 20:
            { return VERSION;
            }
          // fall through
          case 45: break;
          case 21:
            { return KW_WORLD;
            }
          // fall through
          case 46: break;
          case 22:
            { return KW_IMPORT;
            }
          // fall through
          case 47: break;
          case 23:
            { return KW_INCLUDE;
            }
          // fall through
          case 48: break;
          case 24:
            { return KW_PACKAGE;
            }
          // fall through
          case 49: break;
          case 25:
            { return KW_INTERFACE;
            }
          // fall through
          case 50: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}