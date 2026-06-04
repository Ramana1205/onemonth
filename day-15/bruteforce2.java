

public class bruteforce2 {
    public static int majco(int[] nums){
        int majority=nums.length/2;
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]) count++;

            }
            if(count>majority) return nums[i];
        }
        return -1;

    }
    public static void main(String[] args) {
        int[] nums={1,2,1};
        System.out.println(majco(nums));
        
    }
}
