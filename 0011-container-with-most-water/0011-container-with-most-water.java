class Solution {
    public int maxArea(int[] height) {
        int left = 0;               // Pointer starting at the leftmost line
        int right = height.length - 1; // Pointer starting at the rightmost line
        int maxArea = 0;            // Variable to keep track of the maximum area

        while (left < right) {
            // Calculate the area with the current left and right pointers
            int currentArea = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(maxArea, currentArea);

            // Move the pointer pointing to the shorter line inward
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
        
    }
}