import java.util.LinkedList;
public class Main1{
    public static void main(String[] args){
        LinkedList<String> students=new LinkedList<>();
        students.add("Rajitha");
        students.add("Siri");
        students.add("Shalini");
        students.add("Chandu");
        System.out.println("Students names:"+students);
        students.addFirst("Bhuvi");
        students.addLast("Meghu");
        System.out.println("after adding:"+students);
        students.add(2,"nagu");
        System.out.println("after adding:"+students);
        System.out.println("First:"+students.getFirst());
        System.out.println("last:"+students.getLast());
        students.removeFirst();
        students.removeLast();
        System.out.println(students);
    }
}