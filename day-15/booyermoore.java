

public class booyermoore {
    public static int majorityElement(int[] nums) {
    int count = 0;
    int candidate = 0;

    for(int num : nums) {
        if(count == 0) {
            candidate = num;
        }

        count += (num == candidate) ? 1 : -1;
    }

    return candidate;
}
public static void main(String[] args) {
    int[] nums={1,2,3,4,5,1,6,7};
    System.out.println(majorityElement(nums));
}
    
}
