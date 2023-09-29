import java.util.Scanner;

class LC_1_TwoSum {
    public static int[] twoSum(int[] nums, int target) {

        int A[] = new int[2];

        for(int i = 0 ; i < nums.length ; i++){

            for(int j = 0 ; j < nums.length ; j++){

                if(i!=j && nums[i]+nums[j] == target){

                    A[0] = i;
                    A[1] = j;
                }
            }      
        }
        return A;
    }

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of element you want to enter");
        int n = scan.nextInt();
        int A[] = new int[n];

        System.out.println("Enter the elements");
        for(int i = 0 ; i < n ; i++){
            A[i] = scan.nextInt();
        }

        System.out.println("Enter the target element you want to search for");
        int target = scan.nextInt();

        int result[] = twoSum(A, target);

        for(int i = 0 ; i < 2; i++){
            System.out.println(result[i]); 
        }
        scan.close();
    }
}