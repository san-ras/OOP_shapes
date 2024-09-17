package lt.techin;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Square sq1 = new Square(6);
        Square sq2 = new Square();
        Square sq3 = new Square(5, "green", false);

        Rectangle rec1 = new Rectangle(6, 2);
        Rectangle rec2 = new Rectangle();
        Rectangle rec3 = new Rectangle(3, 5, "green", false);

        Circle cir1 = new Circle(2.4);
        Circle cir2 = new Circle();
        Circle cir3 = new Circle("green", false, 1.5);

        Triangle tri1 = new Triangle();
        Triangle tri2 = new Triangle(3, 2, 3);
        Triangle tri3 = new Triangle("green", false, 4, 4, 4);

        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(sq1);
        shapes.add(sq2);
        shapes.add(sq3);
        shapes.add(tri1);
        shapes.add(tri2);
        shapes.add(tri3);
        shapes.add(cir1);
        shapes.add(cir2);
        shapes.add(cir3);
        shapes.add(rec1);
        shapes.add(rec2);
        shapes.add(rec3);

        for (Shape shape : shapes) {
            System.out.println(shape.toString());
            System.out.print("Shape's area is: ");
            System.out.print(shape.getArea() + "\n");
        }

        double maxPerimeter = 0;
        int index = -1;
        ArrayList<Square> squares = new ArrayList<>();

        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i).getPerimeter() > maxPerimeter) {
                maxPerimeter = shapes.get(i).getPerimeter();
                index = i;
            }
            if (shapes.get(i).getClass() == Square.class) {
                squares.add((Square) shapes.get(i));
            }
        }
        System.out.println("The shape with the biggest perimeter of " + maxPerimeter + " is:");
        System.out.println(shapes.get(index).toString());

        for (Square square : squares) {
            System.out.print("The side of this square is: " + square.getSide() + "\n");
        }
    }
}
