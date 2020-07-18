/**
 * Given an array of integers A sorted in non-decreasing order, return an array of the squares of each number, also in sorted non-decreasing order.

 

Example 1:

Input: [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Example 2:

Input: [-7,-3,2,3,11]
Output: [4,9,9,49,121]
 */
import java.util.Arrays;

public class SquaresOfSortedArray {
    public static int[] squaresOfSortedArray(int[] A){
        for(int i = 0; i < A.length; i++){
            A[i] *= A[i];
        }
        Arrays.sort(A);
        return A;
    }
    public static void main(String[] args) {
        int[] A = {0,-1,2,-3,4,9};
        int[] B = squaresOfSortedArray(A);
        printArray(B, B.length);
    }
    public static void printArray(int[] arr, int length){
        System.out.println("Length of arr is: " + length);
        for(int i = 0; i < length; i++){
            
            System.out.println("Index " + i + "contains" + arr[i]);
        }
        
    }
}