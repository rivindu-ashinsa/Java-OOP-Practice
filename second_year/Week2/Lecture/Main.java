package Lecture;

import java.util.ArrayList;

import javax.sound.midi.SysexMessage;

public class Main {
    public static void main(String args[]){
        Student student = new Student("sample_name", 10);
        System.out.println(student.toString());
        student.displayInfo();
        
        
    }
    
}
