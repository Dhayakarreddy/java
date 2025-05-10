package day05;

public class Primenotpalindrome {
public  static boolean ispalindrome(int a) {
	int temp=a;
	int rev=0;
	while(temp>0) {
		int remainder=temp%10;
		rev=rev*10+remainder;
		temp/=10;
		
	}if(rev == a) {
			return true;
		}else {
			return false;
	}
}
public static boolean isprime(int num) {
	boolean status=true;
	for(int i=2;i<num;i++) {
		if(num%i==0) {
			status=false;
		}
	}
	return status;
	
	
}
public static void main(String[] args) {
	for(int i=2;i<=1000;i++) {
		if(isprime(i)  && !ispalindrome(i)) {
			System.out.println(i);
	}
}
	

}
}
