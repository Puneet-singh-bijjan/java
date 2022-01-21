import java.util.Scanner;
public class factorial {
	public static void main(String args[]) {
		int x,i,add=1;
		System.out.println("Enter any number :");
		Scanner ac = new Scanner(System.in);
		x = ac.nextInt();
		for(i=1;i<=x;i++) {
			add*=i;
		}
		System.out.println(add);
	}
}
