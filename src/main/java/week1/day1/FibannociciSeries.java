package week1.day1;

public class FibannociciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 0;
		int b = 1;
		int c = 0;
		System.out.print(a + " ," + b + ",");

		for (int i = 2; i < 100; i++) {

			c = a + b;
			if (c <= 100) {
				System.out.print(" " + c + ",");
				a = b;
				b = c;

			}

			else {

				break;
			}

		}

	}

}
