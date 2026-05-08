import java.util.*;

public class anagrams {
    public static boolean anagram(String s1,String s2){
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        char[] s1c=s1.toCharArray();
        char[] s2c=s2.toCharArray();
        Arrays.sort(s1c);
        Arrays.sort(s2c);
        boolean result=Arrays.equals(s1c,s2c);
    
        return result;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        boolean result=anagram(s1,s2);
        if(result){
            System.out.println("Anagrams");
        }
        else{
            System.out.println("not anagrams");
        }

        
    }
    
}
