package Circle;

public class TutorialCircle {
    public static void main(String aras[]){
        Circle circle = new Circle(20);
        System.out.println("Area : " + circle.getArea());
        Circle circle2 = new Circle();
        circle2.setRadius(49);  
        System.out.println(circle2.getArea());  
        System.out.println(circle2.getColor());
        circle.setColor("red");
        System.out.println(circle.toString());

    }
}


