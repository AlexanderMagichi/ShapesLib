package ua.org.com.alex.parentsclasses;

public abstract class SuperShapes {

	private String name;
	private int size;
	private char pouring;
	private char fillsymbol;

	public void printToConsole(String name, int size, char pouring, char fillsymbol) {

		System.out.println("New Shape");
	}

	public String getName() {

		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public char pouring() {
		return pouring;
	}

	public void pouring(char pouring) {
		this.pouring = pouring;
	}

	public char fillsymbol() {
		return pouring;
	}

	public void fillsymbol(char fillsymbol) {
		this.fillsymbol = fillsymbol;
	}
	
	
	

	// ---------------------
}
