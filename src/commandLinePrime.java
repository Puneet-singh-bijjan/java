
public class commandLinePrime {
	public static void main(String args[]) {
		int x = Integer.parseInt(args[0]);
		if(x%2==0) {
			System.out.print(x + " is a prime number.");
		}else {
			System.out.print(x + " is not a prime number.");
		}
	}
}
