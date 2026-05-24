public class consecutive {

    static int count = 0;

    public static void consecutive(String str, int start, int end) {

        
        if(start == str.length()) {
            return;
        }

        
        if(end == str.length()) {
            consecutive(str, start + 1, start + 1);
            return;
        }

       
        if(str.charAt(start) == str.charAt(end)) {

            count++;

            System.out.println(
                str.substring(start, end + 1)
            );
        }

       
        consecutive(str, start, end + 1);
    }

    public static void main(String[] args) {

        String str = "abcab";

        consecutive(str, 0, 0);

        System.out.println("Count = " + count);
    }
}