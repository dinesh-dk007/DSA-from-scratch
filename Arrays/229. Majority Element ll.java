class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> al = new ArrayList<>();
        int count1 = 0;
        int count2 = 0;
        int ele1 = 0, ele2=0;
        for(int i = 0;i<nums.length;i++){
            if(count1 == 0 && nums[i] != ele2){
                count1 = 1;
                ele1 = nums[i];
            }
            else if(count2 == 0 && nums[i] != ele1){
                count2 = 1;
                ele2 = nums[i];
            }
            else if(nums[i] == ele1)count1++;
            else if(nums[i] == ele2)count2++;
            else{
                count1--;
                count2--;
            }
        }
        int temp1 = 0;
        int temp2 = 0;
        for(int i : nums){
            if(ele1 == i)temp1++;
            else if(ele2 == i)temp2++;
        }
        if(temp1 > (nums.length/3))al.add(ele1);
        if(temp2 > (nums.length/3))al.add(ele2);
        return al;
    }
}