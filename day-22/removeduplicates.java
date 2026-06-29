import java.util.*;
public class removeduplicates {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String ns="";
        for(char ch:s.toCharArray()){
            if(ns.indexOf(ch)==-1){
                ns+=ch;
            }

        }
        System.out.println(ns);
    }
}
