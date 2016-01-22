public enum FilingStatus { SINGLE, MARRIED, MARRIED_FILING_SEPARATELY }

FilingStatus status = FilingStatus.SINGLE;

if (status == FilingStatus.SINGLE) {
	// ...
}

// valueOf() function to parse text to enum value
Scanner in = new Scanner(System.in);
status = FilingStatus.valueOf(in.nextLine());




	enum FilingStatus {SINGLE, MARRIED}
// above code should not be in main() function. 
// It should appear in a class field definition. 