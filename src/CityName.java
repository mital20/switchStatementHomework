import java.util.Scanner;

public class CityName
{
    public static void main(String[] args) // using main method
    {
       char ch; //primitive data type
        Scanner scanner = new Scanner(System.in);// user input
        System.out.println("Enter Alphabet A to Z");// user choosing alphabet from A to Z
        ch = scanner.next().charAt(0); // to read the variable char
        switch (ch){      // switch method to change each alphabet and getting city name
            case 'a':
                System.out.println("Amdadabad");
                break;
            case 'b':
                System.out.println("Bern");
                break;
            case 'c':
                System.out.println("Calacatta");
                break;
            case 'd':
                System.out.println("Dehli");
                break;
            case 'e':
                System.out.println("El Paso Texas");
                break;
            case 'f':
                System.out.println("Fakenham");
                break;
            default: // if user enter any other than A to F then it will show invalid
                System.out.println("Invalid entry");

        }









    }


}
