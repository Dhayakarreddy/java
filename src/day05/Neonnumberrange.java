package day05;

public class Neonnumberrange {
	public static void main(String[] args) {
		for (int i = 1; i <= 1000; i++) {
			int num = i;
			int sum = 0;
			square(num);
			int result = square(num);

			while (result > 0) {
				int remainder = result % 10;
				result /= 10;
				sum = sum + remainder;
			}
			if (sum == num) {
				System.out.println("Neon number: " + num);
			}
		}

	}

	public static int square(int num) {
		int sq = num * num;
		return sq;
	}
}
