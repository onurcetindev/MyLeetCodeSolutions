

class Solution{

    public int scoreOfString(String s){

        int result;

        for(int i = 0 ; i < s.length()-1 ; i++){
            int diff = Math.abs(s.charAt(i) - s.charAt(i+1));

            result += diff;
        }
        return result;
    }
}