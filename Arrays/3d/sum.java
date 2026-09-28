public class sum{
    public static void main(String[] args){
        int[][][] array={{{1,2,3},{1,4,5}},{{1,5,7},{8,1,2}}};
        int sum=0;
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                for(int k=0;k<array[i][j].length;k++){
                    System.out.print(array[i][j][k]);
                    sum+=array[i][j][k];
                }
            System.out.println();
            }
        }
    System.out.println("sum:"+sum);
    }
}