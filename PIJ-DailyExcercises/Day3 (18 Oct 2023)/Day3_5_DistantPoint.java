/*Write a program that reads the X and Y coordinates of three points and then outputs which two of
the three are closest to each other. Use the following class to store the data for the points:
 */

 public class Day3_5_DistantPoint {
    public static void main(String[] args) {
        Point point1 = new Point(3.2, 3.3);
        Point point2 = new Point(5.8, 9.6);
        Point point3 = new Point(13.4, 12.67); 

    
        
        System.out.println(point1 + " and " + point2 + " are closest together.");
    }

    static class Point {
        double x;
        double y;
      
        Point (double x, double y){
            this.x = x;
            this.y = y;
           

        }
    }
 }