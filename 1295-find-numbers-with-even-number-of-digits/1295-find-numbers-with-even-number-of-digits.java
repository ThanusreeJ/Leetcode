class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        int evencount=0;
        for(int i=0;i<nums.length;i++){
            while(nums[i]!=0){
                count++;
                nums[i]/=10;
            }
            evencount+=((count%2==0)?1:0);
            count=0;
        }
        return evencount;
    }
}