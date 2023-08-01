package ua.org.com.alex.shapes;

public class Square extends Shape {

	public Square(int size, boolean isFilled, char symbol, char spaceSymbol) {
		super(size, isFilled, symbol, spaceSymbol);
	}
	public Square(int size, boolean isFilled, char symbol) {
		super(size, isFilled, symbol);
	}

	@Override
	protected void drawShape() {
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

