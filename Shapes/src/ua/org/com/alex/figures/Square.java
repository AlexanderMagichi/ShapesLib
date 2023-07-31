package ua.org.com.alex.figures;

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
	
	

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public void setSize(int size) {
		this.size = size;
	}

	public boolean isFilled() {
		return isFilled;
	}

	public void setFilled(boolean filled) {
		isFilled = filled;
	}

	@Override
	public char getSymbol() {
		return symbol;
	}

	@Override
	public void setSymbol(char symbol) {
		this.symbol = symbol;
	}

	@Override
	public char getSpaceSymbol() {
		return spaceSymbol;
	}

	@Override
	public void setSpaceSymbol(char spaceSymbol) {
		this.spaceSymbol = spaceSymbol;
	}
	

	public void printShape() {
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (isFilled || i == 0 || i == size - 1 || j == 0 || j == size - 1) {
					System.out.print(symbol);
				} else {
					System.out.print(spaceSymbol);
				}
			}
			System.out.println();
		}
	}

	@Override
	public String toString() {
		String result = super.toString(); 
		result += "Заполненный: " + isFilled + "\n";
		result += "Отображаемый символ: " + symbol + "\n";
		result += "Символ пустого места: " + spaceSymbol + "\n";
		return result;
	}
}

