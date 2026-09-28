public class Main{
    public static void main(String[] args){
        //int[][] nums=new int[3][4];
        int[][] nums={{1,2,3,4},{4,5,6,7},{9,8,7,6}};
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++)
            {
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }
    }
}