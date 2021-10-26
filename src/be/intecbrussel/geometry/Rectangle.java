package be.intecbrussel.geometry;

public class Rectangle {
    //Hoofdstuk 8 Opdracht 1 en 3
    public final String DESCRIPTION = "Rectangle";
    private double height;
    private double width;
    private double xCoordinate;
    private double yCoordinate;
    private int count = 0;//instance variable
   private static int amountOfRectanglesCreated = 0;

    {
        //initialization block
        //it executes when we make an object
        //execute before the constructor
        // System.out.println("Rectangle is created");
        count++;
        amountOfRectanglesCreated++;

       // System.out.println("static variable " + staticCount);
       // System.out.println("instance variable " + count);
    }
public static int getAmountOfRectanglesCreated(){
        return amountOfRectanglesCreated;
}
public int getCount(){
        return count;
}

    //Opdraht 7 part 1
    public Rectangle(double height, double width) {
        this(height, width, 0, 0);

    }

    public Rectangle(double side) {

        this(side, side); //
    }

    public Rectangle() {

        this(1, 1); // the reason of calling a constructor indirectly is to give only one default value.
    }

    //Opdracht 7 part 3
    public Rectangle(double height, double width, double xCoordinate, double yCoordinate) {
        setHeight(height);
        setWidth(width);
        setxCoordinate(xCoordinate);
        setyCoordinate(yCoordinate);
    }

    //Opdracht 7 last part
    // to copy a rectangle
    // Copy constructor
    public Rectangle(Rectangle rectangleToCopy) {
        this(rectangleToCopy.getHeight(), rectangleToCopy.getWidth(), rectangleToCopy.getX(), rectangleToCopy.getY());

    }

    public void setHeight(double height) {
        // this.height = height>0?height:-height;
        this.height = Math.abs(height);

    }

    public void setWidth(double width) {
        this.width = Math.abs(width);//good way to get positive value

    }

    public void setxCoordinate(double x) {
        this.xCoordinate = x;

    }

    public void setyCoordinate(double y) {
        this.yCoordinate = y;

    }


    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getX() {
        return xCoordinate;

    }

    public double getY() {
        return yCoordinate;
    }

    //Opdracht 4 last part
    public void grow(int growFactor) {

        height = takeAbsoluteValue(height + growFactor);
        width = takeAbsoluteValue(width + growFactor);
    }

    //Opdracht 5
    public double getArea() {

        return height * width;
    }

    public double getPerimeter() {

        return (height + width) * 2;
    }

    private double takeAbsoluteValue(double value) {
        double absoluteValue = Math.abs(value);//private methods are helping methods
        return absoluteValue;
    }
}
