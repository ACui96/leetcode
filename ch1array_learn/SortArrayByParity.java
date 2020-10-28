public class SortArrayByParity {
    public static int[] sortArrayByParity(int[] A){
        int i = 0, j = A.length - 1;
        while (i < j) {
            if (A[i] % 2 > A[j] % 2) {
                int tmp = A[i];
                A[i] = A[j];
                A[j] = tmp;
            }

            if (A[i] % 2 == 0) i++;
            if (A[j] % 2 == 1) j--;
        }

        return A;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int[] arr1 = sortArrayByParity(arr);
        printArray(arr1, arr1.length);
    }
    public static void printArray(int[] arr, int length){
        System.out.println("Length of arr is: " + length);
        for(int i = 0; i < length; i++){
            
            System.out.println("Index " + i + "contains" + arr[i]);
        }
        
    }
}