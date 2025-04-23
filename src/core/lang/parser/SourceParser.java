package core.lang.parser;

import java.io.InputStream;

public class SourceParser {
  private SourceScanner scanner;

  public SourceParser(InputStream isstream) {
    this.scanner = new SourceScanner(isstream);
  }
}
