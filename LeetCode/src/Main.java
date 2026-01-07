import Array.Solution;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {2,5,1,0,4,6};
        int target=11;
        System.out.println("Index array :"+ Arrays.toString(solution.twoSum(arr, target)));
        System.out.println("Index array :"+ Arrays.toString(solution.twoSum1(arr, target)));

        String[] str = {"flower","flow","flight"};
        System.out.println(Solution.longestCommonPrefix(str));

        int[] arr1 = {0,0,1,1,1,2,2,3,3,4};
        System.out.println("Length of the List or Set :"+ solution.removeDuplicates1(arr1));

        int[] arr2 = {0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.println("The length of Array: "+solution.removeElement(arr2,val));
    }
}