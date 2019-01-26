package main.advanced.inheritance;

public class Car extends Vehicle implements Drivable ,Cleanable{

    public Car(String name, int seatCapacity, String color, float maxSpeed) {
        super(name, seatCapacity, color, maxSpeed);
    }

    @Override
    public void info() {
        System.out.println("This is a car");
    }
    public void info(String carType) {
        System.out.println("This is a  "+carType+" car");
    }

    @Override
    public String toString() {
        return String.join(" | ","CAR",getName(),
                seatCapacity+" seats",color,maxSpeed+" km/h");
    }

    protected String  getMessage (){
        return "Message from CAR";
    }

    @Override
    public void drive(float distanceInKm) {
        System.out.println("drove "+distanceInKm+" km");
    }

    @Override
    public void clean( String cleanType) {
        System.out.println(getName()+" cleaned " + cleanType);
    }

}
