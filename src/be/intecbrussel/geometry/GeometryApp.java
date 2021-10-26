package be.intecbrussel.geometry;

public class GeometryApp {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(10);
        rectangle.setWidth(15);
        System.out.println(rectangle.getHeight() + " _ " + rectangle.getWidth());
        Square square = new Square();
        square.setHeight(10);
        square.setWidth(15);
        square.setSide(99);
        System.out.println(square.getHeight() + " _ " + square.getWidth());

    }
}
