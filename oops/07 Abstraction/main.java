abstract class Animal{
    abstract void sound();
}
class Dog extends Animal{
    void sound(){
        System.out.println("Dog Barks");
    }
}
public class main{
    public static void main(String[] args)
    {
        Dog d=new Dog();
        d.sound();
    }
}