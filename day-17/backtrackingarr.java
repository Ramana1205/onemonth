

public class backtrackingarr {
    public static int[] backtracking(int[] arr,int val[],int i){
        if(i==arr.length){
            
            return val;
        }
        val[i]=arr[i];

        backtracking(arr,val,i+1);
        val[i]-=2;
        return val;

    }
    public static void main(String[] args) {
        int[] arr = { 3, 2, 3 };
        int[] val=new int[arr.length];
        val=backtracking(arr,val,0);
        for(int i=0;i<val.length;i++){
            System.out.print(val[i]+" ");
        }
    }
}
