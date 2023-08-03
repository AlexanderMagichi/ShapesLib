package ua.org.com.alex.shapes;

public class Circle extends Shape {

	public Circle(int size, boolean isFilled, char symbol, char spaceSymbol) {
	    super(size, isFilled, symbol, spaceSymbol);
	    drawShape();
	}

	public Circle(int size, boolean isFilled, char symbol) {
		super(size, isFilled, symbol);
		drawShape();
	}

	protected void drawShape() {
	    shapeArray = new char[size][size];
	    double radius = size / 2.0;

	    for (int i = 0; i < size; i++) {
	        for (int j = 0; j < size; j++) {
	            double distance = Math.sqrt((i - radius) * (i - radius) + (j - radius) * (j - radius));

	            if (isFilled || distance <= radius) {
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