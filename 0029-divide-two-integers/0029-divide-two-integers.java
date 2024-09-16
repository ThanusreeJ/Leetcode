class Solution {
    public int divide(int dividend, int divisor) {
        // Handle overflow cases
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE; // 2^31 - 1
        }
        
        // Determine the sign of the result
        boolean isNegative = (dividend < 0) ^ (divisor < 0);
        
        // Work with positive values for easier calculation
        long absDividend = Math.abs((long) dividend);
        long absDivisor = Math.abs((long) divisor);
        
        int result = 0;
        
        // Perform division using bit manipulation
        while (absDividend >= absDivisor) {
            long tempDivisor = absDivisor;
            int multiple = 1;
            
            // Double the divisor until it exceeds dividend
            while (absDividend >= (tempDivisor << 1)) {
                tempDivisor <<= 1;
                multiple <<= 1;
            }
            
            // Subtract the largest shifted divisor and add the corresponding multiple to result
            absDividend -= tempDivisor;
            result += multiple;
        }
        
        // Apply the sign to the result
        return isNegative ? -result : result;
    }
}
