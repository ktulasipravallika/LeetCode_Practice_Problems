import java.util.Scanner;

public class RomanToIntegaer {
    // Input - String, Output - int
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String");
        String roman = scan.nextLine();
        Boolean isRoman = true;

        for (char c : roman.toCharArray()) {
            if (!(c == 'I' || c == 'V' || c == 'X' || c == 'L' || c == 'C' || c == 'D' || c == 'M')) {
                isRoman = false;
            }
        }

        if (isRoman) {
            System.out.println("The number is :" + romanToInteger(roman));
        } else {
            System.out.println("The entered String doest not contain roman numbers");
        }
        scan.close();
    }

    public static int romanToInteger(String roman) {

        int number = 0;
        int currentVal = 0;
        int nextVal= 0;

        for(int i = 0 ; i < roman.length() ; i++){

            currentVal = singleRoman(roman.charAt(i));

            nextVal = (i < roman.length()-1)?singleRoman(roman.charAt(i+1)): 0;
            
            if(currentVal < nextVal){
                number = number + (nextVal - currentVal);
                i++;
            }
            else{
                number = number + currentVal;
            }
        }
        return number;
    }

    public static int singleRoman(char roman) {

        if (roman == 'I')
            return 1;
        if (roman == 'V')
            return 5;
        if (roman == 'X')
            return 10;
        if (roman == 'L')
            return 50;
        if (roman == 'C')
            return 100;
        if (roman == 'D')
            return 500;
        if (roman == 'M')
            return 1000;
        return -1;
    }

}
