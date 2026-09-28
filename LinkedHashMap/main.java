import java.util.Map;
import java.util.LinkedHashMap;
public class main{
    public static void main(String[] args){
        LinkedHashMap<Integer,String> students=new LinkedHashMap<>();
        students.put(101,"siri");
        students.put(102,"shalini");
        students.put(103,"rajitha");
        students.put(104,"sai");
        System.out.println("Map:"+students);
        System.out.println("student 102:"+students.get(102));
        System.out.println("Size:"+students.size());
        System.out.println("contains key 103:"+students.containsKey(103));
        System.out.println("contains values of siri:"+students.containsValue("siri"));
        students.put(102,"shalini");
        System.out.println("After updating:"+students);
        students.remove(104);
        System.out.println("After removing 104:"+students);
        System.out.println("\nusing keyset():");
        for(Integer key:students.keySet()){
            System.out.println(key+"->"+students.get(key));
        }
        System.out.println("\nusing entryset():");
        for(Map.Entry<Integer,String> entry:students.entrySet()){
            System.out.println(entry.getKey()+"->"+entry.getValue());
        }
    }
}