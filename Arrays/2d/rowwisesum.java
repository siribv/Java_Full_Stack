public class rowwisesum{
    public static void main(String[] args)
    {
        int[][] array={{1,2,3},{4,5,6}};
        for(int i=0;i<array.length;i++){
            int rowsum=0;
            for(int j=0;j<array[0].length;j++){
                System.out.print(array[i][j]);
                rowsum=rowsum+array[i][j];
                }
            System.out.println();
            System.out.println("rowsum:"+(i+1)+":"+rowsum);
        }
    }
}