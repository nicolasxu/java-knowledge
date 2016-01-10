// definition
public final class Constants {

	private Constants() {
		// restrict instantiation
	}

	public static final double PI = 3.14159;
	public static final double PLANCK_CONSTANT = 6.62606896e-34;
}
//Usage :

import static Constants.PLANCK_CONSTANT;
import static Constants.PI;//import static Constants.*;

public class Calculations {

	public double getReducedPlanckConstant() {
		return PLANCK_CONSTANT / (2 * PI);
	}
}