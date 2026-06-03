public class quicksort {
    public static void main(String[] args){
        int[] arr = {5, 2, 9, 1, 5, 6};
        quickSort(arr, 0, arr.length - 1);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    public static void quickSort(int[] arr,int s,int e){
        if(s<e){
            int p = partition(arr, s, e);
            quickSort(arr, s, p-1);
            quickSort(arr, p+1, e);
        }
    }
    public static int partition(int[] arr,int s,int e){
        int pivot=arr[e];
        int i=s-1;
        for(int j=s;j<e;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[e];
        arr[e]=temp;
        return i+1;
    }
    
}
