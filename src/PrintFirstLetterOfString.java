public class PrintFirstLetterOfString {
    static void printFirstL(String s){
        char[] ch=s.toCharArray();
        for(int i=0;i<s.length();i++) {
            if(ch[i]!=' '){
                if(i==0){
                    System.out.print(ch[i]+" ");
                } else if (ch[i-1]==' ') {
                    System.out.print(ch[i]+" ");
                }
            }
        }
    }
    public static void main(String[] args) {
        String str=" Hello  King";
        printFirstL(str);
    }
}
