

public class firstocc {
    public static int first(int arr[],int i,int key){
        if(arr[i]==key){
            return i;
        }
        if(i==arr.length-1){
            return -1;
        }
        return(first(arr,i+1,key));
    }
    public static void main(String[] args) {
        int arr[]={1,5,2,3,7,5};
        int key=15;
        System.out.println(first(arr,0,key));
        
    }
    
}
