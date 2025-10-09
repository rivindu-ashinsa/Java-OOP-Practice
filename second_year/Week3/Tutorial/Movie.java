package Tutorial;

public class Movie {
    private String category; 
    private String title; 
    private Director director; 
    private int numAward; 
    
    public Movie(String title, String category, Director director){
        this.title = title; 
        this.category = category;
        this.director = director; 
    }

    public String getTitle(){
        return title;
    }
    public String getCategory(){
        return category;
    }

    public String getDirector(){
        return director.getDirectorInfo();
    }

    public void setNumAward(int numAward){
        this.numAward = numAward;
    }

    public int getNumAwarad(){
        return numAward;
    }

    @Override
    public String toString(){
        return "Movie{" + 
    "Title=" + title + " " + 
    "Category=" + category + " " +
    "Director{\n" + director.getDirectorInfo() + "}";
    }
}
