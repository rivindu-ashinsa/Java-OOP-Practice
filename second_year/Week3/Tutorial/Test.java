package Tutorial;

public class Test {

    public static void main(String args[]){
        Director director = new Director("FirstName", "LastName");
        Date dob = new Date(12, 12, 2005);
        director.setDob(dob);
        director.setNumberOfMovie(12);
        Movie movie  = new Movie("Ironman", "adventure", director);
        System.out.println(movie.toString());
    }
}
