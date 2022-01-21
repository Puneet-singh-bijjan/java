import java.lang.Math;
import java.util.Scanner;

public class randomnumber {
	public static void main(String args[]) {
		int min,max;
		System.out.print("Enter the range from which u want random numbers: ");
		Scanner ac = new Scanner(System.in);
		min = ac.nextInt();
		System.out.print("Enter the range upto which u want random numbers: ");
		max = ac.nextInt();
		int random = (int) Math.round ((Math.random()*(max-min+1))+min);
		System.out.println(random);
}
}