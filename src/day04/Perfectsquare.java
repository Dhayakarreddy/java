package day04;

public class Perfectsquare {
	public static void main(String[] args) {
//		perfectnumber();
		rangeperfect();

	}
	public static void perfectsquarenumber() {
		int num = 26;
		boolean status = false;
		for (int i = 1; i <= num; i++) {
			if (i * i == num) {

				status = true;
			}
		}
		if (status) {
			System.out.println("perfect square");
		} else {
			System.out.println("Not perfect");
		}
	}

	public static void rangeperfect() {
			System.out.println("perfect number: ");
		for(int i=1;i<=1000;i++) {
			for(int j=1;j<=i;j++) {
				if(j*j==i) {
					
					
					System.out.print(","+i);
					
					break;
				}
			}
		}
		
	}
	
}
