import java.util.Scanner;
public class nestedloop{
	public static void main(String args[]) {
		int n1=0,n2=1,n3,i,count;
		System.out.println("Enter count :");
		Scanner ac = new Scanner(System.in);
		count = ac.nextInt();
		System.out.print(n1 + " " + n2);
		for(int j=0;j<count-2;j++) {
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
		
	}
}