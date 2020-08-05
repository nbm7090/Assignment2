import java.util.Scanner;

public class Assignment27 {

	public static void main(String[] arg) {

		System.out.println("Enter your number");

		Scanner sc = new Scanner(System.in);

		float n = sc.nextFloat();
		if (n == 0.0) {
			System.out.println("zero");
		} else if (n > 0.0) {

			System.out.println("positive");
			if (Math.abs(n) < 1.0) {
				System.out.println("small");

			} else {
				System.out.println("Large");

			}

		} else if (n < 0.0) {

			System.out.println("negative");
			if (Math.abs(n) < 1.0) {
				System.out.println("small");

			} else {
				System.out.println("Large");

			}

		}

	}
}
