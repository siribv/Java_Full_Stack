import java.util.HashMap;
import java.util.Map;

public class SnacksHeist {

    public static Map<String, Integer> countSnackThefts(String[] grabLog) {

        Map<String, Integer> map = new HashMap<>();

        // Count snacks taken by each student
        for (String name : grabLog) {
            map.put(name, map.getOrDefault(name, 0) + 1);
        }

        return map;
    }

    public static void main(String[] args) {

        String[] grabLog = {
            "Mia", "Leo", "Mia", "Sam", "Mia", "Leo"
        };

        Map<String, Integer> result = countSnackThefts(grabLog);

        System.out.println(result);

        // Find student with highest count
        String highestStudent = "";
        int highestCount = 0;

        for (Map.Entry<String, Integer> entry : result.entrySet()) {

            String name = entry.getKey();
            int count = entry.getValue();

            if (count > highestCount ||
                (count == highestCount && name.compareTo(highestStudent) < 0)) {

                highestStudent = name;
                highestCount = count;
            }
        }

        System.out.println(
            "Prime suspect: " + highestStudent +
            " (" + highestCount + " snacks)"
        );
    }
}