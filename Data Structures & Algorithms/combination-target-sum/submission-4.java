class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
      List<List<Integer>> result = new ArrayList<>();

        backtrack(result, new ArrayList<>(), nums, target, 0);

        return result;

    }

    private static void backtrack(List<List<Integer>> result, ArrayList<Integer> temp, int[] nums, int target, int start) {

        if (target < 0) {
            return;
        }  if (target == 0) {
            result.add(new ArrayList<>(temp));
            return;
        } 
            for (int i = start; i < nums.length; i++) {
                temp.add(nums[i]);
                backtrack(result, temp, nums, target - nums[i], i);
                temp.removeLast();
  

        }   
    }
}
