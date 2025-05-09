package day04;

public class Sunnynumber {
	public static void main(String[] args) {

		sunnynumber();
//	rangesunny();
	}

	public static void sunnynumber() {
		int num = 8;
		boolean status = false;
		for (int i = 1; i <= num; i++) {
			if (i * i == num + 1) {
				status = true;
				break;
			}
		}
		if (status) {
			System.out.println("Sunny number");
		} else {
			System.out.println("Not sunny");
		}
	}

	public static void rangesunny() {
		for (int i = 1; i <= 1000; i++) {
			for (int j = 1; j <= i; j++) {
				if (j * j == i + 1) {
					System.out.println("Sunny: " + (i));
				}
			}
		}
	}
}
