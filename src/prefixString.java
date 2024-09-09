import java.util.*;
class prefixString {
        static String longestCommonPrefix(String arr[], int n){
            // code here
            String s1=arr[0];
            String s2="";
            for(int i=0;i<s1.length();i++){
                char ch=s1.charAt(i);
                for(int j=1;j<n;j++){
                    s2=arr[j];
                    if(s2.length()==i){
                        return s2;
                    }
                    if(s2.charAt(i)!=ch){
                        return i==0 ? "-1":s1.substring(0,i);
                    }
                }
            }
            return s1;
        }


    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        String ans=longestCommonPrefix(strs,3);
        System.out.println(ans);
    }
}
