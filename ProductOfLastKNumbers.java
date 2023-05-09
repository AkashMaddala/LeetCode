class ProductOfNumbers {
    static ArrayList<Integer> nums;
    static int p = 1;
    public ProductOfNumbers() {
        nums = new ArrayList<>();
        p = 1;
    }
    
    public void add(int num) {
        if(num == 0) {
            nums = new ArrayList<>();
            p = 1;
            return;
        }
        p *= num;
        nums.add(p);
    }
    
    public int getProduct(int k) {
        if(nums.size() < k) return 0;
        int ans = nums.get(nums.size() - 1);
        if(nums.size() == k) return ans;
        return (ans/nums.get(nums.size() - 1 - k));
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */