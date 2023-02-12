class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        for(Integer i = 1; i <= n; i++){
            String str = "";
            if(i%3 == 0 && i%5 == 0) str = "FizzBuzz";
            else if(i%3 == 0) str = "Fizz";
            else if(i%5 == 0) str = "Buzz";
            else str = i.toString();

            result.add(str);
        }
    return result;
    }
}
