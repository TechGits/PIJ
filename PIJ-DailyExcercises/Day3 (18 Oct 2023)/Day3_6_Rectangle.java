
/*
 Write a program that reads the X and Y coordinates of two points and then outputs the area of a rectangle where both points are opposite corners. Use the following class to store the data for the
points:

 */

import java.util.Scanner;

public class Day3_6_Rectangle {
    public static void main(String[] args) {
        

        Rectangle myRectangle = new Rectangle();


    }

}

     class Rectangle extends Day3_5_DistantPoint  {
        
        Point upLeft;
        Point downRight;

        Rectangle (double upLeft, double downRight){
            this.upLeft = upLeft;
            this.downRight = downRight;
        }

        
        

    }