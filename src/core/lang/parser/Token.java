package core.lang.parser;

public class Token {
  public static String toString(int token) {
    if (token >= 0 && token <= 45)
      return tokenString[token];
    else
      return "unknown token";
  }

  public static final int INVALID = 0; // Invalid token
  public static final int EOS = 1; // End of Source
  public static final int KEYWORD = 2; // core keywords
  public static final int IDENTIFIER = 3; // A-Z a-Z _ 0-9
  public static final int NUMBER = 4; // 0123456789
  public static final int LITERAL_STRING = 5; // "string"
  public static final int LITERAL_BOOLEAN = 6; // true / false
  public static final int LITERAL_INTEGER = 7; // 123
  public static final int LITERAL_FLOAT = 8; // 123.45
  public static final int LITERAL_NULL = 9; // null
  public static final int PERIOD = 10; // .
  public static final int COLON = 11; // :
  public static final int SEMICOLON = 12; // ;
  public static final int DOUBLE_COLON = 13; // ::
  public static final int EQUAL = 14; // =
  public static final int LT = 15; // <
  public static final int GT = 16; // >
  public static final int R_SHIFT = 17; // >>
  public static final int L_SHIFT = 18; // <<
  public static final int LT_EQUAL = 19; // <=
  public static final int GT_EQUAL = 20; // >=
  public static final int L_PAREN = 21; // (
  public static final int R_PAREN = 22; // )
  public static final int LC_BRACKET = 23; // {
  public static final int RC_BRACKET = 24; // }
  public static final int LS_BRACKET = 25; // [
  public static final int RS_BRACKET = 26; // ]
  public static final int DOUBLE_QUOTE = 27; // "
  public static final int SINGLE_QUOTE = 28; // '
  public static final int BACK_TICK = 29; // `
  public static final int WHITESPACE = 30; //
  public static final int ADD = 31; // +
  public static final int SUB = 32; // -
  public static final int MUL = 33; // *
  public static final int DIV = 34; // /
  public static final int MOD = 35; // %
  public static final int ESCAPE = 36; // \
  public static final int AND = 37; // &&
  public static final int OR = 38; // ||
  public static final int BIT_OR = 39; // |
  public static final int BIT_XOR = 40; // ^
  public static final int BIT_AND = 41; // &
  public static final int TILDE = 42; // ~
  public static final int BIT_NOT = 43; // !
  public static final int COMMA = 44; // ,
  public static final int QUESTION = 45; // ?

  private static String tokenString[] = {
    "Invalid Token",
    "End of Source",
    "KEYWORD",
    "IDENTIFIER",
    "NUMBER",
    "LITERAL_STRING",
    "LITERAL_BOOLEAN",
    "LITERAL_INTEGER",
    "LITERAL_FLOAT",
    "LITERAL_NULL",
    "PERIOD",
    "COLON",
    "SEMICOLON",
    "DOUBLE_COLON",
    "EQUAL",
    "LT",
    "GT",
    "R_SHIFT",
    "L_SHIFT",
    "LT_EQUAL",
    "GT_EQUAL",
    "L_PAREN",
    "R_PAREN",
    "LC_BRACKET",
    "RC_BRACKET",
    "LS_BRACKET",
    "RS_BRACKET",
    "DOUBLE_QUOTE",
    "SINGLE_QUOTE",
    "BACK_TICK",
    "WHITESPACE",
    "ADD",
    "SUB",
    "MUL",
    "DIV",
    "MOD",
    "ESCAPE",
    "AND",
    "OR",
    "BIT_OR",
    "BIT_XOR",
    "BIT_AND",
    "TILDE",
    "BIT_NOT",
    "COMMA",
    "QUESTION",
  };

  public static final int oneByteToken[] = {
    INVALID,
    INVALID,
    INVALID,
    INVALID,
    INVALID,
    INVALID,
    INVALID,
    INVALID,
    INVALID,
    INVALID,
    INVALID,
    INVALID,
    INVALID,
    INVALID,
    INVALID,
    INVALID,
    INVALID,
    INVALID,
    INVALID,
    INVALID,
    INVALID,
    INVALID,
    INVALID,
    INVALID,
    INVALID,
    INVALID,
    INVALID,
    INVALID,
    INVALID,
    INVALID,
    INVALID,
    INVALID,
    INVALID,
    BIT_NOT,
    DOUBLE_QUOTE,
    INVALID,
    INVALID,
    MOD,
    BIT_AND,
    SINGLE_QUOTE,
    L_PAREN,
    R_PAREN,
    MUL,
    ADD,
    COMMA,
    SUB,
    PERIOD,
    DIV,
    NUMBER,
    NUMBER,
    NUMBER,
    NUMBER,
    NUMBER,
    NUMBER,
    NUMBER,
    NUMBER,
    NUMBER,
    NUMBER,
    COLON,
    SEMICOLON,
    LT,
    EQUAL,
    GT,
    QUESTION,
    INVALID,
    IDENTIFIER,
    IDENTIFIER,
    IDENTIFIER,
    IDENTIFIER,
    IDENTIFIER,
    IDENTIFIER,
    IDENTIFIER,
    IDENTIFIER,
    IDENTIFIER,
    IDENTIFIER,
    IDENTIFIER,
    IDENTIFIER,
    IDENTIFIER,
    IDENTIFIER,
    IDENTIFIER,
    IDENTIFIER,
    IDENTIFIER,
    IDENTIFIER,
    IDENTIFIER,
    IDENTIFIER,
    IDENTIFIER,
    IDENTIFIER,
    IDENTIFIER,
    IDENTIFIER,
    IDENTIFIER,
    IDENTIFIER,
    LS_BRACKET,
    ESCAPE,
    RS_BRACKET,
    BIT_XOR,
    IDENTIFIER,
    BACK_TICK,
    IDENTIFIER,
    IDENTIFIER,
    IDENTIFIER,
    IDENTIFIER,
    IDENTIFIER,
    IDENTIFIER,
    IDENTIFIER,
    IDENTIFIER,
    IDENTIFIER,
    IDENTIFIER,
    IDENTIFIER,
    IDENTIFIER,
    IDENTIFIER,
    IDENTIFIER,
    IDENTIFIER,
    IDENTIFIER,
    IDENTIFIER,
    IDENTIFIER,
    IDENTIFIER,
    IDENTIFIER,
    IDENTIFIER,
    IDENTIFIER,
    IDENTIFIER,
    IDENTIFIER,
    IDENTIFIER,
    IDENTIFIER,
    LC_BRACKET,
    BIT_OR,
    RC_BRACKET,
    TILDE,
    INVALID,
  };
}
