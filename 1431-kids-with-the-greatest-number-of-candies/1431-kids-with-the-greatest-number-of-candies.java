class Solution {
    public boolean[] kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        boolean[] result = new boolean[n];
        int maxCandies = candies[0];
        for (int i = 1; i < n; i++) {
            if (candies[i] > maxCandies) {
                maxCandies = candies[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (candies[i] + extraCandies >= maxCandies) {
                result[i] = true;
            } else {
                result[i] = false;
            }
        }
        return result;
    }
}