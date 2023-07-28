package ua.org.com.alex.libs.shapebuilder;

public class Shape {

	public class TriangleBuilder {
		private int sizeTriangle;
		private char[][] triangle;

		// переменная в которую надо из фронта подставить значение TriangleBuilder
		public TriangleBuilder(int size) {
			this.sizeTriangle = size;
			this.triangle = new char[size][size];
		}

		public void buildTriangle() {
			for (int i = 0; i < sizeTriangle; i++) {
				for (int j = 0; j < sizeTriangle; j++) {
					if (j <= i) {
						triangle[i][j] = '*';
					} else {
						triangle[i][j] = ' ';
					}
				}
			}
		}

		public char[][] getTriangle() {
			return triangle;
		}
	}

	
	
	public class ReverseTriangleBuilder {
		private int sizeReverseTriangle;
		private char[][] triangle;
		private char[][] reverseTriangle;

		// переменная в которую надо из фронта подставить значение ReverseTriangleBuilder
		public ReverseTriangleBuilder(int size) {
			this.sizeReverseTriangle = size;
			this.reverseTriangle = new char[size][size];
		}

		public void buildReverseTriangle() {
			for (int i = 0; i < sizeReverseTriangle; i++) {
				for (int j = 0; j < sizeReverseTriangle; j++) {
					if (j >= sizeReverseTriangle - i - 1) {
						reverseTriangle[i][j] = '*';
					} else {
						reverseTriangle[i][j] = ' ';
					}
				}
			}
		}

		public char[][] getReverseTriangle() {
			return reverseTriangle;
		}
	}
	
	

	public class SquareBuilder {
		private int sizeSquare;
		private char[][] square;

		// переменная в которую надо из фронта подставить значение SquareBuilder
		public SquareBuilder(int size) {
			this.sizeSquare = size;
			this.square = new char[size][size];
		}

		public void buildSquare() {
			for (int i = 0; i < sizeSquare; i++) {
				for (int j = 0; j < sizeSquare; j++) {
					square[i][j] = '*';
				}
			}
		}

		public char[][] getSquare() {
			return square;

		}
	}

	
	
	public class HollowSquareBuilder {
		private int sizeHollowSquare;
		private char[][] hollowSquare;

		// переменная в которую надо из фронта подставить значение HollowSquareBuilder
		public HollowSquareBuilder(int size) {
			this.sizeHollowSquare = size;
			this.hollowSquare = new char[size][size];
		}

		public void buildHollowSquare() {
			for (int i = 0; i < sizeHollowSquare; i++) {
				for (int j = 0; j < sizeHollowSquare; j++) {
					if (i == 0 || i == sizeHollowSquare - 1 || j == 0 || j == sizeHollowSquare - 1) {

						hollowSquare[i][j] = '*';
					} else {

						hollowSquare[i][j] = ' ';
					}
				}
			}
		}

		public char[][] getHollowSquare() {
			return hollowSquare;

		}
	}
	
	

	public class RectangleBuilder {
		private int sizeRow;
		private int sizeColumn;
		private char[][] rectangle;

		// переменная в которую надо из фронта подставить 2 значения
		// RectangleBuilder(int rows, int columns)
		public RectangleBuilder(int rows, int columns) {
			this.sizeRow = rows;
			this.sizeColumn = columns;
			this.rectangle = new char[rows][columns];
		}

		public void buildRectangle() {
			for (int i = 0; i < sizeRow; i++) {
				for (int j = 0; j < sizeColumn; j++) {
					rectangle[i][j] = '*';
				}
			}
		}

		public char[][] getRectangle() {
			return rectangle;
		}
	}

}
