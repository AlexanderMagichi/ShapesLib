package ua.org.com.alex.anotherclient;

import ua.org.com.alex.libs.CarConstructor;
import ua.org.com.alex.shapes.Shape;

import java.util.List;

public class Main {
	public static void main(String[] args) {
		CarConstructor hc = new CarConstructor();
		List<Shape> shapes = hc.generateRandomCar();

		for (int i = 0; i < shapes.size(); i++) {
			Shape shape = shapes.get(i);
		}

	}
}
