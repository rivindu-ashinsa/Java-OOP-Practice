package Week4;

public class Circle {
    double radius = 1; 
    String color = "blue";

    public Circle(){

    }
    public Circle(double r){
        this.radius = r; 
    }
    public Circle(double r, String color){
        this.radius = r; 
        this.color = color;
    }

    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }

    public double getArea(){
        return radius * radius * Math.PI;

    }
    @Override
    public String toString(){
        return "Circle \n\t{ \n\t\tradius : " + radius + "\n\t\t Area : " + getArea() + "\n\t}" ;
    }
}   
