public class ReverseString {


    public static void main(String[] args) {

        String alphabet = "fedcba"; // using  variable string
        switch (alphabet){ // using switch method to get the reverse alphabet
            case "abcdef":// if it been done reverse the correct way should have been print
                System.out.println("The reverse of the String abcdef is fedcba");
                break;
            case "fedcba": // it shows the reverse string
                System.out.println("The reverse of the String fedcba is abcdef.");
                break;


        }
    }



}
