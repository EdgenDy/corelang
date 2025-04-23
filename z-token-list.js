const tokens = [
  { name: "INVALID", toString: "Invalid Token", symbol: "Invalid token" },
  { name: "EOS", toString: "End of Source", symbol: "End of Source" },
  { name: "KEYWORD", toString: "KEYWORD", symbol: "core keywords" },
  { name: "IDENTIFIER", toString: "IDENTIFIER", symbol: "A-Z a-Z _ 0-9" },
  { name: "NUMBER", toString: "NUMBER", symbol: "0123456789" },
  { name: "LITERAL_STRING", toString: "LITERAL_STRING", symbol: "\"string\"" },
  { name: "LITERAL_BOOLEAN", toString: "LITERAL_BOOLEAN", symbol: "true / false" },
  { name: "LITERAL_INTEGER", toString: "LITERAL_INTEGER", symbol: "123" },
  { name: "LITERAL_FLOAT", toString: "LITERAL_FLOAT", symbol: "123.45" },
  { name: "LITERAL_NULL", toString: "LITERAL_NULL", symbol: "null" },
  { name: "PERIOD", toString: "PERIOD", symbol: "." },
  { name: "COLON", toString: "COLON", symbol: ":" },
  { name: "SEMICOLON", toString: "SEMICOLON", symbol: ";" },
  { name: "DOUBLE_COLON", toString: "DOUBLE_COLON", symbol: "::" },
  { name: "EQUAL", toString: "EQUAL", symbol: "=" },
  { name: "LT", toString: "LT", symbol: "<" },
  { name: "GT", toString: "GT", symbol: ">" },
  { name: "R_SHIFT", toString: "R_SHIFT", symbol: ">>" },
  { name: "L_SHIFT", toString: "L_SHIFT", symbol: "<<" },
  { name: "LT_EQUAL", toString: "LT_EQUAL", symbol: "<=" },
  { name: "GT_EQUAL", toString: "GT_EQUAL", symbol: ">=" },
  { name: "L_PAREN", toString: "L_PAREN", symbol: "(" },
  { name: "R_PAREN", toString: "R_PAREN", symbol: ")" },
  { name: "LC_BRACKET", toString: "LC_BRACKET", symbol: "{" },
  { name: "RC_BRACKET", toString: "RC_BRACKET", symbol: "}" },
  { name: "LS_BRACKET", toString: "LS_BRACKET", symbol: "[" },
  { name: "RS_BRACKET", toString: "RS_BRACKET", symbol: "]" },
  { name: "DOUBLE_QUOTE", toString: "DOUBLE_QUOTE", symbol: "\"" },
  { name: "SINGLE_QUOTE", toString: "SINGLE_QUOTE", symbol: "'" },
  { name: "BACK_TICK", toString: "BACK_TICK", symbol: "`" },
  { name: "WHITESPACE", toString: "WHITESPACE", symbol: "" },
  { name: "ADD", toString: "ADD", symbol: "+" },
  { name: "SUB", toString: "SUB", symbol: "-" },
  { name: "MUL", toString: "MUL", symbol: "*" },
  { name: "DIV", toString: "DIV", symbol: "/" },
  { name: "MOD", toString: "MOD", symbol: "%" },
  { name: "ESCAPE", toString: "ESCAPE", symbol: "\\" },
  { name: "AND", toString: "AND", symbol: "&&" },
  { name: "OR", toString: "OR", symbol: "||" },
  { name: "BIT_OR", toString: "BIT_OR", symbol: "|" },
  { name: "BIT_XOR", toString: "BIT_XOR", symbol: "^" },
  { name: "BIT_AND", toString: "BIT_AND", symbol: "&" },
  { name: "TILDE", toString: "TILDE", symbol: "~" },
  { name: "BIT_NOT", toString: "BIT_NOT", symbol: "!" },
  { name: "COMMA", toString: "COMMA", symbol: "," },
  { name: "QUESTION", toString: "QUESTION", symbol: "?" }
]

let index = 0;

for (const token of tokens) {
  console.log(`public static final int ${token.name} = ${index++}; // ${token.symbol}`);
}

console.log("\n\n");

console.log("private static String tokenString[] = {");
for (const token of tokens) {
  console.log(`  "${token.toString}",`);
}
console.log("};");