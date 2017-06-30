package com.company;
import java.util.Scanner;

import java.util.*;

public class Main
{

    public static void main(String[] args)
    {

        Scanner scnr = new Scanner(System.in); // Declare & Initialize the Scanner Object

        int userInput = 0; // variable that holds number entered by user
        int number; // 'number' is a placeholder variable

        System.out.println("Enter a number: "); //Ask user for number
        userInput = scnr.nextInt(); //read in the number to userInput variable

        number = userInput; //assign userInput value to number placeholder

        int sum = 0; //declaring & initializing the variable sum

        while(number > 0) //starts the while loop as long as number entered by user is greater than 0
        {
            int cube = number%10; //modulus operation: takes the remainder of the number entered by user & assigns it to cube

            System.out.println(cube +" cubed is "+(cube*cube*cube)); //prints the cube of each number entered by user

            sum = sum + (cube * cube * cube); // takes the cube of each number, adds and assign the value to sum
            number = number/10; // takes the number entered by the user & divides by 10 to get the next number for the loop
        }


        if(sum == userInput) //Checks to see if the sum of the cubes is equal to the number put in by user
        {
            System.out.println("The cubed sum is equal to the number entered by user."); //prints if true
        }
        else
        {
            System.out.println("The cubed sum is not equal to the number entered by user."); //prints if false
        }

    }

    } //End of Main Function



