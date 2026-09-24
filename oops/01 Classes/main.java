class Student{
    String name;
    int age;
    int energy;
    String mood;
    float attendance;
    Student(int age,String name,String mood,int energy,float attendance)
    {
        this.age=age;
        this.name=name;
        this.mood=mood;
        this.energy=energy;
        this.attendance=attendance;

    }
    void skipclass(){
        if(energy < 4){
            System.out.println("skip the class");
        }
    }
    void taketest(){
        if(attendance > 85.0){
            System.out.println("skip the class");
        }
    }
    void sleep(){
        if(energy <2 && mood == "sleepy")
        {
            System.out.println("skip the class");

        }
    }
}
public class main{
    public static void main(String[] args)
    {
        Student s1=new Student();
        age=23;
        name="Siri";
        mood="attentive";
        energy=10;
        attendance=80.0f;
        s1.skipclass();
        s1.taketest();
        s1.sleep();
    }
}