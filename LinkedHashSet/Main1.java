import java.util.LinkedHashSet;
public class Main1{
    public static void main(String[] args){
        LinkedHashSet<Integer> numbers=new LinkedHashSet<>();
        numbers.add(30);
        numbers.add(10);
        numbers.add(20);
        numbers.add(40);
        numbers.add(90);
        System.out.println("set:"+numbers);
        System.out.println("Size:"+numbers.size());
        System.out.println("contains 20:"+numbers.contains(20));
        System.out.println("contains 30:"+numbers.contains(30));
        numbers.remove(80);
        System.out.println("after adding 80:"+numbers);
        System.out.println("\nIteration:");
        for(Integer number:numbers){
            System.out.println(number);
        }
        System.out.println("\nis Empty:"+numbers.isEmpty());
        numbers.clear();
    }
}