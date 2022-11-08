/*Contains Duplicate
 * Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

 

Example 1:

Input: nums = [1,2,3,1]
Output: true
Example 2:

Input: nums = [1,2,3,4]
Output: false
Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
 * 
 * 
 * */
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainDuplicates {
public static void main(String[] args) {
	 int[] iValuesUnique = new int[]{1,2,3,4};
	System.out.println( containsDuplicate(iValuesUnique));
}
public boolean containsDuplicateSet(int[] nums) {
Set hmap=new HashSet<Integer>();
for (int num : nums) {
	if(hmap.contains(num)) {
		return true;
	}
	hmap.add(num);
}
return false;

}
public static boolean containsDuplicate(int[] iValuesUnique) {
	return Arrays.stream(iValuesUnique).distinct().count() != iValuesUnique.length;
}
}
