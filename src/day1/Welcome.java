package day1;
import java.util.Scanner;

public class Welcome {
    public static void main(String[] args) {
        String hello = "Welcome to my demo App";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = scanner.next();

        System.out.println("__________________________________________________________");
        System.out.println("Hello " + name + "\n" + hello);
        System.out.println("This app performs multiplications");
        System.out.println("__________________________________________________________");

        System.out.println("Please enter the number of multiplication you want to perform. ");
        int num= scanner.nextInt();
        System.out.println("__________________________________________________________");
        for(int i=0; i<num; i++) {

            System.out.println("Please enter the first number");
            //getting input for first number and storing it
            double num1 = scanner.nextDouble();
            System.out.println("Please enter the first number");
            //getting input for second number and storing it
            double num2 = scanner.nextDouble();
            System.out.println("__________________________________________________________");
            double result = num1 * num2;

            System.out.println("The result of " + num1 + " multiplied by " + num2 + " is :" + result);
            System.out.println("__________________________________________________________");
        }
        System.out.println("Thank you for using the App\n" + "Have a good day");
        System.out.println("__________________________________________________________");


    }
}

