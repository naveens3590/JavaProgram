import java.util.Arrays;

public class NonRepeatingNumbers {
public static void main(String[] args) {
	nonRepeatingonceNumbers(new int[] {1,5,1,5,7,8,7,8,9});
	//nonRepeatingTwiceNumbers(new int[] {1,5,1,5,6,7,8,7,8,9});
	//repeatingTriceNumbers(new int[] {2,2,1,5,1,1,2});
}

private static void nonRepeatingonceNumbers(int[] is) {
	int result1 = 0;
	
	for (int i = 0; i < is.length; i++) {
		result1=result1^is[i];
	}
	System.out.println("nonRepeatingonceNumbers="+result1);
}
private static void nonRepeatingTwiceNumbers(int[] is) {
	int result1 = 0,result2=0;
	
	for (int i = 0; i < is.length; i++) {
		if (is[i] % 2 == 0) {
			result1 = result1 ^ is[i];
		} else {
			result2 = result2 ^ is[i];
		}
	}
	System.out.println("nonRepeatingTwiceNumbers="+result1+","+result2);
}
private static void repeatingTriceNumbers(int[] is) {
	int[] ary=new int[31];
	for (int i = 0; i < is.length; i++) {
		String a=Integer.toBinaryString(is[i]);
		for (int j = 0; j < a.length(); j++) {
			char ch=a.charAt(j);
			if(ch+""=="1") {
				ary[j]=ary[j]+1;
			}
		}
	}
	System.out.println("repeatingTriceNumbers="+Arrays.toString(ary));

}
}



//TC=O(n)
