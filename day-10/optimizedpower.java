public class optimizedpower{
    public static int optimizedpoweer(int x,int n){
        if(n==0){
            return 1;
        }
        if(n%2==0){
            return optimizedpoweer(x,n/2)*optimizedpoweer(x,n/2);
        }else{
            return x*optimizedpoweer(x,n/2)*optimizedpoweer(x,n/2);
        }
    }
    public static void main(String[] args) {
        int x=2;
        int n=5;
        System.out.println(optimizedpoweer(x,n));
    }
    
}