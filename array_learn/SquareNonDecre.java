import java.util.Arrays;


public class SquareNonDecre {
    public static int[] sortedSquares(int[] A){
        for(int i = 0; i < A.length; i++){
            A[i] *= A[i];
        }
        Arrays.sort(A);
        return A;
    }
    
    public static void main(String[] args) {
        int[] A = {-4,-1,1,3,5};
        sortedSquares(A);
        for(int num : A){
            System.out.println(num);
            
        }
    }
}