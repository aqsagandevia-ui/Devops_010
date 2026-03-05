public class p42 {
    public static void main(String[] args) {

        int rows = 5;

        // ===== Reverse Star Pyramid =====
        for (int i = rows; i >= 1; i--) {

            // Print leading spaces
            for (int space = 0; space < rows - i; space++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        // ===== Alphabet Increasing Pyramid =====
        for (int i = 1; i <= rows; i++) {

            // Print leading spaces
            for (int space = 0; space < rows - i; space++) {
                System.out.print(" ");
            }

            // Print alphabets
            for (int j = 0; j < i; j++) {
                System.out.print((char)('A' + j) + " ");
            }

            System.out.println();
        }
    }
}