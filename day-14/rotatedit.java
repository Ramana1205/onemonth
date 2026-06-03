

public class rotatedit {
    public static int search(int[] arr,int s,int e,int t){
    
       while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]==t){
                return mid;
            }
            if(arr[s]<=arr[mid]){
                if(arr[s]<=t && arr[mid]>t){
                    e=mid-1;
                }else{
                    s=mid+1;
                }
            }else{
                if(arr[mid]<t && arr[e]>=t){
                    s=mid+1;
                }else{
                    e=mid-1;
                }
            }
    }
    return -1;

    }
    public static void main(String[] args) {
        int arr[]={5,6,7,8,0,1,2,3};
        System.out.println(search(arr,0,arr.length-1,4));
        
    }
    
}
