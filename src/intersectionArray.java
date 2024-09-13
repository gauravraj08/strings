import java.util.ArrayList;
import java.util.Arrays;

public class intersectionArray {
    static int[] intersection(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int i=0,j=0;
        ArrayList<Integer> ans = new ArrayList<>();
        while(n1>i){
            if(j>n2) j=0;
            while(n2>j){
                if(nums1[i]==nums2[j]){
                    ans.add(nums1[i]);
                }
                j++;
            }
            i++;
        }
        int[] result = ans.stream().mapToInt(Integer::intValue).toArray();
        return result;
    }

    public static void main(String[] args) {
        int[] arr1={1,2,2,1};
        int[] arr2={2,2};
        int[] ans=intersection(arr1,arr2);
        System.out.println(Arrays.toString(ans));
    }
}
