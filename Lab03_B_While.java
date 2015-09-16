/*
Programmer: Franco Lavares
Title:      Lab 3 Part A
Date:       September 15 2015
Filename:   Lab03_B_While.java
 */

//package javalab3;

import java.util.*;

public class Lab03_B_While 
{
    public static void main(String[] args)
    {   
        //declarations
        int firstNum, secondNum;
       
        //for input
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Enter a positive number: ");
            
        firstNum = reader.nextInt();
    
        System.out.print("Enter another positive number greater than " +
                firstNum + ": ");
        
        secondNum =reader.nextInt();
    
        //if the user inputs a smaller second value
        while (firstNum >= secondNum)
        {
           System.out.print("Please enter a number greater than " + firstNum
           + ": ");
        
            secondNum = reader.nextInt();
        }
        
        System.out.print("All the odd numbers between " + firstNum
                + " and " + secondNum + " are: " + "\n");
        
        //loop to output all odd numbers between first and second values
        while (firstNum < secondNum)
        {
                
            if (firstNum % 2 != 0)
                System.out.print(firstNum + "\n");
            
            else 
            {    
                firstNum = (firstNum + 1);
            
                System.out.print(firstNum + "\n");
            }
                
            ++firstNum;
        }    
        
        System.exit(0);
    }
}
