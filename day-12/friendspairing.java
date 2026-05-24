

public class friendspairing {
    public static int friendspairing(int n){
        if(n==1||n==2){
            return n;
        }
        return friendspairing(n-1) + friendspairing(n-2)*(n-1);
    }
    public static void main(String[] args) {
        int n=4;
        System.out.println(friendspairing(n));
    }
    
}
