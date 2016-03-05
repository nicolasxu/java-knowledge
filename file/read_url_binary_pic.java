// Read binary file:
String address = "http://www.ucla.edu/img/content-images/landing-photo-visit.jpg"
URL imageLocation = new URL(address);
InputStream in = imageLocation.openStream();
// • Write binary file:
FileOutputStream out = new FileOutputStream("ucla.jpg");

// Copying binary file contents:
boolean done = false;
while (!done)
{
	int input = in.read();
	if (input == -1) { done = true; }
	else { out.write(input); }
}