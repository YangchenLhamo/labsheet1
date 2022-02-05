package LABS_1;
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner aa=new Scanner(System.in);
        System.out.println("Enter the numbers:");
        int a=aa.nextInt();
        int b=aa.nextInt();
        aa.close();
        int sum=a+b;
        int diff=a-b;
        int product=a*b;
        int quotient=a/b;
        System.out.println( "sum = "+sum+"\n"+"difference = "+diff+"\n"+"product = "+product+"\n"+"quotient = "+quotient);
    }
    
}
