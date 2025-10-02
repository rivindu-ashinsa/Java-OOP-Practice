package Week1;

public class Student{
    public String name; 
    private int age;
    public Student(String name, int age){
        this.name = name; 
        this.age = age ;
    } 
    public void setName(String name){
        this.name = name; 
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age; 
    }


@Override
public String toString(){
    return "Stduent{" + 
    "name=" + name + "\'" + 
    "age=" + age + "}";
    } 
}
