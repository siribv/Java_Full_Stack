import java.util.LinkedList;

public class first {
    public static void main(String[] args) {

        LinkedList<Integer> numbers = new LinkedList<>();

        // Add elements
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println(numbers);

        // Add at beginning
        numbers.addFirst(5);

        // Add at end
        numbers.addLast(40);

        System.out.println(numbers);

        // Get element
        System.out.println(numbers.get(2));

        // First element
        System.out.println(numbers.getFirst());

        // Last element
        System.out.println(numbers.getLast());

        // Remove first
        numbers.removeFirst();

        // Remove last
        numbers.removeLast();

        System.out.println(numbers);

        // Size
        System.out.println(numbers.size());
    }
}