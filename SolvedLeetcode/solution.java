class Solution {
    public int countPrimes(int n) {

        int count = 0;
        for (int i = 2; i < n; i++) {
            if (primeCheck(i)) {
                count ++;
            }
        }
        return count;
    }

    static boolean primeCheck (int input) {

        if (input <= 1) return false; 
        if (input == 2) return true;  
        if (input % 2 == 0) return false;

        for (int i = 3; i * i <= input; i+=2) {
            if (input % i == 0) {
                return false;
            }
        }
        return true;
    }
}