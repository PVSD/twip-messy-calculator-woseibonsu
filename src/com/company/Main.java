package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Do you want to Add, Subtract, Multiply, or Divide?");
        Scanner kbInput = new Scanner(System.in);
        String operation = kbInput.nextLine();
        int tryAgainCounter = 0;

        if (operation.equalsIgnoreCase("add")) {
            System.out.println("Enter the first term:");
            int firstTerm = kbInput.nextInt();
            System.out.println("Enter the second term:");
            int secondTerm = kbInput.nextInt();
            System.out.println("The sum of " + secondTerm + " and " + firstTerm + " is " + Math.sqrt(firstTerm + secondTerm) + ". Are you satisfied?");
            kbInput = new Scanner(System.in);
            String response = kbInput.nextLine();
            if (response.equalsIgnoreCase("yes")) {
                System.out.println("Well that answer is wrong...");
                System.exit(0);
            } else {
                do {
                    System.out.println("Can you identify what math class method I ran the real answer through?");
                kbInput = new Scanner(System.in);
                String userAnswer = kbInput.next();
                if (userAnswer.equalsIgnoreCase("sqrt")) {
                    System.out.println("That's correct! Good Job!");
                    System.exit(0);
                } else {
                    System.out.println("That's not it. Would you like to try again?");
                    kbInput = new Scanner(System.in);
                    String tryAgain = kbInput.next();
                    if (tryAgain.equalsIgnoreCase("yes")) {
                        tryAgainCounter = 1;
                    }

                }
            } while (tryAgainCounter == 1);
        }
        }

        else if (operation.equalsIgnoreCase("subtract")) {
            System.out.println("Enter the first term:");
            int firstTerm = kbInput.nextInt();
            System.out.println("Enter the second term:");
            int secondTerm = kbInput.nextInt();
            System.out.println("The difference of " + secondTerm + " and " + firstTerm + " is " + Math.sqrt(firstTerm - secondTerm) + ". Are you satisfied?");
            kbInput = new Scanner(System.in);
            String response = kbInput.nextLine();
            if (response.equalsIgnoreCase("yes")) {
                System.out.println("Well that answer is wrong...");
                System.exit(0);
            } else {
                do {
                    System.out.println("Can you identify what math class method I ran the real answer through?");
                    kbInput = new Scanner(System.in);
                    String userAnswer = kbInput.next();
                    if (userAnswer.equalsIgnoreCase("sqrt")) {
                        System.out.println("That's correct! Good Job!");
                        System.exit(0);
                    } else {
                        System.out.println("That's not it. Would you like to try again?");
                        kbInput = new Scanner(System.in);
                        String tryAgain = kbInput.next();
                        if (tryAgain.equalsIgnoreCase("yes")) {
                            tryAgainCounter = 1;
                        }
                    }
                } while (tryAgainCounter == 1);
            }
        }

        else if (operation.equalsIgnoreCase("multiply")) {
            System.out.println("Enter the first term:");
            int firstTerm = kbInput.nextInt();
            System.out.println("Enter the second term:");
            int secondTerm = kbInput.nextInt();
            System.out.println("The product of " + secondTerm + " and " + firstTerm + " is " + Math.sqrt(firstTerm * secondTerm) + ". Are you satisfied?");
            kbInput = new Scanner(System.in);
            String response = kbInput.nextLine();
            if (response.equalsIgnoreCase("yes")) {
                System.out.println("Well that answer is wrong...");
                System.exit(0);
            } else {
                do {
                    System.out.println("Can you identify what math class method I ran the real answer through?");
                    kbInput = new Scanner(System.in);
                    String userAnswer = kbInput.next();
                    if (userAnswer.equalsIgnoreCase("sqrt")) {
                        System.out.println("That's correct! Good Job!");
                        System.exit(0);
                    } else {
                        System.out.println("That's not it. Would you like to try again?");
                        kbInput = new Scanner(System.in);
                        String tryAgain = kbInput.next();
                        if (tryAgain.equalsIgnoreCase("yes")) {
                            tryAgainCounter = 1;
                        }
                    }
                } while (tryAgainCounter == 1);
            }
        }

        else if (operation.equalsIgnoreCase("divide")) {
            System.out.println("Enter the first term:");
            int firstTerm = kbInput.nextInt();
            System.out.println("Enter the second term:");
            int secondTerm = kbInput.nextInt();
            System.out.println("The quotient of " + secondTerm + " and " + firstTerm + " is " + Math.sqrt(firstTerm / secondTerm) + ". Are you satisfied?");
            kbInput = new Scanner(System.in);
            String response = kbInput.nextLine();
            if (response.equalsIgnoreCase("yes")) {
                System.out.println("Well that answer is wrong...");
                System.exit(0);
            } else {
                do {
                    System.out.println("Can you identify what math class method I ran the real answer through?");
                    kbInput = new Scanner(System.in);
                    String userAnswer = kbInput.next();
                    if (userAnswer.equalsIgnoreCase("sqrt")) {
                        System.out.println("That's correct! Good Job!");
                        System.exit(0);
                    } else {
                        System.out.println("That's not it. Would you like to try again?");
                        kbInput = new Scanner(System.in);
                        String tryAgain = kbInput.next();
                        if (tryAgain.equalsIgnoreCase("yes")) {
                            tryAgainCounter = 1;
                        }
                    }
                } while (tryAgainCounter == 1);
            }
        }

    }
}
