/*
 * Author: Dahir Muhammad Dahir
 * Date: 05-June-2019 5:55 AM
 * About: I will tell you later
 */


import java.awt.*;

public class MountainBikes extends Bicycles{
    // field
    private int seatHeight;

    // Constructor
    public MountainBikes(int startHeight, int startCadence, int startSpeed, int startGear){

        super(startCadence, startSpeed, startGear);

        seatHeight = startHeight;

    }




    // Method
    public void setHeight(int value){
        seatHeight = value;
    }

}
