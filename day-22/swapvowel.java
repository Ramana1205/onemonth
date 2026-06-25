import java.util.*;
public class swapvowel {
    public static void main(String[] args) {
        System.out.println("Enter the string");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char ch[]=s.toCharArray();
        int i=0,b=ch.length-1;
        while(i<b){
            if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'){
                while(b>i){
                    if(ch[b]=='a'||ch[b]=='e'||ch[b]=='i'||ch[b]=='o'||ch[b]=='u'){
                        char temp=ch[b];
                        ch[b]=ch[i];
                        ch[i]=temp;
                        break;
                    }
                    b--;
                }

            }
            i++;
        }
        for(int j=0;j<ch.length;j++){
            System.out.print(ch[j]);
        }

        
    }
}
