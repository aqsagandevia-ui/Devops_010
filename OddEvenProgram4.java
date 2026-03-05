public class OddEvenProgram4 {

    public static void main(String[] args) {

        // ===============================
        // PART 1: Even Numbers (1 to 100)
        // ===============================

        int minEven = 2;
        int maxEven = 0;
        int sumEven = 0;

        System.out.println("Even Numbers between 1 to 100:");

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {   // Even condition
                System.out.print(i + " ");
                sumEven += i;
                maxEven = i;
            }
        }

        System.out.println("\nMinimum Even Number: " + minEven);
        System.out.println("Maximum Even Number: " + maxEven);
        System.out.println("Total Sum of Even Numbers (1-100): " + sumEven);


        // ==========================================
        // PART 2: Even Numbers (1 to 50) Analysis
        // ==========================================

        int sum50 = 0;
        int count50 = 0;

        System.out.println("\nEven Numbers between 1 to 50:");

        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                sum50 += i;
                count50++;
            }
        }

        System.out.println("\nFirst Three Minimum Even Numbers: 2 4 6");
        System.out.println("Last Three Maximum Even Numbers: 44 46 48 50");

        double average = (double) sum50 / count50;
        System.out.println("Average of Even Numbers (1-50): " + average);


        // ===============================
        // PART 3: Odd Numbers (1 to 100)
        // ===============================

        int sumOdd = 0;

        System.out.println("\nOdd Numbers between 1 to 100:");

        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {   // Odd condition
                System.out.print(i + " ");
                sumOdd += i;
            }
        }

        System.out.println("\nTotal Sum of Odd Numbers (1-100): " + sumOdd);
    }
}