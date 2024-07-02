class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> sum = new ArrayList<>(); 

        for (int i = 1; i <= n; i++) {

            if (i % 15 == 0) {
                sum.add("FizzBuzz");
            } else if (i % 5 == 0) {
                sum.add("Buzz");
            } else if (i % 3 == 0) {
                sum.add("Fizz");
            } else {
                sum.add(Integer.toString(i));
            }
        }
        
        return sum;
    }
}   