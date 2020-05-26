package code-wars-problem-solution;

public import java.util.*;
public class Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter credit card number as a long integer");
        long creditCardNumber = input.nextLong();                            // credit card number
        boolean validity = isValid(creditCardNumber);                        // credit card validity method call
        if (validity) {
            System.out.println(creditCardNumber + " is valid");              // output option
        }
        else {
            System.out.println(creditCardNumber + " is invalid");
        }
        
    }

    public static boolean isValid(long number) {               // credut card validity nethod
        boolean prefixMatch = true;                            // variable to show credit card number prefix match
        int[] prefix = {4, 5, 37, 6};
        boolean validity = true;
        long getPrefix = getPrefix(number, 16);                  // method call to check if the credit card number size is valid

        if (getPrefix == number) {
            validity = true;                                    // check for credit card number size validity
        }
        else {
            validity = false;
            return validity;
        }

        for (int i = 0; i<4; i++) {                                // looping through the variuos option prefix  number
            prefixMatch = prefixMatch(number, prefix[i]);          // method for checking prefix match
            if (prefixMatch) {
                validity = true;
                break;                                             // breaking out of loop if there is a prefix match
            }
            else if (i == 3) {
                validity = false;
                return validity;
            }
        }

        int sumOfDoubleEvenPlace = sumOfDoubleEvenPlace(number);         // sum of the doubled even places method
        int sumOfOddPlaces = sumOfOddPlaces(number);                     // sum of odd places method
        int sumOfOddAndEven = sumOfDoubleEvenPlace + sumOfOddPlaces;     // adding the even and odd places

        if ((sumOfOddAndEven % 10) == 0) {                               // check to see if the addition of even and odd places is divisible by 10
            validity = true;
            return validity;
        }
        else {
            validity = false;
            return validity;
        }
        
    } 

    public static int getSize(long d) {                   // getting the size of the credit card number method
        String intToString = Long.toString(d);              // converting the numbers to string
        int numberOfDigits = intToString.length();          // getting the length
        return numberOfDigits;
    }

    public static long getPrefix(long number, int k) {      // getPrefix method for checking if the credit card number size is valid
        int numberOfDigits = getSize(number);                // getsize method call
        if (numberOfDigits <= k) {                          // checking size validity
            number = number;
        }
        else {
            number = 0;
        }
        return number;
    }

    public static boolean prefixMatch(long number, int d) {           // method for checking if the credit card number has a valid prefix
        boolean isAMatch = true;   
        char[] characterConversion = Long.toString(number).toCharArray();    // converting the number into character arrays
        String charToString__1 = Character.toString(characterConversion[0]);   //converting the first number to a string
        String charToString__2 = Character.toString(characterConversion[1]);   // converting the second number into a string
        int numberConversion__1 =  Integer.parseInt(charToString__1);          // conversion back to integer
        int numberConversion__2 = Integer.parseInt(charToString__2);
        int numberConversion__3 = Integer.parseInt(charToString__1 + charToString__2);  // converting the first and second number to integer

        if ((d == numberConversion__1)                                             // checking for match
        || (d == numberConversion__2) 
        || (d == numberConversion__3)) {
            isAMatch = true;
        }
        else {
            isAMatch = false;
        }
        return isAMatch;
    }

    public static int sumOfDoubleEvenPlace(long number) {                     // sum of the doubled even places method
        int numberSize = getSize(number);                                     // get size method call
        int sumOfDoubleEvenPlace = 0;
        char[] characterConversion = Long.toString(number).toCharArray();        // converting the number into character arrays
        for (int i = 2; i < (numberSize + 1); i++) {                            // looping through the numbers and extracting the even number place values
            String charToString = Character.toString(characterConversion[numberSize - i]);  // character to string conversion
            i = i + 1;
            int getDigits = getDigits(Integer.parseInt(charToString));               // conversion to integer
            sumOfDoubleEvenPlace = sumOfDoubleEvenPlace + getDigits;                  // summing it up
        }
        return sumOfDoubleEvenPlace;
    }

    public static int getDigits(int number) {                                        // getting the doubled even places values method
        number = number*2;
        char[] numberToCharacter = Integer.toString(number).toCharArray();          // converting the number into character arrays
        if (numberToCharacter.length == 2) {                                        // checking if the doubled value is a 2 digit number
            number = (Integer.parseInt(Character.toString(numberToCharacter[0]))) + (Integer.parseInt(Character.toString(numberToCharacter[1])));   // summing the 2 digit number
        }
        return number;
    }

    public static int sumOfOddPlaces(long number) {                                 // sum of odd places values method
        int numberSize = getSize(number);                                           // get size method call
        int sumOfOddPlaces = 0;
        char[] characterConversion = Long.toString(number).toCharArray();             // converting the number into character arrays
        for (int i = 0; i < (numberSize); i++) {                                     // iterating over the numbers and extracting the odd places values
            int charToInt = Integer.parseInt(Character.toString(characterConversion[(numberSize - 1) - i]));
            i = i + 1;
            sumOfOddPlaces = sumOfOddPlaces + charToInt;
        }
        return sumOfOddPlaces;
    }
}class credit card verification {
    
}