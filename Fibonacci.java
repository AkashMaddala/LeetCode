class Solution {
    public int fib(int n) {
        int n0 = 0;
        int n1 = 1;
        int n2 = 0;
        if(n == 0) return 0;
        else if (n == 1) return 1;
        else {
            for(int i=2; i<=n; i++){
                n2 = n1 + n0;
                n0 = n1;
                n1 = n2;
            }
        }
        return n2;
    }
}