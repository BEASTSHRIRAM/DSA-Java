public class SquareStarPattern {
    public static void main(String[] args) {
        int rows = 5; // Number of rows for the triangle pattern

        System.out.println("--- Printing a Right-Angled Triangle Star Pattern ---");

        // Outer loop for rows
        // 'i' represents the current row number (0 to rows-1)
        for (int i = 0; i < rows; i++) {
            // Inner loop for columns (stars in the current row)
            // The number of stars in each row is (i + 1)
            for (int j = 0; j <= i; j++) {
                System.out.print("* "); // Print a star and a space
            }
            System.out.println(); // Move to the next line after each row is complete
        }
    }
}
