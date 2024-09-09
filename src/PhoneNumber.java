import java.util.*;
class PhoneNumber {
    static List<String> letterCombinations(String digits) {
        //input is empty
        if(digits.length()==0) return Collections.emptyList();
        //list initialiation
        List<String> ans=new ArrayList<String>();
        //keys
        String[] keypad={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        //recursion call
        return combo(digits,keypad,"",ans);
    }

    static List<String> combo(String digits,String[] kp,String rem,List<String> ans){
        //when all digits has been accessed
        if(digits.length()==0){
            ans.add(rem);
            return ans;
        }
        int currNum=digits.charAt(0)-'0';
        String currChoices=kp[currNum];
        //rem refers to empty at first loop of 2s call
        //rem contains a in 3s call in second loop
        for(int i=0;i<currChoices.length();i++){
            combo(digits.substring(1),kp,rem+currChoices.charAt(i),ans);
        }
        return ans;
    }

    public static void main(String[] args) {
        String d="23";
        List<String> ans=letterCombinations(d);
        System.out.println(ans);
    }
}
