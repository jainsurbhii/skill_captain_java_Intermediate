import java.util.ArrayList;//import ArrayList
import java.util.InputMismatchException;//Import Mismatch exception
import java.util.List;//import List
import java.util.Scanner;// Import the Scanner class to take input

public class Main {

    public static void main(String[] args) {

        try {
            ProductRegistrationSystem productRegistrationSystem;
            productRegistrationSystem = new ProductRegistrationSystem();
            Scanner sc = new Scanner(System.in);
            boolean exist = true;
            //while loop will run until it is false
            while (exist) {
                System.out.println("Enter your choice 1-5");
                System.out.println("1:Register Product");
                System.out.println("2:Display product");
                System.out.println("3:Search Product");
                System.out.println("4:Generate Report");
                System.out.println("5:Exist");
                int Choice = sc.nextInt();

                switch (Choice) {
                    //Add the products
                    case 1 -> {
                        System.out.println("Enter Product Id");
                        String productId = sc.next();
                        System.out.println("Enter Product Name");
                        String productName = sc.next();
                        System.out.println("Enter Description");
                        String description = sc.next();
                        System.out.println("Enter Manufacturer");
                        String manufacturer = sc.next();
                        System.out.println("Enter Warranty Period");
                        int warrantyPeriod = sc.nextInt();
                        Product product = new Product(productId, productName, description, manufacturer, warrantyPeriod);
                        ProductRegistrationSystem.addProduct(product);
                        System.out.println("Register Successfully");
                    }
                    //Display all the products
                    case 2 -> ProductRegistrationSystem.displayProduct();
                    //Search product with input value
                    case 3 -> {
                        System.out.println("Enter Product Id to Search: ");
                        String SearchproductId = sc.next();
                        productRegistrationSystem.searchProduct(SearchproductId);
                    }
                    //Generate Report
                    case 4 -> productRegistrationSystem.generateReport();
                    //Exist from while loop
                    case 5 -> {
                        System.out.println("Are you sure you want to exist..");
                        System.out.println("Yes or No");
                        String input = sc.next();
                        if (input.equalsIgnoreCase("yes")) {
                            exist = false;
                            System.out.println("Exist Successfully");
                        } else {
                            exist = true;
                        }
                    }
                    default -> System.out.println("Invalid choice");
                }
                sc.close();
            }
            //If user enters String then go to catch block
        } catch (InputMismatchException e){
            System.out.println("Please enter Valid Input");
        }

    }

}
//Product input
class Product {
    String productId;
    String productName;
    String description;
    String manufacturer;
    int warrantyPeriod;

    public Product(String productId, String productName, String description, String manufacturer, int warrantyPeriod){
        this.productId=productId;
        this.productName=productName;
        this.description=description;
        this.manufacturer=manufacturer;
        this.warrantyPeriod=warrantyPeriod;
    }
    public String getProductId(){
        return productId;
    }
    public String getProductName(){
        return productName;
    }
    public String getDescription(){
        return description;
    }
    public String getManufacturer(){
        return manufacturer;
    }
    public int getWarrantyPeriod(){
        return warrantyPeriod;
    }

}
//ProductRegistrationSystem
class ProductRegistrationSystem {
    //Create array list
    private static List<Product> productList;
    public ProductRegistrationSystem(){
        productList=new ArrayList<>();
    }
    //add the data in array List
    public static void addProduct(Product product){
        productList.add(product);
    }
    //To display all the Product
    public static void displayProduct(){
        System.out.println("Product details are:");
        for (Product product:productList){
            System.out.println("Product Name: "+ product.getProductName());
            System.out.println("Product Id"+product.getProductId());
            System.out.println("Description: "+ product.getDescription());
            System.out.println("Manufacturer: " + product.getManufacturer());
            System.out.println("Warranty Period: "+product.getWarrantyPeriod());
            System.out.println("");
        }
    }
    //To Search all the Product
    public static void searchProduct(String productId){
        for (Product product:productList){
            if(product.getProductId().equalsIgnoreCase(productId)){
                System.out.println("Product details for Product Id: " + product.productId);
                System.out.println("Product Name: " + product.getProductName());
                System.out.println("Description: " +product.getDescription());
                System.out.println("Manufacturer: " +product.getManufacturer());
                System.out.println("Warranty Period: "+product.getWarrantyPeriod());
            }

        }

    }
    //To generate the report
    public static void generateReport(){
        int warrantyStatusActive=0;
        int warrantyStatusExpired=0;

        for (Product product:productList) {
            if (product.getWarrantyPeriod()>=0){
                warrantyStatusActive++;
            }
            else {
                warrantyStatusExpired++;
            }
        }

        System.out.println("Warranty Status (Active): " + warrantyStatusActive);
        System.out.println("warranty Status (Expired): " + warrantyStatusExpired);

    }
}
