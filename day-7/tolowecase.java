import java.util.*;

public class tolowecase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
       for(char ch : str.toCharArray()){
           if(ch>='A' && ch<='Z'){
               ch=(char)(ch|' ');
           }
           System.out.println(ch);
       }
    }
   
}
