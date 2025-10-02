package Person;

public class Person {
    private String name; 
    private String surname;
    private int age; 


    public Person(String name){                     
        this.name = name; 
        
    }
    public void displayName(){
        System.out.println(this.name);
    }
    public void setSurName(String surname){
        this.surname = surname;         
    }
    public void setAge(int age){
        this.age = age;
    }

    public String getSurName(){
        return this.surname;    
    }
    public int getAge(){
        return this.age;
    }
    
}
