import java.util.Scanner;
public class prime {
	static int check;
	public static void main(String args[]) {
		do {
		System.out.println("Enter the number which u want to check");
		Scanner ac = new Scanner(System.in);
		double x = ac.nextDouble();
		if(x%2==0) {
			System.out.println("Given number is a prime number.");
		}
		else {
			System.out.println("Given number is not a prime number.");
		}
		System.out.println("Enter 1 to check another number or press any key to exit.");
		check = ac.nextInt();
		}while(check==1);
	}
}
