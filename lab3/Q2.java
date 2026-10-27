package lab3;
import java.util.Random;


public class Q2 {
    public static void main(String[] args){
        Random rd = new Random();
        int number = rd.nextInt(6);
        String word;

        switch (number){
            case 0:
                word = "zero";
                break;

            case 1:
                word = "one";
                break;

            case 2:
                word = "two";
                break;

            case 3:
                word = "three";
                break;

            case 4:
                word = "four";
                break;

            case 5:
                word = "five";
                break;

            default:
                word = "invalid";
        }

        System.out.println("Generated number: " + number);
        System.out.println("In word: " + word);
        }

    }


