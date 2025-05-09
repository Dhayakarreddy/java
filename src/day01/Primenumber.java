package day01;

import java.util.Scanner;

public class Primenumber {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number: ");
	int num=sc.nextInt();
	for(int j=2;j<=num;j++) 
	{
		
		int count=0;
		for(int i=1;i<=j;i++)
		{
			if(j%i==0) 
			{
				count++;	
			}
		}
		if(count==2)
		{
			System.out.println(j);	
			
		}
		
	}
	sc.close();
}
}
