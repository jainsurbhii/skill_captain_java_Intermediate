import java.util.Scanner;

class Vehicle {
    String brand="TATA";
    String model="XUV";
    int year=2022;
    double price=10;


    public void VehicleDetails(){
        System.out.println("Brand"+brand);
        System.out.println("Model"+model);
        System.out.println("Year"+year);
        System.out.println("Price"+price + "Lakh");

}

}
class Car extends Vehicle {
    int numberOfSeats;

    Car(int numberOfSeats) {
        this.numberOfSeats=numberOfSeats;

    }
    public void NoOfSeats(){
        System.out.println("numberOfSeats"+numberOfSeats);

    }

}
class Motorcycle extends Vehicle {
    int engineCapacity;
    Motorcycle(int engineCapacity){
        this. engineCapacity=engineCapacity;
    }

    public void engineCapacity(){
        System.out.println("engineCapacity"+engineCapacity);

    }
}
class VehicleDetails {
    public static void main(String[] args) {
        Car myCar = new Car(4);
        System.out.println("Car Details");
        myCar.VehicleDetails();
        myCar.NoOfSeats();
        System.out.println("Motorcycle Details");
        Motorcycle Bike= new Motorcycle(5);
        Bike.VehicleDetails();
        Bike.engineCapacity();

    }
}