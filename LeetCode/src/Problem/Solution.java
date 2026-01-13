package Problem;

public class Solution {
    public int missingNumber(int[] arr, int n){
        int sumOfN = (n^2+n)/2;
        int sumOfArr = 0;
        for (int j : arr) {
            sumOfArr = j + sumOfArr;
        }
        return sumOfN-sumOfArr;
    }
}
