console.log("public static final int oneByteToken[] = {");
for (let index = 0, length = 128; index < length; index++) {
  // console.log(index, "-", String.fromCharCode(index));
  if (index >= 0 && index <= 32)
    console.log("\tINVALID,");
  else if ((index >= 65 && index <= 90) || (index >= 97 && index <= 122))
    console.log("\tIDENTIFIER,");
  else if (index >= 48 && index <= 57)
    console.log("\tNUMBER,");
  else
    console.log("\t" + String.fromCharCode(index) + ",");
}
console.log("};");