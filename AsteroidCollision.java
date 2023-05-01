class Solution {
    public int[] asteroidCollision(int[] a) {
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < a.length; i++){
            if(a[i]>0){
                stack.push(a[i]);
            } else {
                while(!stack.empty() && stack.peek() > 0 && stack.peek() < Math.abs(a[i])) {
                    stack.pop();
                }
                if(stack.isEmpty() || stack.peek() < 0){
                    stack.push(a[i]);
                }
                if(stack.peek() == Math.abs(a[i])){
                    stack.pop();
                }
            }
        }
        return stack.stream().mapToInt(i->i).toArray();
    }
}
