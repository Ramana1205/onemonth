public class inversioncount {
    public static void inv(int[] arr){
        int count=0;
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
                count++;
            }
            arr[prev+1]=curr;
        }
        System.out.println(count);

    }
    public static void main(String[] args) {
        int arr[]={2,4,1,3,5};
        inv(arr);
        
    }
    
}
