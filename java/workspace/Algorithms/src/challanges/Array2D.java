package challanges;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Array2D {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int arr[][] = new int[6][6];
		int sum1=0;
		int sum2=0;
		int sum3=0;
		int sum4=0;
		int sum5=0;
		int sum6=0;
		int sum7=0;
		int sum8=0;
		int sum9=0;
		int sum10=0;
		int sum11=0;
		int sum12=0;
		int sum13=0;
		int sum14=0;
		int sum15=0;
		int sum16=0;
		
		
		
		int maxSum = 0;
		
		for(int arr_i=0; arr_i < 6; arr_i++){
			for(int arr_j=0; arr_j < 6; arr_j++){
				arr[arr_i][arr_j] = in.nextInt();
			}
		}
		
		for(int arr_i=0; arr_i < 6; arr_i++)
		{
			for(int arr_j=0; arr_j < 6; arr_j++)
			{
				//System.out.println("["+arr_i+"]"+"["+arr_j+"]");
				
				switch(arr_i)
				{
				case 0: 
					System.out.println("In Switch i=0");
					if (arr_j>=0 && arr_j<=2)
					{
						System.out.println("["+arr_i+"]"+"["+arr_j+"]");
						System.out.println("Adding: " + arr[arr_i][arr_j]+ " to sum1" );
						sum1+=arr[arr_i][arr_j];
					}
					if (arr_j>=1 && arr_j<=3)
					{
						sum2+=arr[arr_i][arr_j];
					}
					if (arr_j>=2 && arr_j<=4) 
					{
						sum3+=arr[arr_i][arr_j];
					}
					if (arr_j>=3 && arr_j<=5)
					{
						sum4+=arr[arr_i][arr_j];
					}
					
					
				case 1:
					System.out.println("In Switch i=1");
					if(arr_j==1)
					{
						System.out.println("["+arr_i+"]"+"["+arr_j+"]");
						System.out.println("Adding: " + arr[arr_i][arr_j]+ " to sum1" );
						sum1+=arr[arr_i][arr_j];
					}
					if(arr_j==2)
					{
						sum2+=arr[arr_i][arr_j];
					}
					if(arr_j==3)
					{
						sum3+=arr[arr_i][arr_j];
					}
					if(arr_j==4)
					{
						sum4+=arr[arr_i][arr_j];
					}
					
					if (arr_j>=0 && arr_j<=2)
					{
						sum5+=arr[arr_i][arr_j];
					}
					if (arr_j>=1 && arr_j<=3)
					{
						sum6+=arr[arr_i][arr_j];
					}
					if (arr_j>=2 && arr_j<=4)
					{
						sum7+=arr[arr_i][arr_j];
					}
					if (arr_j>=3 && arr_j<=5)
					{
						sum8+=arr[arr_i][arr_j];
					}
				
				case 2:
					System.out.println("In Switch i=2");
					if (arr_j>=0 && arr_j<=2)
					{
						System.out.println("["+arr_i+"]"+"["+arr_j+"]");
						System.out.println("Adding: " + arr[arr_i][arr_j]+ " to sum1" );
						sum1+=arr[arr_i][arr_j];
					}
					if (arr_j>=1 && arr_j<=3)
					{
						sum2+=arr[arr_i][arr_j];
					}
					if (arr_j>=2 && arr_j<=4)
					{
						sum3+=arr[arr_i][arr_j];
					}
					if (arr_j>=3 && arr_j<=5)
					{
						sum4+=arr[arr_i][arr_j];
					}
					if(arr_j==1)
					{
						sum5+=arr[arr_i][arr_j];
					}
					if(arr_j==2)
					{
						sum6+=arr[arr_i][arr_j];
					}
					if(arr_j==3)
					{
						sum7+=arr[arr_i][arr_j];
					}
					if(arr_j==4)
					{
						sum8+=arr[arr_i][arr_j];
					}
					
					if (arr_j>=0 && arr_j<=2)
					{
						sum9+=arr[arr_i][arr_j];
					}
					if (arr_j>=1 && arr_j<=3)
					{
						sum10+=arr[arr_i][arr_j];
					}
					if (arr_j>=2 && arr_j<=4) 
					{
						sum11+=arr[arr_i][arr_j];
					}
					if (arr_j>=3 && arr_j<=5)
					{
						sum12+=arr[arr_i][arr_j];
					}
					
				case 3:
					System.out.println("In Switch i=3");
					if (arr_j>=0 && arr_j<=2)
					{
						sum5+=arr[arr_i][arr_j];
					}
					if (arr_j>=1 && arr_j<=3)
					{
						sum6+=arr[arr_i][arr_j];
					}
					if (arr_j>=2 && arr_j<=4)
					{
						sum7+=arr[arr_i][arr_j];
					}
					if (arr_j>=3 && arr_j<=5)
					{
						sum8+=arr[arr_i][arr_j];
					}
					
					if(arr_j==1)
					{
						sum9+=arr[arr_i][arr_j];
					}
					if(arr_j==2)
					{
						sum10+=arr[arr_i][arr_j];
					}
					if(arr_j==3)
					{
						sum11+=arr[arr_i][arr_j];
					}
					if(arr_j==4)
					{
						sum12+=arr[arr_i][arr_j];
					}
					
					if (arr_j>=0 && arr_j<=2)
					{
						sum13+=arr[arr_i][arr_j];
					}
					if (arr_j>=1 && arr_j<=3)
					{
						sum14+=arr[arr_i][arr_j];
					}
					if (arr_j>=2 && arr_j<=4) 
					{
						sum15+=arr[arr_i][arr_j];
					}
					if (arr_j>=3 && arr_j<=5)
					{
						sum16+=arr[arr_i][arr_j];
					}
					
				case 4:
					System.out.println("In Switch i=4");
					if (arr_j>=0 && arr_j<=2)
					{
						sum9+=arr[arr_i][arr_j];
					}
					if (arr_j>=1 && arr_j<=3)
					{
						sum10+=arr[arr_i][arr_j];
					}
					if (arr_j>=2 && arr_j<=4) 
					{
						sum11+=arr[arr_i][arr_j];
					}
					if (arr_j>=3 && arr_j<=5)
					{
						sum12+=arr[arr_i][arr_j];
					}
					if(arr_j==1)
					{
						sum13+=arr[arr_i][arr_j];
					}
					if(arr_j==2)
					{
						sum14+=arr[arr_i][arr_j];
					}
					if(arr_j==3)
					{
						sum15+=arr[arr_i][arr_j];
					}
					if(arr_j==4)
					{
						sum16+=arr[arr_i][arr_j];
					}
					
				case 5:
					System.out.println("In Switch i=5");
					if (arr_j>=0 && arr_j<=2)
					{
						sum13+=arr[arr_i][arr_j];
					}
					if (arr_j>=1 && arr_j<=3)
					{
						sum14+=arr[arr_i][arr_j];
					}
					if (arr_j>=2 && arr_j<=4) 
					{
						sum15+=arr[arr_i][arr_j];
					}
					if (arr_j>=3 && arr_j<=5)
					{
						sum16+=arr[arr_i][arr_j];
					}
					
				default:
					
				
				}

			}
		}
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);
		System.out.println(sum4);
		System.out.println(sum5);
		System.out.println(sum6);
		System.out.println(sum7);
		System.out.println(sum8);
		System.out.println(sum9);
		System.out.println(sum10);
		System.out.println(sum11);
		System.out.println(sum12);
		System.out.println(sum13);
		System.out.println(sum14);
		System.out.println(sum15);
		System.out.println(sum16);
		
		
		
		maxSum = sum1;
		if(sum2>sum1)
			maxSum=sum2;
		if(sum3>sum2)
			maxSum=sum3;
		if(sum4>sum3)
			maxSum=sum4;
		if(sum5>sum4)
			maxSum=sum5;
		if(sum6>sum5)
			maxSum=sum6;
		if(sum7>sum6)
			maxSum=sum7;
		if(sum8>sum7)
			maxSum=sum8;
		if(sum9>sum8)
			maxSum=sum9;
		if(sum10>sum9)
			maxSum=sum10;
		if(sum11>sum10)
			maxSum=sum11;
		if(sum12>sum11)
			maxSum=sum12;
		if(sum13>sum12)
			maxSum=sum13;
		if(sum14>sum13)
			maxSum=sum14;
		if(sum15>sum14)
			maxSum=sum15;
		if(sum16>sum15)
			maxSum=sum16;
		
		
		


		
		System.out.println("maxSum: " + maxSum);
		in.close();
	}
}

/**
 //1------------------------------------------------------------------------------------------
				
			

			
				
				


			
				
			
			
				

			

			
			
			

				if ((arr_j>=2 && arr_j<=4) && arr_i==3)
				{
					sum15+=arr[arr_i][arr_j];
					if(arr_i==4 && arr_j==3)
					{
						sum15+=arr[arr_i][arr_j];
						if((arr_j>=2 && arr_j<=4)&&arr_i==5)
						{
							sum15+=arr[arr_i][arr_j];
						}   
					}
				}
			

				if ((arr_j>=3 && arr_j<=5) && arr_i==3)
				{
					sum16+=arr[arr_i][arr_j];
					if(arr_i==4 && arr_j==4)
					{
						sum16+=arr[arr_i][arr_j];
						if((arr_j>=3 && arr_j<=5)&&arr_i==5)
						{
							sum16+=arr[arr_i][arr_j];
						}   
					}
				}
				



			}
		}
 */
