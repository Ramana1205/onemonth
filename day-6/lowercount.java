import java.util.*;


public class lowercount {
    public static int count(String s){
        int count=0;
        for(int i=0;i<s.length();i++){
            if(Character.isLowerCase(s.charAt(i))){
                count++;
            }

        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String S=sc.nextLine();
        System.out.println(count(S));
    }
    
}
