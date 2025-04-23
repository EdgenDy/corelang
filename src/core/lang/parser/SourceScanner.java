package core.lang.parser;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class SourceScanner {
  private InputStream stream;
  private int byteCurrent;
  private int byteNext;
  private int byteNextNext;
  
  private StringBuilder literals;

  public SourceScanner(InputStream stream) {
    this.stream = stream;
    this.byteCurrent = readByte();
    this.byteNext = readByte();
    this.byteNextNext = readByte();
  }

  public int nextToken() {
    resetLiterals();
    skipWhitespace();

    int token = Token.INVALID;

    if (byteCurrent >= 0 && byteCurrent <= 127)
      token = Token.oneByteToken[byteCurrent];

    switch (token) {
      case Token.COLON:
        if (byteNext == ':') {
          advance();
          advance();
          return Token.DOUBLE_COLON;
        }
        advance();
        return Token.COLON;

      case Token.GT:
        if (byteNext == '=') {
          advance();
          advance();
          return Token.GT_EQUAL;
        } else if (byteNext == '>') {
          advance();
          advance();
          return Token.R_SHIFT;
        }
        advance();
        return token;

      case Token.LT:
        if (byteNext == '=') {
          advance();
          advance();
          return Token.LT_EQUAL;
        } else if (byteNext == '<') {
          advance();
          advance();
          return Token.L_SHIFT;
        }
        advance();
        return token;

      case Token.BIT_AND:
        if (byteNext == '&') {
          advance();
          advance();
          return Token.AND;
        }
        advance();
        return token;

      case Token.BIT_OR:
        if (byteNext == '|') {
          advance();
          advance();
          return Token.OR;
        }
        advance();
        return token;

      case Token.DOUBLE_QUOTE:
        return readStringLiteral();
      
      case Token.IDENTIFIER:
        return readIdentifierOrKeyword();

      default:
        advance();
        return token;
    }
  }

  public String getLiteral() {
    return literals.toString();
  }

  private void resetLiterals() {
    this.literals = new StringBuilder();
  }

  private int readIdentifierOrKeyword() {
    boolean isPossibleKeyword = true;

    literals.append((char) byteCurrent);
    advance();

    while (isIdentifierPart(byteCurrent)) {
      if (isNumeric(byteCurrent) || byteCurrent == '_')
        isPossibleKeyword = false;

      literals.append((char) byteCurrent);
      advance();
    }

    if (isPossibleKeyword && isLiteralKeyword())
      return Token.KEYWORD;

    return Token.IDENTIFIER;
  }

  private int readStringLiteral() {
    literals.append((char) byteCurrent);
    advance();

    while (byteCurrent != '"' && byteCurrent != -1) {
      literals.append((char) byteCurrent);
      advance();
    }

    if (byteCurrent != '"')
      return Token.INVALID;

    literals.append('"');
    advance();
    
    return Token.LITERAL_STRING;
  }

  private int advance() {
    byteCurrent = byteNext;
    byteNext = byteNextNext;
    byteNextNext = readByte();

    return byteCurrent;
  }

  private boolean isLiteralKeyword() {
    String literal = literals.toString();
    int length = literals.length();

    switch (length) {
      case 2:
        return literal.equals("do") || literal.equals("if");
      case 3:
        return literal.equals("for") || literal.equals("get") || literal.equals("new") || literal.equals("set") || literal.equals("var");
      case 4:
        return literal.equals("case") || literal.equals("enum") || literal.equals("type");
      case 5:
        return literal.equals("break") || literal.equals("class") || literal.equals("const") || literal.equals("while");
      case 6:
        return literal.equals("export") || literal.equals("import") || literal.equals("public") || literal.equals("return") || literal.equals("return") || literal.equals("static") || literal.equals("switch");
      case 7:
        return literal.equals("extends") || literal.equals("private");
      case 8:
        return literal.equals("continue");
      case 9:
        return literal.equals("namespace") || literal.equals("protected");
      case 10:
        return literal.equals("implements");
    }

    return false;
  }

  private void skipWhitespace() {
    while (isWhiteSpace(byteCurrent))
      advance();
  }

  private boolean isWhiteSpace(int b) {
    return b == '\n' || b == '\r' || b == '\t' || b == '\f' || b == ' ';
  }

  private boolean isAlpha(int b) {
    return (b >= 'a' && b <= 'z') || (b >= 'A' && b <= 'Z');
  }

  private boolean isNumeric(int b) {
    return b >= '0' && b <= '9';
  }

  private boolean isAlphaNumeric(int b) {
    return isAlpha(b) || isNumeric(b);
  }

  private boolean isIdentifierStart(int b) {
    return isAlpha(b) || b == '_';
  }

  private boolean isIdentifierPart(int b) {
    return isAlphaNumeric(b) || b == '_';
  }

  private int readByte() {
    try {
      return this.stream.read();
    } catch (IOException e) {
      return -1;
    }
  }
}