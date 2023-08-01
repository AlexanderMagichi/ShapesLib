package ua.org.com.alex.libs;

import ua.org.com.alex.shapes.Circle;
import ua.org.com.alex.shapes.Shape;
import ua.org.com.alex.shapes.Square;
import ua.org.com.alex.shapes.Triangle;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CarConstructor {
	public List<Shape> generateRandomCar() {
		Shape circle = new Circle(5, false, '*', ' ');
		Shape square = new Square(6, true, 'X');
		List<Shape> shapes = new ArrayList<>();
		shapes.add(circle);
		shapes.add(square);
		List<Shape> result = new ArrayList<>();
		Random r = new Random();
		int amount = r.nextInt(4) + 1;
		for (int i = 0; i < amount; i++) {
			result.add(r.nextBoolean() ? circle : square);
		}
		return result;
	}
}


