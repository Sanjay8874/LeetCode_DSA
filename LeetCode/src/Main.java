import Array.Solution;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {2, 5, 1, 0, 4, 6};
        int target = 11;
        System.out.println("Index array :" + Arrays.toString(solution.twoSum(arr, target)));
        System.out.println("Index array :" + Arrays.toString(solution.twoSum1(arr, target)));

        String[] str = {"flower", "flow", "flight"};
        System.out.println(Solution.longestCommonPrefix(str));

        int[] arr1 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println("Length of the List or Set :" + solution.removeDuplicates1(arr1));

        int[] arr2 = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        System.out.println("The length of Array: " + solution.removeElement(arr2, val));

        int[] arr3 = {1, 3, 5, 6};
        int target1 = 5;
        System.out.println("Index of Target1: " + solution.searchInsert(arr3, target1));

        int number = 4;
        solution.helper(number);

        int[] arr6 = {1, 2, 3};
        System.out.println(Arrays.toString(solution.plusOne(arr6)));

        int[] arr7 = {1, 0, 0, 2, 3};
        System.out.println(Arrays.toString(solution.shiftZero(arr7)));

        int[] arr8 = {0};
        int m = 0;
        int[] arr9 = {1};
        int n = 1;
        solution.merge(arr8, m, arr9, n);


        int[] arr10 = {2,2,1};
        System.out.println("SingleNumber: "+solution.singleNumber1(arr10));

        int[] arr11 = {1, 2, 3, 2};
        System.out.println("isDuplicate: "+solution.containsDuplicate(arr11));

        int[] arr12 = {1,2,3,1,2,3};
        int k=3;
        System.out.println("isDuplicate11: "+solution.containsNearbyDuplicate1(arr12,k));

        int[] arr13 = {1,3,2,1};
        System.out.println("Merged arrays: "+ Arrays.toString(solution.getConcatenation(arr13)));

        int[] arr14 = {1,1,1,0,1,1};
        System.out.println("Count of 1: "+ solution.findMaxConsecutiveOnes(arr14));

        int[] arr15 = {1,1};
        System.out.println("SetMisMatch: "+Arrays.toString(solution.findErrorNums(arr15)));
    }
}