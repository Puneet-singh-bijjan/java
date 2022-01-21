import java.util.Scanner;
public class fabonacci {
	public static void main(String args[]) {
		System.out.print("Enter number of terms you want to print.\n");
		Scanner ac = new Scanner(System.in);
		int x=ac.nextInt();
		fabonaccii(x);
	}
	static int fabonaccii(int x) {
		int i,v1=0,v2=1,add;
		System.out.print(v1 + "," + v2);
		for(i=0;i<x-2;i++) {
			 add=v1+v2;
			 System.out.print("," + add);
			 v1=v2;
			 v2=add;
			 
		}
		return 0;
	}
}
