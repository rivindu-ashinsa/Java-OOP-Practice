package Week6;

public abstract class LibraryItem{
    private String itemId;
    private String title; 
    private String auther;
    private boolean available;

    public LibraryItem(String itemId, String title, String auther, boolean available){
        this.itemId = itemId;
        this.title = title; 
        this.auther = auther;
        this.available = available;

    } 


    public String getItemId() {
        return itemId;
    }
    public String getTitle(){
        return title;
    }       

    public String getAuther(){
        return auther;
    }

    public boolean isAvailable(){
        return available;
    }

    abstract String getDetails();

    @Override
    public String toString(){
        return "Item ID : " + getItemId() + "Title : " + getTitle() + "Auther : " + getAuther() + "Available : " + isAvailable(); 
    }
}