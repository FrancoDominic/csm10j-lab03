/*
Programmer: Franco Lavares
Title:      Lab 3 Part A
Date:       September 15 2015
Filename:   Lab03_A.java
 */



//package javalab3; 


import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Lab03_A 
{
   
    public static void main(String[] args)
    {
        //declaration
        double pages, totalCost;
        
        String prices, pagesString;
        
        //displays service prices
        prices = "There is a flat service fee of $3.00" + "\n";
        prices = prices + "The first 10 pages will cost $0.20" + "\n";
        prices = prices + "Each additional page will cost $0.10";
     
        
        JOptionPane.showMessageDialog(null, "Welcome to Franco's Fax Station!"
                , "Welcome", JOptionPane.INFORMATION_MESSAGE);
        
        JOptionPane.showMessageDialog(null, prices, "Prices", JOptionPane.
                INFORMATION_MESSAGE);
        
        //prompts user to input
        pagesString = JOptionPane.showInputDialog(
                "How many pages would you like to fax?");
        
        //converts user inputted string into a double
        pages = Double.parseDouble(pagesString);
        
        //price for first 10 pages
        if (pages <= 10)
            totalCost = 3.00 + (pages * 0.20);
            
        else //price if over 10 pages
                totalCost = 5.00 + ((pages - 10) * 0.10);
         
      
        DecimalFormat decim = new DecimalFormat("#.00");
                
        JOptionPane.showMessageDialog(null, "Your total is $" + 
                decim.format(totalCost), "Total", 
                JOptionPane.INFORMATION_MESSAGE);
        
        
             
       System.exit(0);     
        
        
          
    }
    
}
