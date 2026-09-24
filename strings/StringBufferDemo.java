public class StringBufferDemo{
    public static void main(String[] args)
    {
        StringBuffer sb=new StringBuffer("Java");
        System.out.println("Original:"+sb);
        //append
        sb.append("Programming");
        System.out.println("After append:"+sb);
        //insert
        sb.insert(5,"is ");
        System.out.println("After insert:"+sb);
        //replace
        sb.replace(0,4,"python");
        System.out.println("After replace:"+sb);
        //delete
        sb.delete(0,6);
        System.out.println("after delete:"+sb);

    }
}