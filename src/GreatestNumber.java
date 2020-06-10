import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        int a, b, c; // created variable data type
        Scanner scanner = new Scanner(System.in);// created scanner to take user input
        System.out.println("enter your first number");
        a = scanner.nextInt();
        System.out.println("enter your second number");
        b = scanner.nextInt();
        System.out.println("enter your third number");
        c = scanner.nextInt();
        if (a > b && a > c) // checking if a is greater than b and a is greater than c
                System.out.println(" largest number is "+ a);// if that is true then a wil be printed
        else if( b>c) // checking if b is greater than c
                System.out.println("largest number is" + b );// than be ill be printed

         else
                System.out.println("largest number is"+ c);// if non of the above then c should be printed
        }




    }