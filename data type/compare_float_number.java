final double EPSILON = 1E-14;
double r = Math.sqrt(2.0);
if (Math.abs(r * r - 2.0) < EPSILON) {
	System.out.println("Math.sqrt(2.0) squared is approximately 2.0");
}