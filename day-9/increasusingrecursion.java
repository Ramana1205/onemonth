

public class increasusingrecursion {
    public static void print(int n){
    if(n==1){
        System.out.print(n+" ");
        return;
    }
    print(n-1);
    System.out.print(n+" ");
    

}
public static void printdec(int n){
    if(n==1){
        System.out.print(n+" ");
        return;
    }
    System.out.print(n+" ");
    printdec(n-1);
}
public static void main(String[] args) {
    print(5);
    System.out.println();
    printdec(5);
}

    
}
