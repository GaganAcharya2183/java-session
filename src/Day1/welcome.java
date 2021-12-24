package Day1;
import java.util.Scanner;
import java.util.Scanner;

public class welcome {
    public static void main(String[] args) {
        String hello = "Welcome to the my demo App";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your Name");
        String name = scanner.next();

        System.out.println("__________________________________________________________");
        System.out.println("Hello " + name + "\n" + hello);
        System.out.println("__________________________________________________________");


    }
}

