package work;

import java.util.Scanner;

public class Day1DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=4;
		double d = 4.0;
		String s = "HackerRank ";
		
		Scanner scan = new Scanner (System.in);
		
		int i1=0;
		double d1=0.0;
		String s1 = "";
		
	    i1 =Integer.parseInt(scan.nextLine()) + i;
		d1= Double.parseDouble(scan.nextLine()) + d;
	    s1= s + scan.nextLine();
		
		/* this works if all the inputs are on the same line
		 *  int i1=0;
		 *  i1 = scan.nextInt() + i;
		 *  double d1=0.0;
		 *  d1 = scan.nextDoube() + d;
		 *  String s1 = "";
		 *  s1= s + scan.nextLine();
		 */
	    
	    
	    
	    
	    System.out.println(String.valueOf(i1));
		System.out.println(String.valueOf(d1));
		System.out.println(s1);
		
		scan.close();

	}

}
