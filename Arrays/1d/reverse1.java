public class reverse1{
    public static void main(String[] args){
        int[] nums={1,2,3,4,5};
        int left=0;
        int right=nums.length-1;
        while(left<right)
        {
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
        for(int num:nums)
        {
            System.out.println(num);
        }

    }
}