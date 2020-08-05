import java.util.Scanner;



public class Assignment28 {

	public static void main(String[] args) {

		System.out.println("Enter your character");

		Scanner sc = new Scanner(System.in);
		
		char ch = sc.next().charAt(0);
		String c = Character.toString(ch);
	

		String s10 = "RANDOMrandom";
		
		if(s10.contains(c)){
			System.out.println("FOUND");
		}
		else System.out.println(" NOT FOUND");
		
	}

	}


