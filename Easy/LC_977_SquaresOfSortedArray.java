import java.util.Scanner;

public class LC_977_SquaresOfSortedArray {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");
        int n = scan.nextInt();

        System.out.println("Enter the elements in the array :");
        int[] A = new int[n];

        for (int i = 0; i < n ; i++) {
            A[i] = scan.nextInt();
        }
        int B[] = sortedSquares(A);

        for (int i = 0; i < B.length ; i++) {
            System.out.println(B[i]);
        }
        scan.close();
    }

    public static int[] sortedSquares(int[] nums) {

        int result[] = new int[nums.length];
        int i = 0, j = nums.length -1, p = nums.length-1;

        while(p >= 0){
            if(Math.abs(nums[i]) > Math.abs(nums[j])){
                result[p--] = nums[i] * nums[i];
                i++;
            }
            else{
                result[p--] = nums[j] * nums[j];
                j--;
            }
        }
        return result; 
    }

}