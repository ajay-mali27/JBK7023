
public class P2_Factorial {
	public static void main(String[] args) {

		int no = 8;
		int fact;
		int a = 0;
		int b = 1;

		for (int i = 1; i <= no; i++) {
			fact = a + b;
			a = b;
			b = fact;
			
			System.out.print(fact + " ");
		}

	}

}
