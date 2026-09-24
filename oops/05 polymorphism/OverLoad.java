class Calculator{
    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int c)
    {
        return a+b+c;
    }
}
public class OverLoad{
    public static void main(String[] args)
    {
        Calculator c=new Calculator();
        System.out.println(c.add(50,10));
        System.out.println(c.add(10,30,40));
    }
}