package main.advanced.inheritance;

import org.junit.jupiter.api.Test;

public class Tester {

    @Test
    public void test() {
        Vehicle plane = new Vehicle("plane", 50, "white", 300);
        System.out.println(plane);
        plane.info();
    }

    @Test
    public void test2() {

        System.out.println("---------------------");
        Car car = new Car("Audi", 5, "red", 260);
        System.out.println(car);
        car.info();
        car.color = "black";
        car.seatCapacity = 4;
        car.maxSpeed = 600;

        car.setName("Ford");
        System.out.println(car);
        car.info("sport");

        System.out.println(car.getMessage());

        //Polymorphism


        /*
        System.out.println(" porsche is Object: " +(porsche instanceof Object));
        System.out.println(" porsche is Vehicle: " +(porsche instanceof Vehicle));
        System.out.println(" porsche is Car: " +(porsche instanceof Car));
*/
    }

    @Test
    public void interface_test() {
        Car porsche = new Car("Porsche", 2,
                "orange", 300);
        Drivable.start();
        porsche.drive(50.5f);
        porsche.stop();
        porsche.clean("Premium");

    }
}
