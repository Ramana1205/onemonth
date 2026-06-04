

    public class brutemaxocc {
        public static void maxocc(int[] nums){
        int max=0;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
        }
        int[] temp=new int[max+1];
        int maxidx=0;
        int maxocc=0;
        for(int i=0;i<nums.length;i++){
            temp[nums[i]]+=1;
        if(temp[nums[i]]>maxidx){
            maxidx=temp[nums[i]];
            maxocc=nums[i];
        }
        }
        System.out.print("the number "+maxocc+ "repeated " +maxidx+"times");
        }
        public static void main(String[] args) {
            int[] nums={2,2,1,1,1,2,2};
            maxocc(nums);
            
        }
        
    }
