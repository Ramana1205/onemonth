import java.util.*;


public class array {
   public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
    int arr[]=new int[6];
    for(int i=0;i<6;i++){
        System.out.print("enter subject "+(i+1)+"marks:");
        arr[i]=sc.nextInt();
        System.out.println();
        
    }
    for(int i=0;i<6;i++){
        System.out.print("marks of subject "+i+1+":");
        System.out.println(arr[i]);
    }
   }
}
