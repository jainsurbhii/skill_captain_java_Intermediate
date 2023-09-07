import java.util.ArrayList;//import ArrayList
import java.util.List;//import List
import java.util.Scanner;// Import the Scanner class to take input

//Product input
class Product{
    private String productId;
    private String productName;
    private double price;
    private int quantity;

    //Constructor
    Product(String productId,String productName,double price,int quantity){
        this.productId=productId;
        this.productName=productName;
        this.price=price;
        this.quantity=quantity;
    }
    //Getter
    public String  getproductId(){
        return productId;
    }
    public String getProductName(){
        return productName;
    }

    public double getPrice() {
        return price;
    }
    public int getQuantity(){
        return quantity;
    }
}
class Cart{
    private List<Product> CartList;

    public Cart(){
        CartList =new ArrayList<>();
    }
    public void addToCart(Product product){
        CartList.add(product);
        System.out.println("product added to the cart");
    }
    public void removeFromCart(Product product){
        CartList.remove(product);
        System.out.println("product removed from the cart");
    }
    public void updateQuantity(Product product, int quantity){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the quantity to Update");
        quantity= scan.nextInt();
        product.getQuantity();

    }
    public void viewCart(){
        System.out.println("Cart details are:");
        for (Product product: CartList){
            System.out.println(product.getProductName());
            System.out.println(product.getproductId());
            System.out.println(product.getPrice());
            System.out.println(product.getQuantity());
        }

    }
    public void checkout(){
        if (CartList.isEmpty()){
            System.out.println("Your cart is Empty");
        }
        else {
            System.out.println("Cart Items");
            for (Product product: CartList){
                System.out.println("Product Name: "+product.getProductName());
                System.out.println("Product ID: "+product.getproductId());
                System.out.println("Price: "+product.getPrice());
                System.out.println("Quantity: "+product.getQuantity());
            }
        }
    }
}
public class Main {

    public static void main(String[] args) {
        String keepShopping;
        double totalPrice = 0;
        Cart cart=new Cart();//Create Cart
        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("Enter the Product Id: ");
            String productId = scan.next();
            System.out.print("Enter the Product Name: ");
            String productName = scan.next();
            System.out.print("Enter the Price: ");
            double price = scan.nextDouble();
            System.out.print("Enter the Quantity: ");
            int quantity = scan.nextInt();
            totalPrice = (price * quantity);
            Product product = new Product(productId, productName, price, quantity);
            cart.addToCart(product);//Add product
            System.out.println("Do you want to Update the Quantity:"+ "(Yes/No)?");
            String updateQuantity=scan.next();
            if(updateQuantity.equalsIgnoreCase("yes")){
                cart.updateQuantity(product,quantity);//Update the quantity
            }
            System.out.println("Do you want to Remove item from Cart:"+ "(Yes/No)?");
            String removeCart=scan.next();
            if(removeCart.equalsIgnoreCase("yes")){
                cart.removeFromCart(product);//Remove the quantity
            }
            cart.viewCart();//View the cart
            cart.checkout();//checkout
            System.out.println("Would you like to continue shopping "
                    + "(Yes/No)?");
            keepShopping = scan.next();
        }
        while (keepShopping.equalsIgnoreCase("yes"));{
            System.out.println("Please pay Rs:" + totalPrice);
        }
        scan.close();
    }
}