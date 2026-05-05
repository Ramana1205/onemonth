public class dectobin {
    public static void main(String[] args){
        int decimal=11;
        String binary="";
        while(decimal>0){
            int rem=decimal%2;
            binary=rem+binary;
            decimal /= 2;
        }
        System.out.println("Binary value: " + binary);
    }
}
