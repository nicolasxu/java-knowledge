// Store objects in files using serialization
// § Automatically serializable by implementing the Serializable interface
// § JVM handles all the details


// • Output:
fileOut = new ObjectOutputStream(new FileOutputStream(filename));
fileOut.writeObject(testObject);
fileOut.close();


// • Input:
fileIn = new ObjectInputStream(new FileInputStream(filename));
testObject = (TestObject) fileIn.readObject();
fileIn.close();