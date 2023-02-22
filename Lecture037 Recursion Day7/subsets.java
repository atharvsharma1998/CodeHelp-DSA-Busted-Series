class Solution {
    public void solve(int[] nums, int index, List<Integer> output, List<List<Integer>> ans){
        // Base case
        if(index > nums.length-1){
            ans.add(new ArrayList<>(output));
            return;
        }

        // Exclude
        solve(nums, index+1, output, ans);

        // Include
        output.add(nums[index]);
        solve(nums,index+1, output, ans);

        output.remove(output.size()-1);

    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();

        int index = 0;
        solve(nums, index, output, ans);
        return ans;
    }
}
