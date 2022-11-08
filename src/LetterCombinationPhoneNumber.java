import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LetterCombinationPhoneNumber {
public static void main(String[] args) {
	System.out.println(letterCombinations("23"));
}
public static List<String> letterCombinations(String digits) {
    HashMap<Character,String> h = new HashMap<>();
    h.put('2',"abc");
    h.put('3',"def");
    h.put('4',"ghi");
    h.put('5',"jkl");
    h.put('6',"mno");
    h.put('7',"pqrs");
    h.put('8',"tuv");
    h.put('9',"wxyz");
    
    List<String> ans = new ArrayList<>();
    ans.add(""); // intial string so that other characters can be appended 
    
    // Go to every digit and get mapping string
    for(int i =0;i<digits.length();i++){
        String add = h.get(digits.charAt(i));
        List<String> temp = new ArrayList<>();
        
        // add characters of mapping to existing ans one by one 
        for(int j =0;j<add.length();j++){
            for( String each : ans){
                String m = each + String.valueOf(add.charAt(j));
                temp.add(m);
            }
        }
        ans = temp;
    }
    
    // to handle empty digits
    if(ans.get(0).equals("")){
        List<String> ans2 = new ArrayList<>();
        return ans2;
    }
    return ans;
}
}
