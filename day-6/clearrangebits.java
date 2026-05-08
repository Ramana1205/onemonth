
public class clearrangebits {
    public static void clearrange(int n,int i,int j){
        int bitmask1= -1<<j+1;
        int bitmask2= (1<<i)-1;
        System.out.println(bitmask2);
        int mask=bitmask1|bitmask2;
        System.out.println(mask&n);
    }
    public static void main(String[] args) {
        int n=10;
        clearrange(n,1,2);
    }
    
}
