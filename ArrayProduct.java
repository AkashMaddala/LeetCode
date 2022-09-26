public class ArrayProduct {
    public static void main (String[] args){
        int[] nums = {1,2,3,4};
        int[] productNums = productExceptSelf(nums);
        for(int i = 0; i<nums.length; i++){
            System.out.println(productNums[i]+" ");
        }
    }
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prefixArray = new int[n];
        int[] postfixArray = new int[n];
        prefixArray[0]= nums[0];
        postfixArray[n-1]= nums[n-1];
        for(int i=1; i<n;i++){
            prefixArray[i] = nums[i] * prefixArray[i-1];
        }
        for(int i=n-2; i>=0; i--){
            postfixArray[i] = nums[i] * postfixArray[i+1];
        }
        int[] outputArray = new int[n];
        for(int i=0; i<n; i++){
            if(i==0){
                outputArray[i]=1*postfixArray[i+1];
            }
            else if(i==n-1){
                outputArray[i]=1*prefixArray[i-1];
            }
            else{
                outputArray[i]=prefixArray[i-1]*postfixArray[i+1];
            }
        }
        return outputArray;

    }

}

/*
===originalarray===
 1, 2, 3, 4
===prefixArray===
 1, 2, 6, 24
===postfixArray===
 24, 24, 12, 4
===outputArray===
24, 12, 8, 6
 */