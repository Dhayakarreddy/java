package day03;

//WAP to find given number is Strong number or not.
/*Strong Number: A strong number is a number in which 
the sum of the factorials of its digits is equal to the number itself.
For example, 145 is a strong number because 
1! + 4! + 5! = 1 + 24 + 120 = 145.*/
public class Strongnumber {
	public static void main(String[] args) {
		int num = 145;
		int temp = num;
		int sum = 0;
		while (temp > 0) {
			int fact = 1;
			int remainder = temp % 10;
			for (int i = 1; i <= remainder; i++) {
				fact = fact * i;
			}
			sum = sum + fact;
			temp = temp / 10;
		}
//		if (sum == num) {
//			System.out.println("Strong");
//		} else {
//			System.out.println("Not Strong");
//		}

	}
//	public static void strong() {
//		int n=145;
//		int temp=n;
		
	}
	

