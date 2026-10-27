package lab3;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the operator: ");
        char operator = sc.next().charAt(0);

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        switch(operator) {
            case '+':
                System.out.println("Result: " + (num1 + num2));
                break;

            case '-':
                System.out.println("Result: " + (num1 - num2));
                break;

            case '*':
                System.out.println("Result: " + (num1 * num2));
                break;

            case '/':
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero.");
                } else {
                    System.out.println("Result: " + (num1 / num2));
                }
                break;

            case '%':
                if (num2 == 0) {
                    System.out.println("Cannot calculate remainder with zero.");
                } else {
                    System.out.println("Result: " + (num1 % num2));
                }
                break;

            default:
                System.out.println("Invalid operator.");

        }
        sc.close();


        }


    }
