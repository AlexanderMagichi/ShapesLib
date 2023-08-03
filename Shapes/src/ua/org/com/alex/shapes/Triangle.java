package ua.org.com.alex.shapes;

public class Triangle extends Shape {

	public Triangle(int size, boolean isFilled, char symbol, char spaceSymbol) {
		super(size, isFilled, symbol, spaceSymbol);
		drawShape();
	}

	public Triangle(int size, boolean isFilled, char symbol) {
		super(size, isFilled, symbol);
		drawShape();
	}

	protected void drawShape() {
		shapeArray = new char[size][2 * size - 1];

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < 2 * size - 1; j++) {
				if (isFilled) {
					if (j >= size - 1 - i && j <= size - 1 + i) {
						shapeArray[i][j] = symbol;
					} else {
						shapeArray[i][j] = spaceSymbol;
					}
				} else {
					if (i == size - 1 || j == size - 1 - i || j == size - 1 + i) {
						shapeArray[i][j] = symbol;
					} else {
						shapeArray[i][j] = spaceSymbol;
					}
				}
			}
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

}
