package lab3;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a, b, c, d, e, f: ");

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

        double determinant = a * d - b * c;

        if (determinant == 0) {
            System.out.println("The equation has no solution");
        } else {
            double x = (e * d - b * f) / determinant;
            double y = (a * f - e * c) / determinant;

            System.out.printf("x = %.2f%n", x);
            System.out.printf("y = %.2f%n", y);
        }

        input.close();
    }

}
