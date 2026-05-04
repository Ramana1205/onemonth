public class prefixsumofsubarray {
    public static void main(String[] args){
        int arr[]={1,2,3,4,5};
        int max=Integer.MIN_VALUE;
        int prefix[]=new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum=0;
                if(i==0){
                    sum=prefix[j];
                }
                else{
                    sum=prefix[j]-prefix[i-1];
                }
                if(sum>max){
                    max=sum;
                }
            }
        }
        System.out.println("maximum sum of subarray is: "+max);
    }
}
