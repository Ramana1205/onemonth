import java.util.*;
public class revstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char ch[]=s.toCharArray();
        for(int i=ch.length-1;i>=0;i--){
            System.out.print(ch[i]);
        }
        
    }
}
