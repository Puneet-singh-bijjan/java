
public class commandLinecalc {
		public static void main(String args[]) {
			int x = Integer.parseInt(args[0]);
			int y = Integer.parseInt(args[1]);
			System.out.println("Addition of " + x + " and " + y + " is: " + (x+y) );
			System.out.println("Substraction of " + x + " and " + y + " is: " + (x-y) );
			System.out.println("Addition of " + x + " and " + y + "is: " + (x*y) );
			System.out.println("Addition of " + x + " and " + y + "is: " + (x/y) );
		}
}
