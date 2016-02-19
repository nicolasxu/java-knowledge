/**********  StringBuffer  ********/ 

/*
	Imagine you were concatenating a list of strings, as shown below. What would the
	running time of this code be? For simplicity, assume that the strings are all the same
	length (call this x) and that there are n strings.
*/
public String joinWords(String[] words) {
	String sentence = "";
	for (String w : words) {
		sentence = sentence + w;
	}
	return sentence;
}

/*
	On each concatenation, a new copy of the string is created, and the two strings are
	copied over, character by character. The first iteration requires us to copy x characters.
	The second iteration requires copying 2x characters.The third iteration requires 3x, and
	so on.The total time therefore is 0(x + 2x + ... + nx). This reduces to 0(xn2). (Why
	isn't it 0(xnn)? Because 1 + 2 + ... + nequals n(n+l)/2,orO(n2).)
	StringBuffer can help you avoid this problem. StringBuffer simply creates an
	array of all the strings, copying them back to a string only when necessary.
*/

/* 
	This is not true in Javascript. In Javascript, string concate (e.g. +) is faster than
	array join, since all browsers optimized the string + method. 
	source: http://stackoverflow.com/questions/7299010/why-is-string-concatenation-faster-than-array-join
*/
public String joinWords(String[] words) {
	StringBuffer sentence = new StringBuffer();
	for (String w : words) {
		sentence.append(w);
	}
	return sentence.toString();
}
/*
	A good exercise to practice strings, arrays, and general data structures is to implement
	your own version of StringBuffer.
*/