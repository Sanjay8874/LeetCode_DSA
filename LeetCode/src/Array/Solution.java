package Array;

import java.util.*;

public class Solution {

    /**
     * @param strs Array of String
     * @return Common prefix substring
     */
    /*Longest Common Prefix*/
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Start with the first string in the array as the prefix
        String prefix = strs[0];

        // Compare the prefix with each string in the array
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                // Reduce the prefix by one character at a time
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }

    /**
     * First Approach
     *
     * @param nums   Array of elements
     * @param target Targeted sum
     * @return return the Index of value which sum is equal to the Target
     * TIME COMPLEXITY- O(n^2)
     */
    /*1. Two Sum*/
    public int[] twoSum(int[] nums, int target) {
        int[] twoSum = new int[2];
        for (int i = 0; i <= nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    twoSum[0] = i;
                    twoSum[1] = j;
                }
            }
        }
        return twoSum;
    }

    /**
     * First Approach
     *
     * @param nums   Array of elements
     * @param target Targeted sum
     * @return return the Index of value which sum is equal to the Target
     * TIME COMPLEXITY- O(n)
     */
    public int[] twoSum1(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] twoSum = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int required = target - nums[i];
            if (map.containsKey(required)) {
                twoSum[0] = map.get(required);
                twoSum[1] = i;

            }
            map.put(nums[i], i);
        }
        return twoSum;

    }

    /**
     * 1st Approach
     *
     * @param nums Array of Elements
     * @return the size of Set or List.
     */
    public int removeDuplicates(int[] nums) {
        List<Integer> number = new ArrayList<>();
        for (int i : nums) {
            number.add(i);
        }
        Set<Integer> distinctElement = new HashSet<>(number);
        System.out.println("after remove duplicate :" + distinctElement);
        return distinctElement.size();
    }

    /**
     *
     * @param nums
     * @return
     */
    public int removeDuplicates1(int[] nums) {
        int l = nums.length;
        int index=1;
        for(int i=0;i<l-1;i++){
            if(nums[i]!=nums[i+1]){
                nums[index]=nums[i+1];
                index++;
            }
        }

        return index;

    }



}


