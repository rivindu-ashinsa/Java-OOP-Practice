package Week5.Tutorial;

public class Square extends GeometricObject {
    protected double side; 

    public Square(){
        this.side = 1;
    }

    public Square(double side){
        this.side = side;
    }
    public Square(double side, boolean filled, String colour){
        super(colour, filled);
        this.side = side; 
        this.filled = filled;
    }

    @Override
    public double getArea(){
        return side * side;
    };
    @Override
    public double getPerimeter(){
        return side * 4;
    };

    @Override
    public  String getShape(){
        return getShape();
    };

    
}
