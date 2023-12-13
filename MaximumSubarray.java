public class MaximumSubarray {
    public static int MaxSubArray (int [] nums){
        int currentSum=nums[0];
        int maxSum=nums[0];

        for(int i=1;i< nums.length;i++){
            currentSum=Math.max(nums[i], currentSum+nums[i]);
            maxSum=Math.max(maxSum,currentSum);
        }
        return maxSum;
    }
    public static void main (String [] args){
        int[]nums={-2,1,-3,4,-1,2,-5,4};
int result=MaxSubArray(nums);
System.out.println("Maximum Sub Array"+ result);
}
}