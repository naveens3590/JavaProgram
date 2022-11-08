
public class SwapNumbers {
public static void main(String[] args) {
	swapNumbers(6888,56556);
}

private static void swapNumbers(int i, int j) {
	i=i^j;
	j=i^j;
	i=i^j;
	
	System.out.println(i+"="+j);
}
}
