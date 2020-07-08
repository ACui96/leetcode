public class MergeSortedArray {
    public static void mergeSortedArray(int[] nums1, int m, int[] nums2, int n){
        //from back to front
        int tail1 = m-1,tail2 = n-1,insert = m + n -1;
        while(tail1 >= 0 && tail2 >= 0){
            //insert the bigger one between two arrays to the end of nums1
            nums1[insert--] = nums1[tail1] >= nums2[tail2] ? nums1[tail1--] : nums2[tail2--];
        }
        while(tail2 >= 0){
            //if nums2 still has elements,copy them to the num1
            nums1[insert--] = nums2[tail2--];
        }
    }

    public static void main(String[] args) {
        int[] A = {1,2,6,0,0,0,0};
        int[] B = {1,2,3,4};
        mergeSortedArray(A, 3, B, 4);
        printArray(A);
    }
    public static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println("Index " + i + "contains" + arr[i]);
        }
        
    }
}