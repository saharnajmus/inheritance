package be.intecbrussel.geometry;

public class Square extends Rectangle{
    public final String DESCRIPTION = "Square";
    @Override
    public void setHeight(double height){
       setSide(height);

    }
    @Override
    public void setWidth(double width){
       setSide(width);

    }
    public void setSide(double side){
        super.setHeight(side);
        super.setWidth(side);

    }
}
