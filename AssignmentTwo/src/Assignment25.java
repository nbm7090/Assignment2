import java.util.Scanner;

public class Assignment25 {

	public static void main(String args[]) {

		int i;
		for (i = 0; i <= 6; i++) {
			if (i == 3)
				continue;
			System.out.print(i + " ");
			if (i == 5)
				break;
		}
	}
}
