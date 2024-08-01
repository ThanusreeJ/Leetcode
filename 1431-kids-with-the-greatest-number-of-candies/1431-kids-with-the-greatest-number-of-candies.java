import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        List<Boolean> result = new ArrayList<>();
        
        // Find the maximum number of candies any kid currently has
        int maxCandies = candies[0];
        for (int i = 1; i < n; i++) {
            if (candies[i] > maxCandies) {
                maxCandies = candies[i];
            }
        }
        
        // Determine if each kid can have the greatest number of candies
        for (int i = 0; i < n; i++) {
            if (candies[i] + extraCandies >= maxCandies) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        
        return result;
    }
}
