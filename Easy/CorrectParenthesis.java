import java.util.Scanner;

public class CorrectParenthesis {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the words to find the common prefix");
        String input = scan.nextLine();
        System.out.println("Correct Parenthesis: " + correctParen(input));
        scan.close();
    }

    public static boolean correctParen(String str){

        int squareOpen = 0;
        int flowerOpen = 0;
        int roundOpen = 0;

        for(int i =0 ; i < str.length() ; i++){

           if(str.charAt(i) == '[') {
            squareOpen++;
           }
           else if(str.charAt(i) == ']') {
            if(squareOpen <=0){
                return false;
            }
            squareOpen--;
           }

           else if(str.charAt(i) == '{') {
            flowerOpen++;
           }
           else if(str.charAt(i) == '}') {
            if(flowerOpen <=0){
                return false;
            }
            flowerOpen--;
           }

           else if(str.charAt(i) == '(') roundOpen++;
           else if(str.charAt(i) == ')') {
            if(roundOpen <=0){
                return false;
            }
            roundOpen--;
           }
        }
        return (squareOpen == 0 && flowerOpen == 0 && roundOpen == 0);
    }
}


