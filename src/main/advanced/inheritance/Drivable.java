package main.advanced.inheritance;

public interface Drivable {
    void drive(float distanceInKm);

    default void stop(){
        System.out.println("Stopped!");
    }

    static void start(){
        System.out.println("Started!");
    }



}
