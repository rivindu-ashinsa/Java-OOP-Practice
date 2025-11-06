/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personproject;

/**
 *
 * @author Barbara
 */
public class Student extends Person{
    
    private String ID;
    private String course;
    
    public Student(String name, String ID){
        super(name);
        this.ID = ID;   
    }
    
    public void setCourse(String course){
        this.course = course;
    }
    
    public String getCourse(){
        return course;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    
    
    
    
    
}
