import java.util.Scanner;

public class pilesOfChoco {
    static int maximum(int[] arr,int n){
        int max=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    static void rem(int[] arr,int n){
        int max=maximum(arr,n);
        for(int i=0;i<n;i++){
            if(arr[i]==max){
                arr[i]=square(max);
                //else use arr[i]=(int)Math.sqrt(max)
                return;
            }
        }
    }
    static int square(int max){
        int count=0;
        int i=1;
        for(i=1;i<max/2;i++){
            if(i*i==max){
                count++;
                return i;
            }
        }
        if(count==0){
            for(i=1;i<max/2;i++){
                if(i*i>max){
                    return i-1;
                }
            }
        }
        return i;
    }
    static void remains(int[] arr,int n,int k){
        for(int i=0;i<k;i++){
            rem(arr,n);
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=5;
        int[] arr={25,64,9,4,100};
        int k=4;
//        int n=sc.nextInt();
//        int[] arr=new int[n];
//        for(int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//        }
//        int k= sc.nextInt();
        remains(arr,n,k);
    }
}
