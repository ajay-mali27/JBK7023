import java.util.Scanner;

public class P1_SwappingOfNoWithThirdVeriable {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int temp;

		System.out.println("Before Swapping");
		System.out.println("The Value of a :" + a);
		System.out.println("The Value of b :" + b);

		temp = a; // temp=10;
		a = b; // a=20;
		b = temp;
		
		System.out.println("**************");
		System.out.println("Value of a :" + a);
		System.out.println("Value of b :" + b);
	}
}
