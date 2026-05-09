import java.util.*;
class swap{
    public static void main(String[] args){
        System.out.println("Enter the two numbers");
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        a=a^b;
        System.out.println("After swapping the numbers are "+a+" and "+b);
        b=a^b;
        a=a^b;
        System.out.println("After swapping the numbers are "+a+" and "+b);

    }
}