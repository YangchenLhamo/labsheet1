package LABS_1;
import java.util.Scanner;
public class Inches {
    public static void main(String[] args) {
        Scanner ii= new Scanner (System.in);
        System.out.println("Enter the number in inches:");
        int i=ii.nextInt();
        int a = i / 12;
        int b = i % 12;
        System.out.println(a + " ft " + b + " inches");
        ii.close();
    }
   
}
