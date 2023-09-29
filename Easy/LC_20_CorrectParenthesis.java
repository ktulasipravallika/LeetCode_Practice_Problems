import java.util.Scanner;
import java.util.Stack;

public class LC_20_CorrectParenthesis {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the words to find the common prefix");
        String input = scan.nextLine();
        
        System.out.println("Correct Parenthesis: " + correctbraces(input));
        scan.close();
    }

    public static boolean correctbraces(String str){

        Stack<Character> s = new Stack<>();

        for(int i= 0 ;i < str.length(); i++){
            if(str.charAt(i)=='[') {
                s.push('[');
            }
            else if (str.charAt(i)== ']'){
                if(s.empty()) return false;
                else if(s.peek()=='['){
                s.pop();
               }
               else 
                return false;
            }
            else if(str.charAt(i)=='{'){
                s.push('{');

            } 
            else if (str.charAt(i)== '}'){
                if(s.empty()) return false;
                else if(s.peek()=='{'){
                s.pop();
               }
               else 
                return false;
            }
            
            else if(str.charAt(i)=='('){
                s.push('(');
            }
            else if (str.charAt(i)== ')'){
                if(s.empty()) return false;
                else if(s.peek() == '('){
                s.pop();
               }
               else 
                return false;
            }
        }
        return s.empty();
    }
}


