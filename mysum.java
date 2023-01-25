import java.util.Scanner;

public class mySum {
	public static void main(String args[]) {
		Scanner myObj = new Scanner(System.in);
		int x = myObj.nextInt();
		String operators = myObj.next();
		int y = myObj.nextInt();
		myObj.close();

		int z = 0;

		System.out.println("Enter two numbers");

		if (operators.contains("+")) {
			//System.out.println("add");
			z = x + y;
			System.out.println("Sum of " + x + " + " + y + " = " + z);
		} else {
			//System.out.println("sub");
			z = x - y;
			System.out.println("sub of " + x + " - " + y + " = " + z);
		}

	}
}