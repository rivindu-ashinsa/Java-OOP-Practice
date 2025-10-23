package Week5.Lecture2;

public class AC implements SmartDevice {
    @Override 
    public void turnOn(){
        System.out.println("turning on");
    }
    @Override
    public void turnOff(){
        System.out.println("turning off");
    }

    @Override
    public void setTimer(){
        System.out.println("Setting up timer");
    }
}

