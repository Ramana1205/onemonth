

public class clearlastnbits {
    public static int clearn(int n,int i){
        int bitmask=-1<<i;
        int result=bitmask&n;
        return result;
    }
    public static void main(String[] args) {
        System.out.println(clearn(10,2));
        
    }
    
}
