public Person {
	public Person() {
		this(0);
	}
	public Person(int id) {
		
		this(id, "");
	}	
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
}