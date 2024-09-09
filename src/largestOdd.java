class largestOdd {
    static String largestOddNumber(String num) {
        char[] numChar=num.toCharArray();
        String ans="";
        int lastIndex=numChar[num.length()-1];
        if(lastIndex%2==1) return num;
        for(int i=num.length()-1;i>=0;i--){
            char ch=numChar[i];
            int n=ch-'0';
            if(n%2!=0){
                return num.substring(0,i+1);
            }
        }
        return ans;
    }


//    static String largestOddNumber(String num) {
//        if((int)num.charAt(num.length()-1)%2==1) return num;
//        int i=num.length()-1;
//        while(i>=0){
//            int n=num.charAt(i)-'0';
//            if(n%2==1) return num.substring(0,i+1);
//            i--;
//        }
//        return "";
//    }

    public static void main(String[] args) {
        String num="1013370900";
        String ans=largestOddNumber(num);
        System.out.println(ans);
    }
}