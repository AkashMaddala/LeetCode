class TwoSome {
    public static void main(String args[]) {
        int[] nums = {3,2,4};
        int target = 6;
        int[] indices = new int[2];
        indices = twoSum(nums, target);
        for(int i = 0; i < indices.length; i++) {
            System.out.print(indices[i] + " ");
        }

    }
    // public static int[] twoSum(int[] nums, int target) {
    //     int indices[] = new int[2];
    //     int k=0;
    //     for(int i=0; i<nums.length-1; i++){
    //         for(int j=i+1; j<nums.length; j++){
    //             if(nums[i] + nums[j] == target){
    //                 indices[k] = i;
    //                 indices[k+1] = j;
    //             }
    //         }
    //     }
    //     return indices;
    // }
    public static int[] twoSum(int[] nums, int target) {
        int indices[] = new int[2];
        int j = nums.length-1;
        for(int i=0; i<nums.length; i++){
            if(i==j)break;
            if(target-nums[i]==nums[j]){
                indices[0]=i;
                indices[1]=j;
            }
            j--;
        }
        return indices;
    }
}
