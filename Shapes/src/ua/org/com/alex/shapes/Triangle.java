package ua.org.com.alex.shapes;

import java.awt.Graphics2D;

public class Triangle extends Shape {

	public Triangle(int size, boolean isFilled, char symbol, char spaceSymbol) {
		super(size, isFilled, symbol, spaceSymbol);
	}

	public Triangle(int size, boolean isFilled, char symbol) {
		super(size, isFilled, symbol);
	}

	@Override
	protected void drawShape() {
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < 2 * size - 1; j++) {
				if (isFilled) {
					if (j >= size - 1 - i && j <= size - 1 + i) {
						System.out.print(symbol);
					} else {
						System.out.print(spaceSymbol);
					}
				} else {
					if (i == size - 1 || j == size - 1 - i || j == size - 1 + i) {
						System.out.print(symbol);
					} else {
						System.out.print(spaceSymbol);
					}
				}
			}
			System.out.println();
		}
	}

	@Override
	public String toString() {
		String result = super.toString();
		result += "Filled: " + isFilled + "\n";
		result += "Display character: " + symbol + "\n";
		result += "Empty space character: " + spaceSymbol + "\n";
		return result;
	}

	@Override
	public void drawShape(Graphics2D g2d) {
		// TODO Auto-generated method stub
		
	}
}
