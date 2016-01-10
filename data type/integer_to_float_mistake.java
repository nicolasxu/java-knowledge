// potential bug
int score1 = 10;
int score2 = 4;
int score3 = 9;
double average = (score1 + score2 + score3) / 3; // Error
//System.out.println("Average score: " + " ") ;
// Prints 7.0, not 7.666666666666667
System.out.println("fdsfds");
// because both nominator and denominator are integeter, 23 / 7 = 7
// then 7 convert to float is 7.0

// solution 1:
double total = score1 + score2 + score3;
double average1 = total / 3;
// solution 2:
double average3 = (score1 + score2 + score3) / 3.0;