class Person{
    String name;
    int age;
    Person(String name,int age){
        this.name=name;
        this.age=age;
        System.out.println("Person constructor called");
    }
}
class Student extends Person{
    int marks;
    Student(){
        this("bhuvaneswarnaiduboya",20,100);
        System.out.println("student default constructor called");
    }
    Student(String name,int age,int marks){
        super(name,age);
        this.marks=marks;
        System.out.println("student parameterized constructor called");
    }
    void display(){
        System.out.println("name:"+name);
        System.out.println("age:"+age);
        System.out.println("marks:"+marks);
    }
}
public class stringMethods{
    public static void main(String[] args){
        Student s=new Student();
        System.out.println("\nstudent details:");
        s.display();
    }
}