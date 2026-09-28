public class largest
{
    public static void main(String[] args)
    {
        int[][][] array={
            {{1,2,3},{4,5,6}},
            {{7,8,9},{10,11,12}}
            };
        int max=array[0][0][0];
        for(int i=0;i<array.length;i++)
        {
            for(int j=0;j<array[i].length;j++)
            {
                for(int k=0;k<array[i][j].length;k++)
                {
                    System.out.print(array[i][j][k]+" ");
                    if(array[i][j][k]>max)
                    {
                        max=array[i][j][k];
                    }
                }
                System.out.println();
            }
        }
        System.out.println("Largest Element:"+max);
    }
}