class Studentdetails{
    String name;
    int age;
    String mood;
    int energy;
    float attendance;
    void skipClass(int a){
        if(energy <2){
            System.out.println("Skip the class");
        }
        else{
            System.out.println("go to the class");
        }

    }
    void study(String mood){
        if(mood == "ambitious")
        {
            System.out.println("my mood is ambitious");
        }
        else{
            System.out.println("my mood is not good");
        }
    }
    void taketest(float attendance)
    {
        if(attendance>85.00)
        {
            System.out.println("i am taking a test");

        }
        else{
            System.out.println("i am unable to take test");
        }
    }

}
public class Student{
    public static void main(String[] args)
    {
        Studentdetails s=new Studentdetails();
        s.skipClass(3);
        s.study("ambitious");
        s.taketest(90);
    }
}


