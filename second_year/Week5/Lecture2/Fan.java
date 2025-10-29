package Week5.Lecture2;

public class Fan implements SmartDevice{
    public String name; 
    public Fan(String name){
        this.name = name;
    }
    public void turnOn(){
        System.out.println("Turn on ");
    }
    public void turnOff(){
        System.out.println("Turning off ");
    }
    public void setTimer(){
        System.out.println("Setting up the timer");
    }
    
}
