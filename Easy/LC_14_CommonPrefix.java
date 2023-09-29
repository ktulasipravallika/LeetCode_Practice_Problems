import java.util.Scanner;

public class LC_14_CommonPrefix {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of words you want to check ");
        int n = scan.nextInt();

        scan.nextLine();

        System.out.println("Enter the words to find the common prefix");
        String words[] = new String[n];

        for(int i = 0 ; i < n ; i++){
            words[i] = scan.nextLine();
        }

        System.out.println("The common words are " + commPrefix(words));
        scan.close();
    }
    
    public static String commPrefix(String[] str){

        StringBuilder sameWords = new StringBuilder("");
      
        String compareString = str[0];

        for(int i = 0 ; i < compareString.length() ; i++ ) {
            char c = compareString.charAt(i);
            
            for(int j = 1 ; j < str.length ; j++) {
                if(i >= str[j].length() || str[j].charAt(i) != c ){
                    return sameWords.toString();
                }
            }
            sameWords.append(c).toString(); 
        }     
        return sameWords.toString(); 
    }
}
