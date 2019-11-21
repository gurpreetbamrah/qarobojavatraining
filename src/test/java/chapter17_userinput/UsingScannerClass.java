package chapter17_userinput;

import java.util.Scanner;

public class UsingScannerClass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String");
        String takingInputFromUser = scanner.next();
        System.out.println("Entered String is-->" + takingInputFromUser);
        System.out.println("Enter the Integer\n");
        int a = scanner.nextInt();
        System.out.println("Entered integer is" + a);
    }
}
