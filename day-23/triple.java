public class triple{
public static int countTriple(String str) {
  int count=0;
  
  char[] ch=str.toCharArray();
  for(int i=0;i<ch.length-2;i++){
    if(ch[i]==ch[i+1]&&ch[i]==ch[i+2]){
      count+=1;
    }
    
  }
  return count;
}
public static void main(String[] args) {
    int c=countTriple("raaaamannnna");
    System.out.println(c);
}
}