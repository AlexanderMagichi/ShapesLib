package ua.org.com.alex.shapes;

public abstract class Shape {
    protected int size;
    protected boolean isFilled;
    protected char symbol;
    protected char spaceSymbol;

    public char[][] getShapeArray() {
        return shapeArray;
    }

    protected char[][] shapeArray;

    public Shape(int size, boolean isFilled, char symbol, char spaceSymbol) {
        this.size = size;
        this.isFilled = isFilled;
        this.symbol = symbol;
        this.spaceSymbol = spaceSymbol;
    }

    public Shape(int size, boolean isFilled, char symbol) {
        this(size, isFilled, symbol, ' ');
    }

    protected abstract void drawShape();

    public void printShape(){
        String line = generateLine();
        System.out.println(line);
        drawShape();
        System.out.println(line);
    }


    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public char getSpaceSymbol() {
        return spaceSymbol;
    }

    public void setSpaceSymbol(char spaceSymbol) {
        this.spaceSymbol = spaceSymbol;
    }

    private String generateLine() {
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < size; i++) {
            sb.append("=");
        }
        return sb.toString();
    }


}