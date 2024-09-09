class needle {
    static int strStr(String haystack, String needle) {
        //indexof returns first occurence of the given string
        return haystack.indexOf(needle);
    }
    public static void main(String[] args) {
        String s="Hello How U Doing";
        String t="How";
        int ans=strStr(s,t);
        System.out.println(ans);
    }
}