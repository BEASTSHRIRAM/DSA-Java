public class PascalsTriangleUsingBitManipulation {
    public static void main(String[] args) {
        
        int n = 4; // row index (0-indexed)

        // Using bit manipulation for sum
        int sum = 1 << n; // 2^n (if rows are 0-indexed)

        System.out.println("The Pascal's triangle is:");
        pascals_tri(6);

        System.out.println("Sum of row " + n + " = " + sum);

        System.out.println("Row " + n + " is:");
        printRow(n);
    }

    // Print full Pascal's Triangle
    static void pascals_tri(int n){
        for (int line = 0; line < n; line++) {
            int value = 1;

            for (int i = 0; i <= line; i++) {
                System.out.print(value + " ");
                value = value * (line - i) / (i + 1);
            }
            System.out.println();
        }
    }

    // Print only nth row
    static void printRow(int n){
        int value = 1;
        for (int i = 0; i <= n; i++) {
            System.out.print(value + " ");
            value = value * (n - i) / (i + 1);
        }
        System.out.println();
    }
}
