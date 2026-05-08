
import java.util.*;
public class ispowerof2 {
    public static void ispower(int n){
        if ((n & (n - 1)) == 0)
            System.out.println("power of 2");
        else
            System.out.println("not a power of 2");

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ispower(n);
        sc.close();
        
    }
    
}
