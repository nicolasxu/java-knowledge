
double price = 1.22234;
System.out.printf("%.2f", price); // two digits after the decimal point



System.out.printf("%10.2f", price);
// The price is printed using 10 characters, 2 after decimal point


// other format specifier

// "%d"  =>  "24"
// "%5d" =>  "   24" // taking 5 character space
// "Quantity:%5d"  => "Quantity:   24"
// "%f"  =>  "1.21997"
// "%.2f" => "1.22"
// "%7.2f"  => "   1.22"
// "%s"    => "Hello"
// "%d %.2f"   => 24 1.22 // you can format many values at one time
