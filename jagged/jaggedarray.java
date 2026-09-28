public class jaggedarray{
    public static void main(String[] args) {
        // Declare a jagged array with 3 rows
        int[][] jagged = new int[3][];

        // Initialize each row with different lengths
        jagged[0] = new int[2];  // first row has 2 elements
        jagged[1] = new int[4];  // second row has 4 elements
        jagged[2] = new int[3];  // third row has 3 elements

        // Assign values
        int value = 1;
        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                jagged[i][j] = value++;
            }
        }

        // Print the jagged array
        System.out.println("Jagged Array:");
        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println();
        }
    }
}
