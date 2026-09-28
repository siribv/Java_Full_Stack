public class maximum{
    public static void main(String[] args){
        int[] array={1,2,3,4,5};
        //manipulate elements inside an array
        array[1]=3;
        array[2]=9;
        int max=array[0];
        int min=array[0];
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
            if(array[i]>max){
                max=array[i];
            }
            if(array[i]<min){
                min=array[i];
            }
        }
        System.out.println("maximum:"+max);
        System.out.println("minimum:"+min);
    }
}