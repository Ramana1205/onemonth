public class optimizedpower{
    public static int optimizedpoweer(int x,int n){
        if(n==0){
            return 1;
        }
        int halfpower=optimizedpoweer(x,n/2);
        if(n%2==0){
            return halfpower*halfpower;
        }else{
            return x*halfpower*halfpower;
        }
    }
    public static void main(String[] args) {
        int x=2;
        int n=5;
        System.out.println(optimizedpoweer(x,n));
    }
    
}