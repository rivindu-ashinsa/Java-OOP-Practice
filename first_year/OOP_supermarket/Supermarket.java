package OOP_supermarket;


class Product{
    private String name;
    private double price;
    private int stockQuantity;

    public Product(String name, double price, int stockQuantity){
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    public boolean isAvailable(){
        return stockQuantity > 0;
    }
    public void sellProduct(int quantity){
        if (stockQuantity >= quantity){
            stockQuantity -= quantity;
        }
    }
    public int getPrice(){
        return (int)price;
    }
    @Override
    public String toString(){
        return name + " : " + price + " : " + stockQuantity;
    }
}


class Cart{
    private Product[] cartItems;
    private int itemCount;
    private int totalPrice;
    public Cart(){
        this.cartItems = new Product[5];
        this.itemCount = 0;
    }
    public void addProduct(Product product){
        if (itemCount < cartItems.length){
            cartItems[itemCount] = product;
            itemCount++;
        }
     
    }
    public void displayCart(){
        for (Product product : cartItems){
            if (product != null){
                System.out.println(product);
                totalPrice += product.getPrice();
            }
        }
        System.out.println("Total Price: " + totalPrice);
    }
}


public class Supermarket {
    public static void main(String[] args){
        Product product1 = new Product("Milk", 1.5, 10);
        Product product2 = new Product("Bread", 1.0, 20);
        Product product3 = new Product("Eggs", 2.0, 30);
        Cart cart = new Cart();
        cart.addProduct(product1);
        cart.addProduct(product2);  
        cart.addProduct(product3);
        cart.displayCart();
    }
}
