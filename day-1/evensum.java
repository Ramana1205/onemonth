import java.util.*;
class evensum{
    public static void main(String[] args){
        int evensum=0;
        int oddsum=0;
        int choice;
        Scanner sc = new Scanner(System.in);
        do{
            int n=sc.nextInt();
            if(n%2==0){
                evensum += n;
            }
            else{
                oddsum += n;
            }
            System.out.println("Do you want to continue? (1 for yes, 0 for no)");
            choice=sc.nextInt();
        }while(choice==1);
        System.out.println("Sum of even numbers: " + evensum);
        System.out.println("Sum of odd numbers: " + oddsum);
        sc.close();
    }
}