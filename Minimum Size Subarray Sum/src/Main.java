// 1st approach
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int si=0;
        int ei=0;
        int sum=0;
        int min=Integer.MAX_VALUE;
        while(ei<nums.length){
            sum+=nums[ei];
            while(sum>=target){
                min=Math.min(min,ei-si+1);
                sum-=nums[si];
                si++;
            }
            ei++;
        }
        return min==Integer.MAX_VALUE?0:min;
    }
}

// 2nd approach
class Solution1 {
    public boolean isPossible(int target,int[] nums,int sizeOfWindow){
        int sum=0;
        int si=0;
        int ei=0;
        while(ei<nums.length){
            if(ei>=sizeOfWindow) {
                sum-=nums[si];
                si++;
            }
            sum+=nums[ei];
            if(sum>=target) return true;
            ei++;
        }
        return false;
    }
    public int minSubArrayLen(int target, int[] nums) {
        int si=1,ei=nums.length,p_ans=0;
        while(si<=ei){
            int mid=si+(ei-si)/2;
            if(isPossible(target,nums,mid)){
                p_ans=mid;
                ei=mid-1;
            }else{
                si=mid+1;
            }
        }
        return p_ans;
    }

}
class practice{
    public static void main(String[] args) {
        System.out.println("hello");
    }
}