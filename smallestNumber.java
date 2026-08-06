class Solution {
    public int smallestNumber(int n, int t) {
        while (true) {
            // 1. Convert the number to a string to easily look at each digit
            String numStr = Integer.toString(n);
            int product = 1;
            
            // 2. Multiply all the digits together
            for (int i = 0; i < numStr.length(); i++) {
                // Character.getNumericValue converts '5' to the actual number 5
                int digit = Character.getNumericValue(numStr.charAt(i));
                product = product * digit;
            }
            
            // 3. If the product can be divided by t evenly, we found our answer!
            if (product % t == 0) {
                return n;
            }
            
            // 4. Otherwise, check the next number
            n = n + 1;
        }
    }
}
