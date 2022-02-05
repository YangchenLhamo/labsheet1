package LABS_1;
import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
       Scanner aa=new Scanner (System.in);
       System.out.println("Enter the length:");
       int l=aa.nextInt();
       System.out.println("Enter the breadth:");
       int b=aa.nextInt();
       aa.close();
       int Area=l*b;
       int Perimeter=(l+b)/2;
       System.out.println("The area of triangle is "+Area+" and the perimeter is "+Perimeter);
    }

}
