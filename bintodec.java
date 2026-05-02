public class bintodec {
    public static void main(String[] args){
        int binary=1010;
        int decimal=0;
        int power=0;
        while(binary>0){
            int lastdigit=binary%10;
            decimal += lastdigit*Math.pow(2, power);
            power++;
            binary /= 10;
        }
        System.out.println("Decimal value: " + decimal);
    }
}
