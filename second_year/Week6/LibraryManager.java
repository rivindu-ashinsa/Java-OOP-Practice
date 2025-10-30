package Week6;

public interface LibraryManager {
    void addItem(LibraryItem item);
    void removeItem(String id); 
    void listItems();
    void addMemeber(Member m);
    void borrowBook(String mid, String id);
    void returnBook(String mid, String id);
    void runMenu();
    void runGUI();
}