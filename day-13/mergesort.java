public class mergesort {
    public static void Mergesort(int s,int e,int[] arr){
        if(s>=e){
            return;
        }
        int mid=s+(e-s)/2;
        Mergesort(s,mid,arr);
        Mergesort(mid+1,e,arr);
        merge(s,mid,e,arr);

    }
    public static void merge(int s,int mid,int e,int[] arr){
        int[] temp=new int[e-s+1];
        int i=s;
        int j=mid+1;
        int k=0;
        while(i<=mid&&j<=e){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                k++; i++;
            }
            else{
                temp[k]=arr[j];
                k++; j++;
            }

        }
        while(i<=mid){
            temp[k]=arr[i];
            k++; i++;
        }
        while(j<=e){
            temp[k]=arr[j];
            j++; k++;
        }
        for(int l=0;l<temp.length;l++){
            arr[s+l]=temp[l];
        }
        

    }
    public static void main(String args[]){
        int arr[]={7,6,5,4,9,1};
        System.out.println("before sorting");
        for(int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
        Mergesort(0,arr.length-1,arr);
        System.out.println();
        System.out.println("after sorting");
        for(int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
