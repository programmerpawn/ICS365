import java.io.*;
import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
    String stringName = args[0];

    stringName = stringName.replaceAll("\\.", "\n"); 
    System.out.print(stringName);
    }
}