/*
 * Author: Dahir Muhammad Dahir
 * Date: 04-June-2019 11:38 PM
 * About: I will tell you later
 */


public class Bicycles {

    // fields
    private int cadence;
    private int gear;
    private int speed;

    static String status = "Cool";

    // Constructor
    Bicycles(int startCadence, int startSpeed, int startGear){
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }

    Bicycles(){
        gear = 1;
        cadence = 10;
        speed = 0;
    }

    // Methods
    public void setCadence(int value){
        cadence = value;
    }

    public void setGear(int value) {
        gear = value;
    }

    public void applyBrake(int decrement){
        speed -= decrement;
    }

    public void speedUp(int increment){
        speed += increment;
    }
}
