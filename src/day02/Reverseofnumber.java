package day02;
//WAP to print numbers from  1 to 1000 in reversed order.
public class Reverseofnumber {
public static void main(String[] args) {
	int i=1;
	while(i<=1000) {
		int number=i;
		int rev=0;
		while(number>0) 
		{
			int remainder=number%10;
			rev=rev*10+remainder;
			number=number/10;
		}
		i++;
		System.out.println((i-1)+" : "+rev);
	}
}
}
//package day02;
////WAP to print numbers 1 to 1000 which are pallindrome.
//public class Palindromenumber 
//{
//public static void main(String[] args)
//{
//	int i=1;
//	while(i<=1000)
//	{
//		ispalindrome(i);
//		i++;
//	}
//}
//private static void ispalindrome(int a) 
//{
//	int number=a;
//	int temp=number;
//		int rev=0;
//		while(number>0)
//		{
//			int remainder=number%10;
//			rev=rev*10+remainder;
//			number=number/10;
//		}
////		System.out.println(rev);
//		if(rev==temp) 
//		{
//			System.out.println("Palindrome Number : "+temp);
//		}
//	
//	
//}
//}
