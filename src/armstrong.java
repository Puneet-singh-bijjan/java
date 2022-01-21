import java.util.Scanner;
import java.math.*;
import java.lang.*;
public class armstrong {
	public static void main(String args[]) {
		System.out.println("Enter the number upto which u want armstrong numbers :");
		Scanner ac = new Scanner(System.in);
		int x = ac.nextInt();
		for(int i=0 ; i<=x ; i++) {
			int check = armstrongg(i);
			if(check==1) {
				System.out.print(i + ",");
			}
		}
	}
	static int armstrongg(int x) {
		int temp,digits=0,sum=0,last=0;
		temp = x;
		while(temp>0) {
			temp/=10;
			digits++;
		}
		temp = x;
		while(temp>0) {
			last = temp%0;
			temp/=10;
			sum+= (Math.pow(last, digits));
		}
		if(sum==x) {
			return 1;
		}
		else {
			return 0;
		}
	}
}
