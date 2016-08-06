package work;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day3IntroToConditionalStatements {

	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
	      int n = scan.nextInt(); 
	      scan.close();
	      String ans="";
	      
	      //If  is even and in the inclusive range of 2 to5 , print Not Weird
	      //If  is even and in the inclusive range of 6 to 20 , print Weird
	      //If  is even and greater than 20 , print Not Weird
	          
	      // if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
	      if(n%2==1){
	         ans = "Weird";
	      }
	      else{
	    	  
	    	  if(n>=2 && n <=5) ans = "Not Weird" ;
	    	  if(n>=6 && n <=20) ans = "Weird";
	    	  if (n>20) ans="Not Weird";
	    	  
	      }
	      System.out.println(ans);

	}

}