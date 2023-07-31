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

	public void displayInfo() {
		System.out.println("Тип фигуры: " + name);
		System.out.println("Размер: " + size);
		System.out.println("Заливка: " + pouring);
		System.out.println("Символ заливки: " + fillsymbol);
		System.out.println("Площадь: " + calculateArea());
		System.out.println("Периметр: " + calculatePerimeter());
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
