package be.intecbrussel.geometry;

public class Polymorphism {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Rectangle rectangularSquare = new Square();
        rectangularSquare.setWidth(30);
        System.out.println(rectangularSquare.getHeight() + " - " +rectangularSquare.getWidth());
    }
}
