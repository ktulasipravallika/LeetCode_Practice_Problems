
import java.util.Scanner;

class Solution {

    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("Enter any number ");
        int x = scan.nextInt();
        System.out.println(isPalindrome(x));
        scan.close();
    }

    public static boolean isPalindrome(int x) {    
        int number = x;
        int reverse = 0;
        while (number!= 0){
            reverse = reverse * 10 + ((number%10));
            number = number / 10;  
        }
       return (reverse == x);
        
    }

}