import java.util.HashMap;

public class sumOfDigitString {
    static int getLucky(String str,int k){
        HashMap<Character,Integer> map=new HashMap<>();
        char ch='a';
        String res="";
        for(int i=1;i<=26;i++) {
            map.put(ch,i);
            ch++;
        }
        int j=0;
        while(j<str.length()){
            char c=str.charAt(j);
            int temp=map.get(c);

            str=str.substring(j+1);
            res=res+temp;
            System.out.println(res);
        }

        while(k>0) {
            long sum=0;
            for (int i=0;i<res.length();i++){
                sum+=Character.getNumericValue(res.charAt(i));
            }
            res=Long.toString(sum);
            System.out.println(sum);
            k--;
        }
        return Integer.parseInt(res);
    }
    public static void main(String[] args) {
        String str="leetcode";
        int ans=getLucky(str,2);
        System.out.println(ans);
    }
}
