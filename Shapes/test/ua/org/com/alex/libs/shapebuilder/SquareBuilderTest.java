package ua.org.com.alex.libs.shapebuilder;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SquareBuilderTest {

    @Test
    public void testBuildSquare() {
        // Arrange
        int size = 4;
        char[][] expectedSquare = {
            { '*', '*', '*', '*' },
            { '*', '*', '*', '*' },
            { '*', '*', '*', '*' },
            { '*', '*', '*', '*' }
        };

        Shape.SquareBuilder squareBuilder = new Shape().new SquareBuilder(size);

        // Act
        squareBuilder.buildSquare();
        char[][] actualSquare = squareBuilder.getSquare();

        // Assert
        assertArrayEquals(expectedSquare, actualSquare);
    }
}
