package oops;
public class OverRide{
public static void main(String[] args){
    class animal{
        void sound(){
            System.out.println("the animal is dog");
        }
    }
    class dog extends animal{
        @Override
        void sound(){
            System.out.println("dog is barking");
        }
    }
    dog d=new dog();
    d.sound();
}
}

