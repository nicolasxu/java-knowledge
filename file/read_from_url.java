// To use a URL, include the following import statement:
import java.net;
// • To read the contents of web page:

String address = "http://www.ucla.edu";
URL pageLocation = new URL(address);
Scanner in = new Scanner(pageLocation.openStream());