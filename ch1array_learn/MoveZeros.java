/**
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Example:

Input: [0,1,0,3,12]
Output: [1,3,12,0,0]
Note:

You must do this in-place without making a copy of the array.
Minimize the total number of operations.
 */
public class MoveZeros {
    //O(N) space complexity
    public static void moveZeros(int[] arr){
        if(arr.length == 0 || arr ==null) 
            return;
        int insertPos = 0;
        for(int e : arr){
            if(e != 0)
                arr[insertPos++] = e;
        }
        while(insertPos < arr.length)
            arr[insertPos++] = 0;
    }
    //O(1)
    public static void moveZeros1(int[] arr){
        int i = 0, j = 0;
        while(j < arr.length){
            if(arr[j] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if(arr[i] != 0)
                i++;
            j++;
        }
    }
    public static void main(String[] args) {
        int[] arr = {0,0,1,2,0,3,4,0,5};
        moveZeros1(arr);
        printArray(arr, arr.length);
    }
    public static void printArray(int[] arr, int length){
        System.out.println("Length of arr is: " + length);
        for(int i = 0; i < length; i++){
            
            System.out.println("Index " + i + "contains" + arr[i]);
        }
        
    }
}