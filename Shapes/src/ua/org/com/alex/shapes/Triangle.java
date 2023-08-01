package ua.org.com.alex.shapes;


public class Triangle {

//	private int size;
//	private boolean isFilled;
//	private char symbol;
//	private char spaceSymbol;
//
//	public Triangle(String name, int size, char pouring, char symbol, char spaceSymbol, boolean isFilled) {
//		super(name, size, pouring, symbol, spaceSymbol);
//		this.size = size;
//		this.isFilled = isFilled;
//		this.symbol = symbol;
//		this.spaceSymbol = spaceSymbol;
//	}
//
//
//	@Override
//	public int getSize() {
//		return size;
//	}
//
//	@Override
//	public void setSize(int size) {
//		this.size = size;
//	}
//
//	public boolean isFilled() {
//		return isFilled;
//	}
//
//	public void setFilled(boolean filled) {
//		isFilled = filled;
//	}
//
//	@Override
//	public char getSymbol() {
//		return symbol;
//	}
//
//	@Override
//	public void setSymbol(char symbol) {
//		this.symbol = symbol;
//	}
//
//	@Override
//	public char getSpaceSymbol() {
//		return spaceSymbol;
//	}
//
//	@Override
//	public void setSpaceSymbol(char spaceSymbol) {
//		this.spaceSymbol = spaceSymbol;
//	}
//
//	public void printShape() {
//		for (int i = 0; i < size; i++) {
//			for (int j = 0; j < 2 * size - 1; j++) {
//				if (isFilled) {
//					if (j >= size - 1 - i && j <= size - 1 + i) {
//						System.out.print(symbol);
//					} else {
//						System.out.print(spaceSymbol);
//					}
//				} else {
//					if (i == size - 1 || j == size - 1 - i || j == size - 1 + i) {
//						System.out.print(symbol);
//					} else {
//						System.out.print(spaceSymbol);
//					}
//				}
//			}
//			System.out.println();
//		}
//	}
//
//	@Override
//	public String toString() {
//		String result = super.toString();
//		result += "Заполненный: " + isFilled + "\n";
//		result += "Отображаемый символ: " + symbol + "\n";
//		result += "Символ пустого места: " + spaceSymbol + "\n";
//		return result;
//	}
}
