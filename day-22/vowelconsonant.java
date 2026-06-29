import java.util.*;
public class vowelconsonant{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine().toLowerCase();
        char ch[]=s.toCharArray();
        int vowel=0,consonent=0;
        for(char c:ch){
            if(Character.isLetter(c)){
                if("aeiou".indexOf(c)!=-1){
                    vowel++;
                }else{
                    consonent++;
                }
            }

        }
        System.out.println("vowels count: "+ vowel);
        System.out.println("consonents count: "+consonent);
    }
}