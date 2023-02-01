package be.intecbrussel;

import java.util.Random;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("---- Oefening 1 - scanner ----");

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Vul een getal in: ");
        int number1 = myScanner.nextInt();

        System.out.println("Vul nog een getal in: ");
        int number2 = myScanner.nextInt();

        int res = number1 + number2;

        System.out.println("Result = " + res);

        System.out.println("---- Oefening 2 - Math ----");

        System.out.println("Vul een negatief getal in: ");
        int negativeNumber = myScanner.nextInt();
        System.out.println("De absolute waarde van " + negativeNumber + " is " + Math.abs(negativeNumber));

        System.out.println("Vul een positief getal in: ");
        int positiveNumber = myScanner.nextInt();

        System.out.println("Het kwadratsche wortel van " + positiveNumber + " is " + (int)Math.sqrt(positiveNumber));
        System.out.println("De macht van " + positiveNumber + " is " + (int)Math.pow(positiveNumber, 2));

        System.out.println("---- Oefening 3 - Random ----");

        Random random = new Random();

        int randomNumber = random.nextInt(100);

        if (randomNumber % 2 == 0) {
            System.out.println(randomNumber + " is een even getal.");
        } else {
            System.out.println(randomNumber + " is een oneven getal.");
        }

    }
}
