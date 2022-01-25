
public class numberOfObjects {
	static int count = 0;
	public
		numberOfObjects(){
			count++;
	}
	public static void main(String args[]) {
		numberOfObjects obj1 = new numberOfObjects();
		numberOfObjects obj2 = new numberOfObjects();
		numberOfObjects obj3 = new numberOfObjects();
		numberOfObjects obj4 = new numberOfObjects();
		numberOfObjects obj5 = new numberOfObjects();
		numberOfObjects obj6 = new numberOfObjects();
		System.out.print(count);
	}
}
