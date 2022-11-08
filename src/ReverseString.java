
public class ReverseString {
 public static void main(String[] arg) {
	 reverserString("aba");
 }

 private static void reverserString(String str) {
	 StringBuilder builder=new StringBuilder();
	 for (int i = str.length()-1; i >= 0; i--) {
		char c=str.charAt(i);
		builder.append(c);
	}
	 if(builder.toString().equals(str)) {
		 System.out.println(true);
	 }else {
		 System.out.println(false);
	 }
 }
}
