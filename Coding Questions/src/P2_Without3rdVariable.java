
public class P2_Without3rdVariable {
	public static void main(String[] args) {

		System.out.println("Before Swapping");

		int a = 10;
		int b = 5;

		System.out.println("a :"+a);
		System.out.println("b :"+b);
		

		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("********After  Swapping ***********");
		System.out.println("a :" + a);
		System.out.println("b :" + b);

	}
}
