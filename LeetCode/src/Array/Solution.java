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
     * second Approach
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
     * @param nums
     * @return
     */
    public int removeDuplicates1(int[] nums) {
        int l = nums.length;
        int index = 1;
        for (int i = 0; i < l - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                nums[index] = nums[i + 1];
                index++;
            }
        }

        return index;

    }

    /**
     * @param nums Array of Element
     * @param val  Element to be removed from Array
     * @return return length of a Modified array
     * The Solution is correct it is returning the correct and expected value,
     * but it's not modifying the existing array as expected by the LeetCode problem
     */


    /*Remove Element*/
    public int removeElement(int[] nums, int val) {
        int count = 0;
        int l = nums.length;
        for (int i = 0; i <= nums.length - 1; i++) {
            if (nums[i] == val) {
                count++;
            }
        }
        return l - count;
    }

    /**
     * @param nums Array of Element
     * @param val  Element to be removed from Array
     * @return return length of a Modified array
     */
    /*Remove Element*/
    public int removeElement1(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }

    /*Search Insert Position*/
    /*Solve this problem once you learn about Searching in Algo */
    public int searchInsert(int[] nums, int target) {
        return 0;
    }

    /**
     * @param digits Array of elememt
     * @return return a new array with increment.
     */
    /*plusOne*/
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        /*if all elements are 9, we have to increase the size of array */
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }

    public void helper(int number) {
        int div = number / 10;
        int mod = number % 10;
        System.out.println("div is: " + div + " mod is: " + mod);
    }

    /**
     * @param arr Array of elements
     * @return return result array
     */
    public int[] shiftZero(int[] arr) {

        /*1-Shift all non-zero to starting of an array*/
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }
        /*2-keep all zero to End*/
        for (int i = index; i < arr.length; i++) {
            arr[i] = 0;
        }
        return arr;
    }

    /**
     * @param nums1 first Array
     * @param m     Length of nums1
     * @param nums2 second Array
     * @param n     Length of second Array
     */
    /*Merge Sorted Array*/
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        while (m != nums1.length) {
            nums1[m] = nums2[i];
            m++;
            i++;
        }
        Arrays.sort(nums1);
    }

    /**
     * This is the best solution
     * @param nums Array of elements
     * @return return the single elements.
     * Time complexity O(n), and space complexity O(1)
     */
    /*136. Single Number*/
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }

    /*Another approach using Hash Map*/
    public int singleNumber1(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int singleNumber= 0;
        for (int num:nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }
         for (Map.Entry<Integer, Integer> entry: map.entrySet()){
             if (entry.getValue()==1){
                singleNumber=entry.getKey();
             }
         }
         return singleNumber;
    }

    /**
     *
     * @param nums Array of elements
     * @return return boolean when any duplicate finds
     */
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                return true;
            }
        }
        return false;
    }


    /* Second Approach->we can use the Hashmap for find duplicate in arrays*/
    public boolean containsDuplicate1(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        boolean isDuplicate = false;
        for (int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for (Map.Entry<Integer,Integer> entry: map.entrySet()){
            if (entry.getValue() > 1) {
                isDuplicate = true;
                break;
            }
        }
        return isDuplicate;
    }

    /*First Approach, O(n^2)*/
    public boolean containsNearbyDuplicate(int[] nums, int k) {
            for (int i=0;i<nums.length;i++){
                for (int j=i+1;j<nums.length;j++){
                    if (nums[i]==nums[j] && Math.abs(i-j)<=k){
                        return true;
                    }
                }
            }
            return false;
    }

    /*Second and best Approach, O(n)*/
        public boolean containsNearbyDuplicate1(int[] nums, int k) {
            Map<Integer, Integer> seen = new HashMap<>();

            for (int i = 0; i < nums.length; i++) {
                int val = nums[i];
                if (seen.containsKey(val) && i - seen.get(val) <= k) {
                    return true;
                }
                seen.put(val, i);
            }

            return false;
        }

}




