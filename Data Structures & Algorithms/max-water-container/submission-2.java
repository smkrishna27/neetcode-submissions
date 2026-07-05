class Solution {
    public int maxArea(int[] height) {
          if (height == null || height.length == 0) return 0;
        if (height.length == 1) return Math.min(height[0], height[1]);

        int max = 0;
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            int area = Math.min(height[left], height[right]) * (right - left);
            max = Math.max(max, area);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return max;


    }
        
    
}
