
// System.in is not for getting keyboard input


import java.util.Scanner;

Scanner in = new Scanner(System.in);


System.out.print("Please enter the number of bottles: ");
int bottles = in.nextInt(); // use in.nextInt() to read an integer value


System.out.print("Enter price: ");
double price = in.nextDouble(); // to get an double number

System.out.print("Please enter your name: ");
String name = in.next(); // to get a string