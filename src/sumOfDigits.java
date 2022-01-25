import java.util.Scanner;
public class sumOfDigits {
	public static void main(String args[]) {
		System.out.println("Enter a number : ");
		Scanner ac = new Scanner(System.in);
		int sum=0,x = ac.nextInt();
		int temp = x;
		while(temp!=0) {
			int last = temp%10;
			sum+=last;
			temp/=10;
		}
		System.out.print("Sum of digits of " +x+ " is " + sum );
	}
	
}
