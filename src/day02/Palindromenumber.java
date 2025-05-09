package day02;
//WAP to print numbers 1 to 1000 which are pallindrome.
public class Palindromenumber 
{
public static void main(String[] args)
{
	int i=1;
	while(i<=1000)
	{
		if (i == ispalindrome(i)) {
				System.out.println("Palindrome Number : "+i);
		}
		i++;
	}
}
private static int ispalindrome(int number) 
{
	
//	int temp=number;
		int rev=0;
		while(number>0)
		{
			int remainder=number%10;
			rev=rev*10+remainder;
			number=number/10;
		}
//		System.out.println(rev);
		return rev;
	
	
}
}
