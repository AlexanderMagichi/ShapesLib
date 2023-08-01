package ua.org.com.alex.parentsclasses;

public abstract class SuperShapes {

	private String name;
	private int size;
	private char pouring;
	private char spaceSymbol;
	private char symbol;

	protected SuperShapes(String name, int size, char pouring, char symbol, char spaceSymbol) {
		this.name = name;
		this.size = size;
		this.pouring = pouring;
		this.symbol = symbol; 

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

	public char getPouring() {
		return pouring;
	}

	public void setPouring(char pouring) {
		this.pouring = pouring;
	}

	public char getSymbol() {
		return symbol;
	}

	public void setSymbol(char symbol) {
		this.symbol = symbol;
	}

	public char getSpaceSymbol() {
		return spaceSymbol;
	}

	public void setSpaceSymbol(char spaceSymbol) {
		this.spaceSymbol = spaceSymbol;
	}

	public String toString() {
		String result = "Тип фигуры: " + name + "\n";
		result += "Размер: " + size + "\n";
		result += "Заливка: " + pouring + "\n";
		result += "Символ заливки: " + symbol + "\n";
		result += "Пустой символ заливки: " + spaceSymbol + "\n";

		return result;
	}
	
	  public void printShape() {
	        System.out.println(this.toString());
	    }
}
