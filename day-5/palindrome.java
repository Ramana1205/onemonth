

public class palindrome {
    public static boolean pal(String s){
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                     return false;

            }
        }
      return true;
    }
    public static void main(String[] args) {
        String s="RACECAR";
        if(pal(s)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }
        
    }
    
}
