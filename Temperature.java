package LABS_1;
import java.util.Scanner;
public class Temperature {
    public static void main(String[] args) {
        Scanner tt= new Scanner(System.in);
        System.out.println("Enter temperature in system: ");
        int F= tt.nextInt();
        int Celcius= ((F-32)*5)/9;
        System.out.println("the temperatur in Celcius is "+Celcius);
        tt.close();
    }
}
