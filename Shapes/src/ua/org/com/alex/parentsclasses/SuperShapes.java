package ua.org.com.alex.parentsclasses;

public abstract class SuperShapes {

	private String name;
	private int size;
	private char pouring;
	private char fillsymbol;

	public abstract double calculatePerimeter();

	public abstract double calculateArea();

	protected SuperShapes(String name, int size, char pouring, char fillsymbol) {
	        this.name = name;
	        this.size = size;
	        this.pouring = pouring;
	        this.fillsymbol = fillsymbol;
	}

	@Override
	public String toString() {
	    String result = "Тип фигуры: " + name + "\n";
	    result += "Размер: " + size + "\n";
	    result += "Заливка: " + pouring + "\n";
	    result += "Символ заливки: " + fillsymbol + "\n";
	    result += "Площадь: " + calculateArea() + "\n";
	    result += "Периметр: " + calculatePerimeter() + "\n";
	    return result;
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

	
}
