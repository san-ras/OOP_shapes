package lt.techin;

public class Square extends Rectangle {

    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getLength();
    }

    //instead of setWidth and setLength maybe it is better to have setSide?
    public void setSide(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public String toString() {
        return "A Square is a subclass of " + super.toString();
    }
}
