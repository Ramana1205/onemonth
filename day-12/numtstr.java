public class numtstr {
    public static void numts(int n){
        if(n==0){
            return;
        }
        String s[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
        int last=n%10;
        numts(n/10);
        System.out.print(s[last]+" ");
    }
    public static void main(String[] args) {
        int n=1234;
        numts(n);
    }
}
