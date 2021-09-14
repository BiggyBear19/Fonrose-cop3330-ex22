/*
 *  UCF COP3330 Fall 2021 Assignment 22 Solution
 *  Copyright 2021 Bernard Fonrose
 */

package Exercise22;

import java.util.Scanner;

public class Exercise22 {
    public static void main(String[] args) {
        Scanner greatest = new Scanner(System.in);

        System.out.print("Enter Number 1: ");

        int num1 = greatest.nextInt();

        System.out.print("Enter Number 2: ");

        int num2 = greatest.nextInt();

        System.out.print("Enter Number 3: ");

        int num3 = greatest.nextInt();

        if(num1 > num3 && num1 > num2){

            System.out.printf("%d is the largest number", num1);



        }

        else if(num2 > num3 && num2 > num1){

            System.out.printf("%d is the largest number", num2);
        }

        else{
            System.out.printf("%d is the largest number", num3);
        }
    }
}
