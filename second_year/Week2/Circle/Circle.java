package Circle;

public class Circle {
    private double radius; 
    private String color; 
    private double area ;
    public Circle(){
        this.radius = 1;
        this.color = "Blue";

    }

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, String color){
        this.radius = radius; 
        this.color = color;
    }
    public double getArea(){
        double area = this.radius * this.radius * 3.14;
        this.area = area;
        return area;
    }
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public void setColor(String color){
        this.color  = color;
    }
    public String getColor(){
        return this.color;
    }
   
@Override
public String toString(){
    return "Stduent{" + 
    "radius=" + radius + "\'" + 
    "area=" + color + "\'" +
    "area=" + area + "}";
    } 
}





