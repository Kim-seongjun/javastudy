package main;

interface Readable {
	public void read();
}

class OuterClass {
	private String myName;

	OuterClass(String name) {
		myName = name;
	}

	public Readable createLocalClassInst() {
		class LocalClass implements Readable {
			public void read() {
				System.out.println("Outer inst name: " + myName);
			}
		}
		return new LocalClass();
	}
}
