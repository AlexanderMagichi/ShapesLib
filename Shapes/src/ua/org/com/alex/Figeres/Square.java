package ua.org.com.alex.Figeres;

import ua.org.com.alex.parentsclasses.SuperShapes;

public class Square extends SuperShapes {

	protected Square(String name, int size, char pouring, char fillsymbol) {
		super(name, size, pouring, fillsymbol);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculatePerimeter() {
		return 4 * getSize();
	}

	@Override
	public double calculateArea() {
		return getSize() * getSize();
	}

	// -------------
}
