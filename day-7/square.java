public class square {
    public static void square1(int n){
        int temp = n;
        int result = 0;
        int bit = 0;

        while (temp > 0) {
            if ((temp & 1) == 1) {
                result += (n << bit);
            }
            bit++;
            temp >>= 1;
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        square1(4);
    }
}
