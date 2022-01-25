import java.util.Scanner;
public class reversenumber {
	public static void main(String args[]) {
		System.out.print("Enter a number :");
		Scanner ac = new Scanner(System.in);
		int val = ac.nextInt();
		int temp = val;
		while(temp!=0) {
			int last = temp%10;
			System.out.print(last);
			temp/=10;
		}
	}
}
