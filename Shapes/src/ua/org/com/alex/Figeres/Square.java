package ua.org.com.alex.Figeres;

import ua.org.com.alex.parentsclasses.SuperShapes;

public class Square extends SuperShapes {

	private int size;
	private boolean isFilled;
	private char symbol;
	private char spaceSymbol;

	public Square(String name, int size, char pouring, char symbol, char spaceSymbol, boolean isFilled) {
		super(name, size, pouring, symbol, spaceSymbol);
		this.size = size;
		this.isFilled = isFilled;
		this.symbol = symbol;
		this.spaceSymbol = spaceSymbol;

	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public boolean isFilled() {
		return isFilled;
	}

	public void setFilled(boolean filled) {
		isFilled = filled;
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

}
