package day01;

import java.util.Scanner;

public class Sumofperfect {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number: ");
	int num=sc.nextInt();
	int psum=0;

	for(int i=1;i<num;i++) 
	{
		
		int sum=0;
		for(int j=1;j<i;j++) 
		{
			if(i % j==0)
			{
				sum+=j;
			}
		}
		if(sum==i) 
		{
			System.out.println(i);
			psum+=i;
			
		}
		sc.close();
	}System.out.println("Sum of perfect numbers: "+psum);
	
}
}
