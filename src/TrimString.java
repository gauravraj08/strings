public class TrimString {
    static void trim(String s){
        char[] ch=s.toCharArray();
        int start=0,end=s.length()-1,count=0;
        for(int i=0;i<s.length();i++){
            if(ch[i]!=' ') {
                start=i;
                break;
            }
        }
        for (int i=end;i>start-1;i--){
            if(ch[i]!=' '){
                end=i;
                break;
            }
        }
        count=end-start+1;
        String res=new String(ch,start,end);
        System.out.println(res);
    }
    public static void main(String[] args) {
        String s="   Hello  World   ";
        trim(s);
    }
}
