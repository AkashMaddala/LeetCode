class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        for(int i = 1; i<n+1; ++i){
            ans[i] = hammingWeight(i);
        }
        return ans;
    }
    public int hammingWeight(int x) {
        int sum = 0;
        while(x!=0){
            sum += x & 1;
            x = x >>> 1;
        }
        return sum;
    }
}