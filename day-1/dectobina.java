public class dectobina {
    public static void main(String[] args){
        int decimal=11;
        int binary=0;
        int power=0;
        while(decimal>0){
            int rem=decimal%2;
            binary += rem*Math.pow(10, power);
            power++;
            decimal /= 2;
        }
        System.out.println("Binary value: " + binary);
    }
}
