import java.util.Scanner;

public class Assignment22 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		double a = s.nextInt();
		double b = s.nextInt();
		double z;
		if (n == 1) {
			z = a + b;
			if (z < 0) {
				System.out.println("Oops option X(1/2/3/4/5/) is returning the negative number");
			} else
				System.out.println(a + b);

		} else if (n == 2) {
			z = a - b;
			if (z < 0) {
				System.out.println("Oops option X(1/2/3/4/5/) is returning the negative number");
			}

			else
				System.out.println(a - b);

		}

		else if (n == 3) {
			z = ((a / b) + a % b);
			if (z < 0) {
				System.out.println("Oops option X(1/2/3/4/5/) is returning the negative number");
			}

			else
				System.out.println((a / b) + a % b);
		} else if (n == 4) {
			z = a*b;
			if (z < 0) {
				System.out.println("Oops option X(1/2/3/4/5/) is returning the negative number");
			} else
			
			System.out.println(a * b);

		}

		else if (n == 5) {
			int c = s.nextInt();
			int d = s.nextInt();
		  z = a+b+c+d;
			if (z < 0) {
				System.out.println("Oops option X(1/2/3/4/5/) is returning the negative number");
			} else
			System.out.println((a + b + c + d) / 4);

		}
	}
}
