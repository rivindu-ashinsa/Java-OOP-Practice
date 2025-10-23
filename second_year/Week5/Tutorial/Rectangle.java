/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week5.Tutorial;


public class Rectangle extends GeometricObject{
    
    protected double length;
    protected double width;
    
    public Rectangle(){
        colour = "blue";
        filled = false;
        length = 1;
        width = 1;
    }
    
    public Rectangle(double length, double width){
        colour = "blue";
        filled = false;
        this.length = length;
        this.width = width;
    }
    
    public Rectangle(double length, double width, String colour, boolean filled){
        this.colour = colour;
        this.filled = filled;
        this.length = length;
        this.width = width;
    }
    
    public void setLength(double length){
        this.length = length;
    }
    
    public double getLength(){
        return length;
    }
    
    public void setWidth(double width){
        this.width = width;
    }
    
    public double getWidth(){
        return width;
    }
    @Override
    public double getArea(){
        return width * length;
    };
    @Override
    public double getPerimeter(){
        return (width * 2) + (length * 2);
    };
    @Override
    public String getShape(){
        return getShape();
    };
   
}
