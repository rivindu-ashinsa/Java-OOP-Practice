package Week4;

public class Cylinder extends Circle {
    private double height = 1.0; 
    public Cylinder(){

    }
    public Cylinder(double height){
        super();
        this.height = height;
    }
    public Cylinder(double height, double radius){
        super(radius);
        this.height = height;
        this.radius = radius;
    }
    public Cylinder(double height, double radius, String color){
        super(radius, color);
        this.height = height;
        this.radius = radius;
        this.color = color;
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public double getVolume(){
        return getArea() * height;
    }
}
