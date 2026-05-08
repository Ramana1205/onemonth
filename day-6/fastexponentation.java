public class fastexponentation {
    public static void fastexponentation(int a,int n){
        int ans=1;
        while(n>0){
            if((n&1)==1){
                ans=ans*a;
            }
            a=a*a;
            n=n>>1;
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        fastexponentation(4,3);
    }
    
}
