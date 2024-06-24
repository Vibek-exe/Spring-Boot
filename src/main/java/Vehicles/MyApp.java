package Vehicles;

public class MyApp {

    public static void main(String[] args){
        Vehicle vehicle = new Bus();
        String message = vehicle.getMileage();
        System.out.println(message);
    }
}
