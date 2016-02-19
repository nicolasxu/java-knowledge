public boolean equals(Object obj) { 
	if (obj instanceof Person) {
		// check the objec type, or it will blow up if pass in different type
		return this.name.equals((Person)obj.getName());
	} else {
		return false;
	}
	
}