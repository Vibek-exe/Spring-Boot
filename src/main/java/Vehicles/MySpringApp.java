package Vehicles;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringApp {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
        Vehicle vehicle =  context.getBean("myVehicle",Vehicle.class);
        System.out.println(vehicle.getMileage());

    }
}
