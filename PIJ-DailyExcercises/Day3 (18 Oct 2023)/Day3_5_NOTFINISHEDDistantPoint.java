import java.util.Scanner;

public class Day3_5_NOTFINISHEDDistantPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the coordinates for Point 1 (x y): ");
        double p1x = scanner.nextDouble();
        double p1y = scanner.nextDouble();

        System.out.print("Enter the coordinates for Point 2 (x y): ");
        double p2x = scanner.nextDouble();
        double p2y = scanner.nextDouble();

        System.out.print("Enter the coordinates for Point 3 (x y): ");
        double p3x = scanner.nextDouble();
        double p3y = scanner.nextDouble();

        Point point1 = new Point(p1x, p1y);
        Point point2 = new Point(p2x, p2y);
        Point point3 = new Point(p3x, p3y);

        double distance12 = point1.distanceTo(point2);
        double distance13 = point1.distanceTo(point3);
        double distance23 = point2.distanceTo(point3);

        if (distance12 <= distance13 && distance12 <= distance23) {
            System.out.println("Point 1 and Point 2 are closest together.");
        } else if (distance13 <= distance12 && distance13 <= distance23) {
            System.out.println("Point 1 and Point 3 are closest together.");
        } else {
            System.out.println("Point 2 and Point 3 are closest together.");
        }
    }

    static class Point {
        double x;
        double y;

        Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        double distanceTo(Point other) {
            return Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));
        }
    }
}
