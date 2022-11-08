import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Two Sum https://leetcode.com/problems/two-sum/
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:
Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:
Input: nums = [3,3], target = 6
Output: [0,1]
 * **/
public class TwoSumTarget {
public static void main(String[] args) {
	System.out.println(Arrays.toString(twoSum(new int[] {7,9,11,8,19},19)));
}
public static int[] twoSum(int[] nums, int target) {
    int[] result=new int[2];
	for (int i = 0; i < nums.length; i++) {
		for (int j = i+1; j < nums.length; j++) {
			if(nums[i] + nums[j]==target) {
				result[0]=i;
				result[1]=j;
				return result;
			}
		}
	}
	return null;
     }
public static int[] twoSumUsingMap(int[] nums, int target) {
	Map<Integer,Integer> map=new HashMap<>();
for(int i=0;i<nums.length;i++){
    int dif=target-nums[i];
    if(map.containsKey(dif)){
        return new int[]{map.get(dif),i};
    }
    map.put(nums[i],i);
}
return null;
}

}
