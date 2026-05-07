

public class staircase {
    public static boolean staircase(int arr[][],int target){
        int row=arr.length-1;
        int col=0;
        while(col<=arr[0].length-1 && row>=0){
            if(arr[row][col]==target){
                System.out.println("element found at: ("+row+","+col+")");
                return true;
            }
            else if(arr[row][col]>target){
                row--;
            }
            else{
                col++;
            }
        }
        System.out.println("element not found");
        return false;

    }
    public static void main(String[] args) {
        int arr[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        staircase(arr,0);
        
    }
}
