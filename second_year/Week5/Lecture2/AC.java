    package Week5.Lecture2;

    public class AC implements SmartDevice,NormalDevice {
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
        public void setTemperature(){
            System.out.println("Temperature is setting");
        }
        @Override
        public void plugIn(){
            System.out.println("Plugging IN");
        }
        @Override
        public void plugOut(){
            System.out.println("Plugged out");
        }
    }

