import java.util.Scanner;

public class PositiveNegativeZero {

    public static void main(String[] args) {

        int num = 7; // variable data type been created
        Scanner scanner = new Scanner(System.in);// taking user input
        System.out.println("enter any number");
        scanner.nextInt();
        if (num >0) // checking if the number is greater than 0 it should print positive
                System.out.println("is positive");
        else if (num<0) {   // checking if the number is below 0 then it  should print negative
            System.out.println("this is negative");
        } else {
            System.out.println("is Zero"); // non of the above then zero should be printed
        }




        }
}
















