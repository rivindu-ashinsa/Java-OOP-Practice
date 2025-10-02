package OOP_lib;

class Book{
    private String title;
    private String author;
    private int availableCopies;

    public Book(String title, String author, int availableCopies){
        this.title = title;
        this.author = author;
        this.availableCopies = availableCopies;
    }
    
    public void settitle(String title){
        this.title = title;
    }
    public String gettitle(){
        return title;
    }
    public void setauthor(String author){
        this.author = author;
    }
    public String getauthor(){
        return author;
    }
    public void setavailableCopies(int availableCopies){
        this.availableCopies = availableCopies;
    }
    public int getavailableCopies(){
        return availableCopies;
    }

    public void borrowBook(){
        if (availableCopies > 0){
            availableCopies -= 1;
            System.out.println(title + " Book borrowed successfully" );
        }
        else{
            System.out.println("Book not available");
        }
    }
    public void returnBook(){
        availableCopies += 1;
        System.out.println(title + " Book returned successfully");
    }

}    


public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Harry Potter", "J.K. Rowling", 5);
        Book book2 = new Book("The Alchemist", "Paulo Coelho", 3);
        Book book3 = new Book("The Da Vinci Code", "Dan Brown", 2);
        Book book4 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1);
        Book book5 = new Book("The Catcher in the Rye", "J.D. Salinger", 0);

        book1.borrowBook();
        book2.borrowBook();
        book3.borrowBook();
        book4.borrowBook();
        book5.borrowBook();
        book1.returnBook();
        book2.returnBook();
        book3.returnBook();
        book4.returnBook();
        book5.returnBook();
    }
}
