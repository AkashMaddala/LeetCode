public class MaximumSubarray {
    public static void main (String[] args){
        int[] nums = {4,4,-1,4};
        MaximumSubarray maxarray = new MaximumSubarray();
        System.out.println(maxarray.maxSubArray(nums));
        }
        public int maxSubArray(int[] nums) {
            int localSum = 0, maxSum = Integer.MIN_VALUE;
            int n = nums.length;
            for(int i=0; i<n;i++){
                localSum += nums[i];
                if(maxSum<localSum){
                    maxSum = localSum;
                }
                if(localSum<0){
                    localSum = 0;
                }
            }
            return maxSum;
        }
}