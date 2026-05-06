// Counting Sort in Java

public class countingsort {
    public static void main(String[] args) {
        int ar[]={1,1,8,8,3,4,0,2};
         for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
        System.out.println();
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<ar.length;i++){
            largest=Math.max(largest, ar[i]);

        }
        int count[]=new int[largest+1];
        for(int i=0;i<ar.length;i++){
            count[ar[i]]++;
        }
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                ar[j]=i;
                j++;
                count[i]--;
            }
        }
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
    }
    
}
