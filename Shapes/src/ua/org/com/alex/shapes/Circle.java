package ua.org.com.alex.shapes;


public class Circle extends Shape {

    public Circle(int size, boolean isFilled, char symbol, char spaceSymbol) {
        super(size, isFilled, symbol, spaceSymbol);
    }

    public Circle(int size, boolean isFilled, char symbol) {
        super(size, isFilled, symbol);
    }

    @Override
    protected void drawShape() {
        System.out.println(" **** ");
        System.out.println("******");
        System.out.println(" **** ");
    }

    public void specialCircleMethod(){
        System.out.println("specialCircleMethod");
    }

}
