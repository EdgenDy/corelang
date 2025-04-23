import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

import core.lang.parser.SourceScanner;
import core.lang.parser.Token;

public class Main {
  public static void main(String args[]) throws IOException {
    // var reader = new BufferedReader(new FileReader("sample-code.core"));
    var inputStream = new FileInputStream(new File("sample-code.core"));
    var scanner = new SourceScanner(inputStream);

    System.out.println("========================== Output ===========================\n");
    while (nextToken(scanner) != Token.INVALID) {
    }
  }

  public static int nextToken(SourceScanner scanner) {
    int token = scanner.nextToken();
    System.out.println(Token.toString(token) + "\t\t" + scanner.getLiteral());
    return token;
  }
}
