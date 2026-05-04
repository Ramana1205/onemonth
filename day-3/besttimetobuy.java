public class besttimetobuy {
    public static void main(String[] args){
        int arr[]={7,1,5,3,6,4};
        int minprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<minprice){
                minprice=arr[i];
            }
            else if(arr[i]-minprice>maxprofit){
                maxprofit=arr[i]-minprice;
            }
        }
        System.out.println(maxprofit);
    }
}
