public class PatternMatch {
    private static void pattern(String s1,String s2){
        int n1=s1.length();
        int n2=s2.length();

        int i=0,j=0,count=0;
        while(n1>i){
//            if(j>=n2) j=0;
            if(s1.charAt(i)==s2.charAt(j)){
                count++;
                i++;
                j++;
                if(count==n2){
                    System.out.println(i-count+1);
                    j=0;
                }
            }
            else{
                count=0;
                i++;
                j=0;
            }
        }
    }
    public static void main(String[] args) {
        String s1 = "abceabcdab";
        String s2 = "abcdabc";

        int index = s1.indexOf(s2);

        pattern("captaincaptain","cap");
    }
}
