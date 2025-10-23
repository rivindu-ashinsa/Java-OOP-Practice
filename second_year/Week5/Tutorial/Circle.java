/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week5.Tutorial;

import javax.swing.plaf.basic.BasicBorders.RadioButtonBorder;

/**
 *
 * @author Barbara
 */
public class Circle extends GeometricObject {

    protected double radius;
    
    public Circle(){
        colour = "blue";
        filled = false;
        radius = 1;
    }
    
    public Circle(double radius){
        colour = "blue";
        filled = false;
        this.radius = radius;
    }
    
    public Circle(double radius, String colour, boolean filled){
        this.colour = colour;
        this.filled = filled;
        this.radius = radius;
    }
    
    public void setRadius(double radius){
        this.radius = radius;
    }
    
    public double getRadius(){
        return radius;
    }
    @Override
    public double getArea(){
        return Math.PI * radius * radius;
    }
    
    @Override
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }
    @Override
    public String getShape(){
        return "Shape : " + getShape() + " Radius : " + radius + super.toString();
    }
}


