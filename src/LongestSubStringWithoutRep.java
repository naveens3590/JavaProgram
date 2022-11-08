import java.util.HashSet;
import java.util.Set;

public class LongestSubStringWithoutRep {
	public static void main(String[] arg) {
		longestSubString("abcabad");
	}
	public static void longestSubString(String s) {
		Set<Character> map=new HashSet<>(); 
		int j=0,max=0;
		for (int i = 0; i < s.length(); i++) {
			char ch=s.charAt(i);
			System.out.println(j);
			while(map.contains(ch)) {
				map.remove(s.charAt(j++));
			}
			map.add(ch);
			max=Math.max(max, i-j+1);
		}
		System.out.println(max);
	}
	
}
