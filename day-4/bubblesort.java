public class bubblesort {
    public static void bsort(int ar[]){
        for(int i=0;i<ar.length-1;i++){
            for(int j=0;j<ar.length-1-i;j++){
                if(ar[j]>ar[j+1]){
                    int temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                }
            }
        }
        
    }
    public static void main(String[] args) {
        int ar[]={1,7,2,3,5};
        bsort(ar);
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
        
    }
    
}
