import java.util.Scanner;

public class LC_88_MergeSortedArray {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array 1 :");
        int m = scan.nextInt();

        System.out.println("Enter the number of elements in the array 2 :");
        int n = scan.nextInt();

        System.out.println("Enter the elements in the array 1:");
        int nums1[] = new int[m + n];

        for (int i = 0; i < m; i++) {
            nums1[i] = scan.nextInt();
        }
        for (int i = m; i < m + n; i++) {
            nums1[i] = 0;
        }

        System.out.println("Enter the elements in the array 2:");
        int nums2[] = new int[n];

        for (int i = 0; i < n; i++) {
            nums2[i] = scan.nextInt();
        }

        display(nums1);
        display(nums2);

        merge(nums1, m, nums2, n);

        scan.close();

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

      

        int i = m-1 , j = n-1 , k = m+n-1;
        while(j>=0 ){
            if(i>=0 & nums1[i]>nums2[j]){
                nums1[k] = nums1[i];
                i--;
                k--;
            }
            else {
                nums1[k] = nums2[j];
                j--;
                k--;
            }
        }
        display(nums1);
    } 

    public static void display(int[] numbers){

        System.out.println("The elements in the array are :");

        for(int i = 0 ; i < numbers.length ;i++){

            System.out.println(numbers[i]);

        }
    }

}
