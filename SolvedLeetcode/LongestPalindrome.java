public class LongestPalindrome {
    public int longestPalindrome(String s) {
        
        int[] alphabets = new int[52];

        for (char ch : s.toCharArray()) {
            int index = 0;
            if ((int)ch < 97) {
                index = (int)ch - 65 ;
            } else {
                index = (int)ch - 97 + 26;
            }
            alphabets[index] += 1;
        }

        int count = 0;
        for (int i : alphabets) {
            if (i % 2 == 0) {
                count += i;
            } else if ((i - 1) % 2 == 0) {
                count += i - 1;
            }
        }
        if (count < s.length()) {
            return count + 1;
        } else {
            return count;
        }
    }

}
