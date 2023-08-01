package ua.org.com.alex.libs.shapebuilder;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TriangleBuilderTest {

    @Test
    public void testBuildTriangle() {
        // Arrange
        int size = 4;
        char[][] expectedTriangle = {
            { '*', ' ', ' ', ' ' },
            { '*', '*', ' ', ' ' },
            { '*', '*', '*', ' ' },
            { '*', '*', '*', '*' }
        };

        Shape shape = new Shape(); 
        Shape.TriangleBuilder triangleBuilder = shape.new TriangleBuilder(size); 

        // Act
        triangleBuilder.buildTriangle();
        char[][] actualTriangle = triangleBuilder.getTriangle();

        // Assert
        assertArrayEquals(expectedTriangle, actualTriangle);
    }
}
