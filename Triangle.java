package LABS_1;
import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        Scanner aa= new Scanner(System.in);
        System.out.println("Enter first side of triangle: ");
        int a= aa.nextInt();
        System.out.println("Enter second side of triangle: ");
        int b= aa.nextInt();
        System.out.println("Enter third side of triangle: ");
        int c= aa.nextInt();
        aa.close();
        int s=(a+b+c)/2;
        int area= (s*(s-a)*(s-b)*(s-c))^1/2;
        System.out.println("The area of triangle is: "+area);
    }
    
}
