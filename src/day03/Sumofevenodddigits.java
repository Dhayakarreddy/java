package day03;

public class Sumofevenodddigits {
	public static void main(String[] args) {
		int num = 363;
		int evensum = 0;
		int oddsum = 0;
		int temp = num;

//		Evensum and odd sum
		while (temp > 0) {
			int remainder = temp % 10;
			if (remainder % 2 == 0) {
				evensum += remainder;
			} else {
				oddsum += remainder;
			}
			temp /= 10;
		}
		if (evensum > oddsum) {
			factors(num);
		} else if (oddsum > evensum) {
			prime(num);
		} else {
			palindrome(num);
		}
//		System.out.println(evensum);
//		System.out.println(oddsum);
	}

	public static void factors(int num) {
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.print(i + " ");
			}
		}
	}

	public static void prime(int num) {
		int count = 0;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count == 0) {
			System.out.println("prime number: " + num);
		} else {
			System.out.println("Not a prime number");
		}
	}

	public static void palindrome(int num) {
		int temp = num;
		int rev = 0;
		while (temp > 0) {
			int remainder = temp % 10;
			rev = rev * 10 + remainder;
			temp /= 10;
		}
//		System.out.println(rev);
		if (num == rev) {
			System.out.println("palindrome");
		} else {
			System.out.println("Not a palindrome");
		}
	}
}
