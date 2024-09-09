public class ReverseGivenWords {
    static void reverse(String s){
        String temp="";
        String res="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                res=" "+temp+res;
                temp="";
            }
            else{
                temp=temp+s.charAt(i);
            }
        }
        res=temp+res;
        System.out.println(res);
    }
    public static void main(String[] args) {
        String s="Hello How U Doing";
        reverse(s);
    }
}
