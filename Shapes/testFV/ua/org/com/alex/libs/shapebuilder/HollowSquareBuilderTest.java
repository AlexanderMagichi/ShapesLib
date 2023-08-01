package ua.org.com.alex.libs.shapebuilder;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class HollowSquareBuilderTest {

	@Test
	public void testBuildHollowSquare_Size3() {
		// Arrange
		int size = 3;
		char[][] expectedSquare = { { '*', '*', '*' }, { '*', ' ', '*' }, { '*', '*', '*' } };

		Shape.HollowSquareBuilder squareBuilder = new Shape().new HollowSquareBuilder(size);

		// Act
		squareBuilder.buildHollowSquare();
		char[][] actualSquare = squareBuilder.getHollowSquare();

		// Assert
		assertArrayEquals(expectedSquare, actualSquare);
	}

	@Test
	public void testBuildHollowSquare_Size5() {
		// Arrange
		int size = 5;
		char[][] expectedSquare = { { '*', '*', '*', '*', '*' }, { '*', ' ', ' ', ' ', '*' },
				{ '*', ' ', ' ', ' ', '*' }, { '*', ' ', ' ', ' ', '*' }, { '*', '*', '*', '*', '*' } };

		Shape.HollowSquareBuilder squareBuilder = new Shape().new HollowSquareBuilder(size);

		// Act
		squareBuilder.buildHollowSquare();
		char[][] actualSquare = squareBuilder.getHollowSquare();

		// Assert
		assertArrayEquals(expectedSquare, actualSquare);
	}
}
