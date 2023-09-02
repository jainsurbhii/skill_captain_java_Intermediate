public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}
class Product{
    private String productId;
    private String productName;
    private String description;
    private String manufacturer;
    private int warrantyPeriod;

    public Product(String productId,String productName, String description, String manufacturer, int warrantyPeriod){
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
