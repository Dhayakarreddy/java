package day03;

public class Evendigitcount {
	public static void main(String[] args) {
		int num = 363;
		int evensum = 0;
		int temp = num;
		while (temp > 0) {
			int remainder = temp % 10;
			if (remainder % 2 == 0) {
				evensum += remainder;
			}
			temp /= 10;
		}

		System.out.println(evensum);
	}
}
