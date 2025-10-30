package Week6;

public class Book extends LibraryItem{
    private String isbn; 
    private int publishedYear; 

    public Book(String itemId, String title, String auther, boolean available, String isbn, int publishedYear){
        super(itemId, title, auther, available);     
        this.isbn = isbn;
        this.publishedYear = publishedYear;
    }   
    @Override
    public String getDetails(){
        return "";
    }
}