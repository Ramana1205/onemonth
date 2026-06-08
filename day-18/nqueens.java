
public class nqueens {
    public static boolean issafe(String[][] arr,int row,int col,int n){
        for(int i=row-1;i>=0;i--){
            if(arr[i][col].equals("Q")){
                return false;
            }
        }
        
        for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
            if(arr[i][j].equals("Q")){
                return false;
            }

        }
         for(int i=row-1,j=col+1;i>=0&&j<n;i--,j++){
            if(arr[i][j].equals("Q")){
                return false;
            }

        }
        return true;
    }
    public static boolean nqueens(String[][] arr,int n,int row){
        if(row==n){
            count++;
            System.out.println("_________CHESS BOARD__________");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
            return true;
        }
        for(int i=0;i<n;i++){
            if(issafe(arr,row,i,n)){
                arr[row][i]="Q";
            if(nqueens(arr,n,row+1)){
               return true;
            }
            arr[row][i]="X";
            }
        }
        return false;

    }
    static int count=0;
    public static void main(String[] args) {
        int n=10;
        String s[][]=new String[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                s[i][j]="X";
            }
        }
        nqueens(s,n,0);
        System.out.println(count);
        
    }
}
