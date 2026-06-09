public class gridwayslin {
    public static int fact(int i){
        if(i==0){
            return 1;
        }
        return i*fact(i-1);
    }
    public static int ways(int m,int n,int i,int j){
        int row=m-i;
        int col=n-j;
        int r1=fact((row-1)+(col-1));
        int r2=fact(row-1);
        int r3=fact(col-1);
        return r1/(r2*r3);
    }
    public static void main(String[] args) {
        System.out.println(ways(3,3,1,1));
        
    }
}
