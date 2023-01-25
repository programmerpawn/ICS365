import java.util.Scanner;

public class excerise5 {
	public static void main(String args[]) {
		Scanner myObj = new Scanner(System.in);
		int x = myObj.nextInt();
		int y = myObj.nextInt();
		
		myObj.close();
		int total = 0;
		for (int z = x; z < y; z++) {
			total += z;
		}
		System.out.println(total + y);

	}
}