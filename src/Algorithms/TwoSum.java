package Algorithms;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    //Brute Force
    //Time Complexity O(n^2)
    //Space Complexity O(1)
    public static int[] sum(int [] sums, int target){
        for(int i=0; i<sums.length; i++){
            for(int j=i+1; j<sums.length; i++){
                if(sums[j] == target - sums[i]){
                    return new int[]{j, i};
                }
            }
        }
        throw new IllegalArgumentException("No such solution");
    }

    //One Pass Hash Map
    //Time Complexity O(n)
    //Space Complexity O(n)
    public static int[] sumUsingHashMap(int [] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No such solution");
    }

    public static void main(String[]args){
        int [] nums = {
                2, 7, 8, 14
        };

        int target = 15;

        //Return indices
        System.out.println("Brute Force: " + java.util.Arrays.toString(sum(nums, target)));

        System.out.println("One Pass Hash Map: " + java.util.Arrays.toString(sumUsingHashMap(nums, target)));
    }
}
