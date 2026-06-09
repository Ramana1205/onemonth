public class gridways{
    public static int ways(int m,int n,int i,int j){
        if(i==m||j==n){
            return 0;
        }
        if(i==m-1&&j==n-1){
            return 1;
        }
        int w1=ways(m,n,i+1,j);
        int w2=ways(m,n,i,j+1);
        return w1+w2;


    }
    public static void main(String[] args) {
        int w=ways(2,2,0,0);
        System.out.println(w);
        
    }

}