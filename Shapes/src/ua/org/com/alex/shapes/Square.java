package ua.org.com.alex.shapes;

public class Square extends Shape {

	public Square(int size, boolean isFilled, char symbol, char spaceSymbol) {
		super(size, isFilled, symbol, spaceSymbol);
		drawShape();
	}

	public Square(int size, boolean isFilled, char symbol) {
		super(size, isFilled, symbol);
		drawShape();
	}

	protected void drawShape() {
		shapeArray = new char[size][size];

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (isFilled || i == 0 || i == size - 1 || j == 0 || j == size - 1) {
					shapeArray[i][j] = symbol;
				} else {
					shapeArray[i][j] = spaceSymbol;
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
