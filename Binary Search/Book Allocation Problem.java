/*Given an array nums of n integers, where nums[i] represents the number of pages in the i-th book, and an integer m representing the number of students, allocate all the books to the students so that each student gets at least one book, each book is allocated to only one student, and the allocation is contiguous.



Allocate the books to m students in such a way that the maximum number of pages 
assigned to a student is minimized. If the allocation of books is not possible, return -1.


Examples:

Input: nums = [12, 34, 67, 90], m=2

Output: 113

Explanation: The allocation of books will be 12, 34, 67 | 90. 

One student will get the first 3 books and the other will get the last one.

Input: nums = [25, 46, 28, 49, 24], m=4

Output: 71

Explanation: The allocation of books will be 25, 46 | 28 | 49 | 24.
*/

class Solution {
    public int bookes(int [] arr , int x){
        int prev = arr[0];
        int count = 1;
        for(int i = 1;i<arr.length;i++){
            if(prev + arr[i] <= x){
                prev += arr[i];
            }else{
                count++;
                prev = arr[i];
            }
        }
        return count;
    }
    public int findPages(int[] nums, int m) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i : nums){
            max = Math.max(max,i);
            sum += i;
        }
        int left = max;
        int right =sum;
        while(left <= right){
            int mid =(left+right)/2;
            int ans = bookes(nums,mid);
            if(ans > m){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        if(nums.length >= m)return left;
        else return -1;
    }
}