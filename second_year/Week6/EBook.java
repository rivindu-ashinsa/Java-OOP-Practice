package Week6;

public class EBook extends LibraryItem{
    private String downloadLink ;
    private double fileSizeMB; 

    public EBook(String itemID, String title, String auther, boolean available, String downloadLink, double fileSizeMB){
        super(itemID, title, auther, available);
        this.downloadLink = downloadLink; 
        this.fileSizeMB = fileSizeMB;
    }
    @Override
    public String getDetails(){
        return ""; 
    }
}