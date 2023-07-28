package ua.org.com.alex.libs.shapebuilder;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ReverseTriangleBuilderTest {

    @Test
    public void testReverseTriangleBuilder() {
        // Test case 1
        {
            int size = 4;
            char[][] expectedReverseTriangle = {
                {' ', ' ', ' ', '*'},
                {' ', ' ', '*', '*'},
                {' ', '*', '*', '*'},
                {'*', '*', '*', '*'}
            };

            Shape.ReverseTriangleBuilder reverseTriangleBuilder = new Shape().new ReverseTriangleBuilder(size);

            reverseTriangleBuilder.buildReverseTriangle();
            char[][] actualReverseTriangle = reverseTriangleBuilder.getReverseTriangle();

            assertArrayEquals(expectedReverseTriangle, actualReverseTriangle);
        }

        // Test case 2
        {
            int size = 5;
            char[][] expectedReverseTriangle = {
                {' ', ' ', ' ', ' ', '*'},
                {' ', ' ', ' ', '*', '*'},
                {' ', ' ', '*', '*', '*'},
                {' ', '*', '*', '*', '*'},
                {'*', '*', '*', '*', '*'}
            };

            Shape.ReverseTriangleBuilder reverseTriangleBuilder = new Shape().new ReverseTriangleBuilder(size);

            reverseTriangleBuilder.buildReverseTriangle();
            char[][] actualReverseTriangle = reverseTriangleBuilder.getReverseTriangle();

            assertArrayEquals(expectedReverseTriangle, actualReverseTriangle);
        }

        // Test case 3
        {
            int size = 1;
            char[][] expectedReverseTriangle = {
                {'*'}
            };

            Shape.ReverseTriangleBuilder reverseTriangleBuilder = new Shape().new ReverseTriangleBuilder(size);

            reverseTriangleBuilder.buildReverseTriangle();
            char[][] actualReverseTriangle = reverseTriangleBuilder.getReverseTriangle();

            assertArrayEquals(expectedReverseTriangle, actualReverseTriangle);
        }
    }
}
