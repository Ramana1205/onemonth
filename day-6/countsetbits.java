import java.util.*;

public class countsetbits {
    public static void setbit(int n){
        int count=0;
        while(n>0){
            if((n&1)!=0){
                count++;
            }
            n=n>>1;

        }
        System.out.println(count);

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        setbit(n);
        sc.close();
    }
    
}
