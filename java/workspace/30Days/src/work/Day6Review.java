package work;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Day6Review  {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
      
        String evenString = "";
        String oddString = "";
        String in = "";
        String [] arr = new String[T];
        int stringLength = 0;
        String stringValue="";
       for(int i=0;i<T;i++)
        {
           in = scan.next();
           arr[i]=in;
        }
        
        for(int j=0;j<=arr.length-1;j++)
        {
        	stringLength = arr[j].length();
        	stringValue = arr[j];
        	
        	for (int x=0;x<=stringLength-1;x++)
        	{
        		if(x%2==0) 
        		{
        			evenString += stringValue.toCharArray()[x];
        		}
        		else 
        		{
        			oddString += stringValue.toCharArray()[x];
        		}
        	}
        	System.out.println(evenString + " " + oddString);
        	evenString="";
        	oddString="";
        }
        
       
        
    }
}