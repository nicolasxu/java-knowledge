/*
	!(A && B) is the same as !A || !B
	!(A || B) is the same as !A && !B
*/

!(country.equals("USA")
&& !state.equals("AK")
&& !state.equals("HI")) {}
// is equivalent to 

!country.equals("USA")
|| !!state.equals("AK")
|| !!state.equals("HI"))