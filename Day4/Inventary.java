import java.util.ArrayList;
import java.util.List;

abstract class Vehicle {
    private String make;
    private String model;
    private int year;
    private double price;


    public Vehicle(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }
    public String getMake()
    {
        return make;
    }
    public String getModel()
    {
        return model;
    }
    public int getYear()
    {
        return year;
    }
    public double getPrice()
    {
        return price;
    }

    public abstract void displayDetails();

}
class Car extends Vehicle {
    protected int numDoors;
    protected String fuelType;

    public Car(String make, String model, int year, double price, int numDoors, String fuelType){
        super(make, model, year, price);
        this.numDoors=numDoors;
        this.fuelType=fuelType;
    }
    @Override
    public void displayDetails(){
        System.out.println("Car Details");
        System.out.println(getMake());
        System.out.println(getModel());
        System.out.println(getYear());
        System.out.println(getPrice());
        System.out.println(numDoors);
        System.out.println(fuelType);

    }
    public double calculateMileage(){
        return 0;
    }

}
class Motorcycle extends Vehicle {
    protected boolean hasSidecar;
    protected int engineCapacity;

    public Motorcycle(String make, String model, int year, double price, boolean hasSidecar, int engineCapacity){
        super(make, model, year, price);
        this.hasSidecar=hasSidecar;
        this.engineCapacity=engineCapacity;
    }
    @Override
    public void displayDetails() {
        System.out.println("Motorcycle Details");
        System.out.println(getMake());
        System.out.println(getModel());
        System.out.println(getYear());
        System.out.println(getPrice());
        System.out.println(hasSidecar);
        System.out.println(engineCapacity);

    }
    public double calculateSpeed(){
        return 0;
    }
}
public class Inventary {

    public static void main(String[] args) {
        List<Vehicle> inventory = new ArrayList<>();
        inventory.add(new Car("Toyota", "Corolla", 2020, 950000.0, 4, "Petrol"));
        inventory.add(new Motorcycle("TVS", "pep+", 2021, 90000.0, false, 500));

        for (Vehicle vehicle:inventory){
            vehicle.displayDetails();
        }
    }

}
