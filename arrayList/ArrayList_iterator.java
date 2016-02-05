ArrayList<String> al = new ArrayList<String>();
		al.add("C");
		al.add("A");
		al.add("E");
		al.add("B");
		al.add("D");
		al.add("F");

		// Use iterator to display contents of al
		System.out.print("Original contents of al: ");
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			Object element = itr.next();
			System.out.print(element + " ");
		}
		System.out.println();