package Week4;

public class Main {
    public static void main(String args[]){
        Circle circle = new Circle(21);
        System.out.println(circle.toString());
        Cylinder cylinder = new Cylinder(5);
        System.out.println("Cylinder \n" + "radius = " + cylinder.getRadius() + " Height : " + cylinder.getHeight() + "\nVolume : " + cylinder.getVolume());
    }    
}
