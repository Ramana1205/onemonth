public class maxsumkadanes {
    public static void main(String[] args){
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        int maxsum=Integer.MIN_VALUE;
        int sum=0;
        int negative=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum>maxsum){
                maxsum=sum;
            }
            if(sum<0){
                sum=0;
            }
            if (arr[i]< negative){
                negative=arr[i];
            }
        }
        if(maxsum==0){
            maxsum=negative;
        }
        else{
             System.out.println("maximum subarray sum is:"+maxsum);
        }
       
    }
}
