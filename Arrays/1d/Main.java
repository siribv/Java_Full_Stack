public class Main{
    public static void main(String[] args){
        int[] array=new int[5];
        //int[] array={1,2,3,4,5};
        //manipulate elements inside an array
        array[1]=3;
        array[2]=9;
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}