import java.util.Scanner;

public class Assignment26 {

	public static void main(String[] args) {

		System.out.println("Enter your number");

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		if (n % 2 == 0) {
			if (n < 5) {
				System.out.println("OLD");
			} else if (n > 5 && n <= 31) {
				System.out.println("NEW");
			}

			else if (n > 30) {
				System.out.println("OLD");

			}

		} else {
			System.out.println("NEW");
		}
	}
}