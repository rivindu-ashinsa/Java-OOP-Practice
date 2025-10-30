package Week6;

public class Book extends LibraryItem{
    private String isbn; 
    private int publishedYear; 

    public Book(String itemId, String title, String auther, boolean available){
        super(itemId, title, auther, available);     
    }   
    public String getDetails(){
        return "";
    }
}