import java.util.*;
public class sumofsubarray {
    public static void main(String[] args){
        int arr[]={1,2,3,4,5};
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                    System.out.print(arr[k]+" ");
                }
                System.out.println("sum of subarray from index "+i+" to "+j+" is: "+sum);
                if(sum>max){
                    max=sum;
                }
            }
        }
        System.out.println("maximum sum of subarray is: "+max);
    }
}
