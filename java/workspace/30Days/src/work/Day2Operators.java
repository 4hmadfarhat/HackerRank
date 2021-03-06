package work;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Day2Operators {

	public static void main(String[] args) {
		
		  Scanner scan = new Scanner(System.in);
	        double mealCost = scan.nextDouble(); // original meal price
	        int tipPercent = scan.nextInt(); // tip percentage
	        int taxPercent = scan.nextInt(); // tax percentage
	        scan.close();
	       
	        double tax = mealCost * ((double)taxPercent/100);
	        double tip = mealCost * ((double)tipPercent/100);
	     
	        mealCost = mealCost + tip + tax;
	        // Write your calculation code here.
	      
	        // cast the result of the rounding operation to an int and save it as totalCost 
	        int totalCost = (int) Math.round(mealCost);
	      
	        // Print your result
	        System.out.println("The cost of the meal is " + totalCost+ " dollars");

	}

}