

public class fib {
    public static int fibon(int n){
        if(n==0||n==1){
            return n;
        }
        return fibon(n-1)+fibon(n-2);
    }
    public static void main(String[] args) {
        System.out.println(fibon(8));
        
    }
}
