package day01;

import java.util.Scanner;

public class Sumofprime 
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number: ");
	int num=sc.nextInt();
	int sum=0;
	for(int i=2;i<num;i++) 
	{
		int count=0;
		for(int j=2;j<i;j++) 
		{
			if(i%j==0) 
			{
				count++;
			}
		}
		if(count==0)
		{
			
			sum=sum+i;
			
		}
		sc.close();
	}System.out.println("Sum of prime numbers: "+sum);
}
}
