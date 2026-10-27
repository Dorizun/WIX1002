package lab3;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        double radius = input.nextDouble();

        System.out.print("Enter x-coordinate: ");
        double x = input.nextDouble();

        System.out.print("Enter y-coordinate: ");
        double y = input.nextDouble();

        double distanceSquared = x * x + y * y;
        double radiusSquared = radius * radius;

        if (distanceSquared <= radiusSquared) {
            System.out.println("The point is inside the circle.");
        } else {
            System.out.println("The point is outside the circle.");
        }

        input.close();
    }

}
