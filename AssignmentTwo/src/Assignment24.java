import java.util.Scanner;

public class Assignment24 {

	public static void main(String[] args) {
		System.out.println("Enter your number");

		Scanner EnterNum = new Scanner(System.in);

		int n = EnterNum.nextInt();

		while (n < 0) {
			System.out.println("It's Over");
			break;

		}

		if (n > 0) {
			System.out.println("Going Good");

		}
	}
}
