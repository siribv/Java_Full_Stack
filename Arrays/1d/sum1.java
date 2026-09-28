public class sum1{
    public static void main(String[] args){
        //int[] array=new int[5];
        int[] array={1,2,3,4,5};
        //manipulate elements inside an array
        int sum=0;
        array[1]=3;
        array[2]=9;
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
            sum=sum+array[i];//running sum
            //int sum=0;
            //for(int num:nums){
            //sum+=num;
            //S.O.P(sum);
            //}
        }
    System.out.println("SUM:"+sum);
    }
}