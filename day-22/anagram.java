import java.util.*;
public class anagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s1=sc.nextLine();
        char ch1[]=s.toCharArray();
        char ch2[]=s1.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if(Arrays.equals(ch1,ch2)) System.out.print("Anagram");
        else System.out.print("not anagram");
    }
    
}
