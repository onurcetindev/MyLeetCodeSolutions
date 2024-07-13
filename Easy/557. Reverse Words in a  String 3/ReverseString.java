class Solution {
    public String reverseWords(String s) {
        // Split the input string by spaces
        String[] words = s.split(" ");
        
        // Initialize a StringBuilder to build the result
        StringBuilder result = new StringBuilder();
        
        // Iterate through each word
        for (String word : words) {
            // Reverse the current word and append it to the result
            result.append(new StringBuilder(word).reverse().toString()).append(" ");
        }
        
        // Remove the trailing space and return the result
        return result.toString().trim();
    }
}
