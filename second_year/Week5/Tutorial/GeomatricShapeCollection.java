package Week5.Tutorial;

public class GeomatricShapeCollection implements ShapeCollection{
    private GeometricObject[] shapeList; 
    private int maxNumShape; 
    public static int totalNumShape = 0; 

    public GeomatricShapeCollection(int listLenght){
        this.maxNumShape = listLenght;
        shapeList = new GeometricObject[maxNumShape];
    }

}
