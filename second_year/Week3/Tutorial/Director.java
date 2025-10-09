package Tutorial;
public class Director {
    private String name; 
    private String surname; 
    private int numDirectedMovie; 
    private Date dob; 

    public Director(String name, String surname){
        this.name = name; 
        this.surname = surname; 
    }
    public String getName(){
        return name; 
    }
    public String getSurname(){
        return surname; 
    }
    public Date getDob(){
        return dob; 
    }
    public void setDob(Date dob){
        this.dob = dob; 
    }
    public int getNumberOfMovie(){
        return numDirectedMovie; 
    }
    public void setNumberOfMovie(int numberOfMovie){
        this.numDirectedMovie = numberOfMovie; 
    }

    public String getDirectorInfo(){
        return toString();
    }

    @Override
    public String toString(){
    return "Director{" + 
    "Name=" + name + " " + 
    "Surname=" + surname + " " +
    "DOB=" + dob.getDate() + "}";
    } 
}
