String str = "Harry";
int n = str.length();
String mystery = str.substring(0, 1) + str.substring(n - 1, n);



"Harry".charAt(0);

// String comparison
"fdsfds".compareTo("fdsfds");
"fdsfd".equals("fdsfdsfds");

// Do not use the == operator to compare strings
// It tests whether the two strings are stored in the same location.



// format string

String fs;
fs = String.format("The value of the float " +
                   "variable is %f, while " +
                   "the value of the " + 
                   "integer variable is %d, " +
                   " and the string is %s",
                   floatVar, intVar, stringVar);
System.out.println(fs);