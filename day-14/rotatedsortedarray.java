public class rotatedsortedarray {
    public static int search(int[]arr,int s,int e,int target){
        if(s>e) return -1;
        int mid=s+(e-s)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[s]<=arr[mid]){
            if(target>=arr[s] && target<=arr[mid]){
                return search(arr,s,mid-1,target);
            }else{
                return search(arr,mid+1,e,target);
            }
        }else{
            if(target>=arr[mid] && target<=arr[e]){
                return search(arr,mid+1,e,target);
            }else{
                return search(arr,s,mid-1,target);
            }
            

        }
        
    }
    public static void main(String[] args) {
        int []arr={6,7,9,1,2,3,4,5};
        int idx = search(arr,0,arr.length-1,9);
        System.out.println(idx);
        
    }
    
}
