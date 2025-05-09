package day04;

public class Armstrongnumber {
	public static void main(String[] args) {

		for (int i = 1; i <= 1000; i++) {
			int temp = i;
			int sum = 0;
			int count = count(i);
			while (temp > 0) {
				int remainder = temp % 10;
				sum += power(remainder, count);
				temp /= 10;

			}
			if (i == sum) {
				System.out.println("Armstrong number: " + i);
			}
		}
	}

	public static int count(int num) {
		int count = 0;
		while (num > 0) {
			num = num / 10;
			count++;
		}
		return count;

	}

	public static int power(int base, int power) {
		int product = 1;
		for (int i = 1; i <= power; i++) {
			product *= base;
		}
		return product;
	}
}
