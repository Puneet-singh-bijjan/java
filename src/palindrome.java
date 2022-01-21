import java.util.Scanner;
public class palindrome {
	public static void main(String args[]) {
		int sum=0,temp;
		System.out.println("Enter the number u want to check for palindrome:");
		Scanner ac = new Scanner(System.in);
		int x = ac.nextInt();
		temp = x;
		while (x>0) {
			int r = x%10;
			sum = (sum*10) + r;
			x/=10;
		}
		if(temp==sum) {
			System.out.print(temp +" is a palindrome number.");
		}else {
			System.out.print(temp + " is not a palindrome number.");
		}
	}
}
