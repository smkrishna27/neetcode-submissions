class Solution {
    public int[][] merge(int[][] intervals) {

          Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> merged = new ArrayList<>();

        // Step 2: Traverse and merge
        int[] current = intervals[0];
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= current[1]) {
                // Overlap → extend the end
                current[1] = Math.max(current[1], intervals[i][1]);
            } else {
                // No overlap → add current and move on
                merged.add(current);
                current = intervals[i];
            }
        }
        // Add the last interval
        merged.add(current);

        return merged.toArray(new int[merged.size()][]);
        
    }
}
