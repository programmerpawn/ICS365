import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception
    {
        Scanner myObj = new Scanner(System.in);
        String fileName = myObj.nextLine();
        // File path is passed as parameter
        File file = new File(fileName);

        // Creating an object of BufferedReader class
        BufferedReader br
            = new BufferedReader(new FileReader(file));
 
        // Declaring a string variable
        String st;

        while ((st = br.readLine()) != null)
 
            // Print the string
            System.out.println(st);
    }
}