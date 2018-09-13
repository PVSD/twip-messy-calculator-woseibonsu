package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Do you want to Add, Subtract, Multiply, or Divide");
        Scanner kbInput = new Scanner;
        String operation = kbInput.nextLine();

        if (operation.toLowerCase() == "add" )
        {
            System.out.println("Enter the first term:");
            int firstTerm = kbInput.nextInt();
            System.out.println("Enter the second term:");
            int secondTerm = kbInput.nextInt();
            System.out.println(secondTerm + firstTerm);



        }


    }
}
