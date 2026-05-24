class consecutiveocc {
    public static void countAllOccurrences(int[] arr,int target,int n) {
        if(n == arr.length) {
            return;
        }
        if(arr[n] == target) {
            System.out.println("Element " + target + " found at index: " + (n));
        }
        countAllOccurrences(arr, target, n+1);
        

        
    }
    public static void main(String[] args) {
        int[] arr = {3,2,4,5,6,2,7,2,2};
        int target = 2;
        countAllOccurrences(arr, target, 0);


        
    }
}