public class DaysOfTheWeek {
    public static void main(String[] args){
        int day = 9; // created a numerical data type
        switch (day){ // using the switch method to swap day of the week

            case 1: // day 1 as been stored so sunday will be printed
                System.out.println("Sunday is the 1st day of the week");
                break;
            case 2:
                System.out.println("Monday is the 2nd day of the week");
                break;
            case 3:
                System.out.println("Tuesday is the 3rd day of the week");
                break;
            case 4:
                System.out.println("Wednesday is the 4th day of the week");
                break;
            case 5:
                System.out.println("Thursday is the 5th day of the week");
                break;
            case 6:
                System.out.println("Friday is the 6th day of the week");
                break;
            case 7:
                System.out.println("Saturday is the 7th day of the week");
                break;
            default:   // if any other entry ias input then it will be invalid
                System.out.println("Invalid choice");
                break;

        }
    }





}
