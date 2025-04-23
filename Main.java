import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import core.lang.parser.CodeScanner;
import core.lang.parser.Token;

public class Main {
  public static void main(String args[]) throws IOException {
    var reader = new BufferedReader(new FileReader("sample-code.core"));
    var scanner = new CodeScanner(reader);

    System.out.println("========================== Output ===========================\n");
    while (nextToken(scanner) != Token.INVALID) {
    }
  }

  public static int nextToken(CodeScanner scanner) {
    int token = scanner.nextToken();
    System.out.println(Token.toString(token) + "\t\t" + scanner.getLiteral());
    return token;
  }
}
