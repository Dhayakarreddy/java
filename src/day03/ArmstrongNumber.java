package day03;
//WAP to find if the given number is ARMSTRONG or not.
/*
ARMSTRONG NUMBER: A number that is equal to the sum of its digits, 
each raised to the power of the number of digits.
  For example, 153 is an Armstrong number because
   1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153 
   */
public class ArmstrongNumber {
public static void main(String[] args) {
	int num=153234568;
	int temp=num;
	int sum=0;
	int count=count(num);
//	int product=1;
	while(temp>0) {
		int remainder=temp%10;
		sum += power(remainder,count);
		temp/=10;
	}
	if(num == sum) {
		System.out.println("Armstrong");
	}else {
		System.out.println("Not");
	}	
}
public  static int count(int n) {
	int count = 0;
	while(n>0) {
		count++;
		n /= 10;
		
	}
	return count;
}
public static int power(int base,int power) {
	int product=1;
	for(int i=1;i<=power;i++) {
		product=product*base;
	}
	return product;
}
}
