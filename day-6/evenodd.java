import java.util.*;

public class evenodd {
    public static boolean check(int number){
        int result=number&1;
        if(result==0)
            return true;
        else
            return false;

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        boolean result=check(sc.nextInt());
        if(result){
            System.out.println("even");
        }
        else
            System.out.println("odd");
    }
    
}
