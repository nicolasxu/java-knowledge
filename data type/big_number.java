BigInteger oneHundred = new BigInteger("100");
BigInteger fiftyMillion = new BigInteger("50000000");

System.out.println(oneHundred.multiply(fiftyMillion)); 
// Prints 5000000000

 
// BigDecimal type carries out floating-point computations without roundoff errors.

BigDecimal price = new BigDecimal("4.35");
BigDecimal quantity = new BigDecimal("100");
BigDecimal total = price.multiply(quantity);
System.out.println(total); // Prints 435.00 
