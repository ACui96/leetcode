/**
 * Given an array arr, replace every element in that array with the greatest element among the elements to its right, and replace the last element with -1.

After doing so, return the array.

 

Example 1:

Input: arr = [17,18,5,4,6,1]
Output: [18,6,6,6,1,-1]
 */
public class ReplaceElement{
    /**
     * Explanation:
     * @param A
     * @return A
     * Iterate from the back to start.
     * Initial mx=-1 ,where mx represents the max on the right.
     * Each round ,we set A[i] = mx, where mx is its max on the right.
     * Also we update mx = max(mx, A[i]), where A[i] is its orignal value. 
     */
    public static int[] ReplaceElementWithGreatedtOnTheRight(int[] A){
        for(int i = A.length - 1, mx = -1; i >= 0; i--){
            mx = Math.max(A[i], A[i] = mx);
        }
        return A;
    }
    //Expanded version
    public static int[] ReplaceElementWithGreatedtOnTheRight2(int[] A){
        int mx = -1, n = A.length, a;
        for(int i = n - 1; i >= 0; i--){
            a = A[i];
            A[i] = mx;
            mx = Math.max(a, mx);
        }
        return A;
    }

    public static void main(String[] args) {
        int[] A = {17,18,5,4,6,1};
        int[] B = ReplaceElementWithGreatedtOnTheRight(A);
        System.out.println("算法1");
        for(int e : B){
            
            System.out.println(e);
        }
        System.out.println("算法2");
        int[] D = {17,18,5,4,6,1};
        int[] C = ReplaceElementWithGreatedtOnTheRight2(D);
        System.out.println("算法1");
        for(int e : B){
            
            System.out.println(e);
        }
        System.out.println("算法2");
        for(int e : C){
            
            System.out.println(e);
        }
    }
}