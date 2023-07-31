package ua.org.com.alex.libs.shapebuilder;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class RectangleBuilderTest {

	@Test
	public void testBuildRectangle() {
		// Arrange
		int rows = 4;
		int columns = 6;
		char[][] expectedRectangle = { { '*', '*', '*', '*', '*', '*' }, { '*', '*', '*', '*', '*', '*' },
				{ '*', '*', '*', '*', '*', '*' }, { '*', '*', '*', '*', '*', '*' } };

		Shape.RectangleBuilder rectangleBuilder = new Shape().new RectangleBuilder(rows, columns);

		// Act
		rectangleBuilder.buildRectangle();
		char[][] actualRectangle = rectangleBuilder.getRectangle();

		// Assert
		assertArrayEquals(expectedRectangle, actualRectangle);
	}
}
