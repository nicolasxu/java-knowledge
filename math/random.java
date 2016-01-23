

// random number from 1 to 5 both inclusive 
// Method 1
int computerChoice = (int)Math.floor(Math.random() * 5 + 1);
// Method 2
int number2 = (int)Math.round(Math.random() * 4 + 1);


// Method 1 is the right one, since in method 2, 
// 0 - 0.4999 will be 0, and 0.5 to 1.499 will be 1
// there will be more probablity to be 1 than 0. 
