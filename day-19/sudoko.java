public class sudoko {
    public static boolean issafe(int[][]sudoko,int row,int col,int digit){
        for(int i=0;i<9;i++){
            if(sudoko[i][col]==digit) return false;

        }
        for(int j=0;j<9;j++){
            if(sudoko[row][j]==digit)  return false;

        }
        int srow=(row/3)*3;
        int scol=(col/3)*3;
        for(int i=srow;i<srow+3;i++){
            for(int j=scol;j<scol+3;j++){
                if(sudoko[i][j]==digit){
                    return false;
                }

            }
        }
        return true;
    }
    public static boolean sudoko(int[][] sudoko,int row,int col){
        if(row==9){
            return true;
        }
        if(sudoko[row][col]!=0){
                if(col==8){
                    return sudoko(sudoko,row+1,0);
                }else{
                    return sudoko(sudoko,row,col+1);
                }
            }
            boolean solved;
        for(int i=1;i<=9;i++){
            
            if(issafe(sudoko,row,col,i)){
                sudoko[row][col]=i;
                if(col==8){
                  solved=sudoko(sudoko,row+1,0);
                }else{
                    solved=sudoko(sudoko,row,col+1);
                }
                if(solved){
                    return true;
                }
                sudoko[row][col]=0;
            }
        }
        return false;

    }
    public static void printsudoko(int[][] sudoko){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(sudoko[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] sudoko={
            
            {0,0,0,0,0,0,0,0,0},
            {1,2,3,4,5,6,7,8,9},
            {0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0},
        };
        if(sudoko(sudoko,0,0)){
           printsudoko(sudoko);
        }
        
    }
}
