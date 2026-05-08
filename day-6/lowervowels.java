
import java.util.*;
public class lowervowels {
    public static int count(String s){
        int counnt=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                 counnt++;
            }
        }
        return counnt;
    }
    public static void main(String[] args) {
          
            Scanner sc= new Scanner(System.in);
            String s=sc.nextLine();
            int c=count(s);
            System.out.println(c);    
            sc.close();    
    }
    
}
