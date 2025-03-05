package se.lexicon;

import java.util.Scanner;

import static java.lang.System.in;

public class Main {

    public static void main(String[] args) {

        ex7();

    }

    public static void ex1() {
        System.out.println("Hello");
        System.out.println("Lana!");
    }

    public static void ex2() {
        Scanner scanner = new Scanner(in);
        System.out.println("Enter a year: ");
        int year = scanner.nextInt();

        String result = (year % 4 == 0) ?
                        ((year % 100 == 0) ?
                                ((year % 400 == 0) ? "Leap Year" : "Not a Leap Year")
                                : "Leap Year")
                                : "Not a Leap Year";

        System.out.println(year + " is " + result);
    }

    public static void ex3() {
        int num1 = 45, num2 = 11, num3 = 12, num4 = 4, num5 = 24, num6 = 6, num7 =55;

        int additionResult = num1 + num2;
        System.out.println("Addition: " + additionResult);

        int multiplicationResult = num3 * num4;
        System.out.println("Multiplication: " + multiplicationResult);

        int division = num5 / num6;
        System.out.println("Division: " + division);

        int subtractionResult = num7 - num3;
        System.out.println("Subtraction: " + subtractionResult);
    }

    public static void ex4() {

            Scanner scanner = new Scanner(in);
            System.out.println("Enter the first number: ");
            double num1 = scanner.nextDouble();
            System.out.println("Enter the second number: ");
            double num2 = scanner.nextDouble();
            System.out.println("Enter the third number: ");
            double num3 = scanner.nextDouble();
            System.out.println("The average of entered numbers is: " + average(num1, num2, num3)+"\n" );
        }
        public static double average(double num1, double num2, double num3) {
        return (num1 + num2 + num3) / 3;
        }

public static void ex5() {
        Scanner scanner = new Scanner(in);
    System.out.println("What is your name? ");
    String username = scanner.nextLine();
    System.out.println("Hello " + username);
    scanner.close();

}

public static void ex6() {
        Scanner scanner = new Scanner(in);
    System.out.println("Enter the first number: ");
    int num1 = scanner.nextInt();

    System.out.println("Enter the second number: ");
    int num2 = scanner.nextInt();

    int additionResult = num1 + num2;
    System.out.println("Addition: " + additionResult);

    int multiplicationResult = num1 * num2;
    System.out.println("Multiplication: " + multiplicationResult);

    int division = num1 / num2;
    System.out.println("Division: " + division);

    int subtractionResult = num1 - num2;
    System.out.println("Subtraction: " + subtractionResult);
}

public static void ex7() {
      Scanner scanner = new Scanner(System.in);
    System.out.println("Input seconds: ");
    int seconds = scanner.nextInt();

    int S = seconds % 60;
    int H = seconds / 60;
    int M = H % 60;
    H = H / 60;

    System.out.println(H + ":" + M + ":" + S);
}
    }
