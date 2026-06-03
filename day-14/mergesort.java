public class mergesort {
    public static void Mergesort(int s,int e,String[] arr){
        if(s>=e){
            return;
        }
        int mid=s+(e-s)/2;
        Mergesort(s,mid,arr);
        Mergesort(mid+1,e,arr);
        merge(s,mid,e,arr);

    }
    public static void merge(int s,int mid,int e,String[] arr){
        String[] temp=new String[e-s+1];
        int i=s;
        int j=mid+1;
        int k=0;
        while(i<=mid&&j<=e){
            if(arr[i].compareTo(arr[j]) < 0){
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
        String arr[]={"sun","earth","mars","mercury"};
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
