import java.util.Scanner;

public class TwoNumberCalculation
{
    public static void main(String [] args)
    { int a, b, ans;// using variable "int" data type, a and b is the variable names
      char n;//  using character variable data type  and "n" will be used as a symbol
        Scanner scanner= new Scanner(System.in);//scanner method to take user input
        System.out.println("Enter one number");// user input first number
        a = scanner.nextInt();
        System.out.println("Enter another number"); //user input second number
        b = scanner.nextInt();
        System.out.println("Enter operator(+, -, *,/) :");// user inputs operator og their choice
        n = scanner.next().charAt(0);
        switch (n)
        {
            case '+':
                ans = a + b;
                System.out.println("Result = "+ans); // printing addition
                break;
            case '-':
                ans = a - b;
                System.out.println("Result =" +ans);// printing subtraction
                break;
            case '*':
                ans = a * b;
                System.out.println("Result = " +ans);// printing mulitiplication
                break;
            case '/':
                ans = a / b;
                System.out.println("Result =" +ans);// printing divide
                break;
            default: // if non of the above then invalid showed print
                System.out.println("Invalid");
                break;
        }
        }

        }



