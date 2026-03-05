public class OddEvenProgram3 {

    public static void main(String[] args) {

        // ==================================
        // PART 1: Odd Numbers (1 to 100)
        // ==================================

        int minOdd = 1;
        int maxOdd = 0;
        int sumOdd = 0;

        System.out.println("Odd Numbers between 1 to 100:");

        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {   // Odd condition
                System.out.print(i + " ");
                sumOdd += i;
                maxOdd = i;    // last odd will be 99
            }
        }

        System.out.println("\nMinimum Odd Number: " + minOdd);
        System.out.println("Maximum Odd Number: " + maxOdd);
        System.out.println("Total Sum of Odd Numbers (1-100): " + sumOdd);


        // ==================================
        // PART 2: Odd Numbers (1 to 50)
        // ==================================

        int sum50 = 0;
        int count50 = 0;

        System.out.println("\nOdd Numbers between 1 to 50:");

        for (int i = 1; i <= 50; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
                sum50 += i;
                count50++;
            }
        }

        // First three minimum odd numbers
        System.out.println("\nFirst Three Minimum Odd Numbers: 1 3 5");

        // Last three maximum odd numbers (below 50)
        System.out.println("Last Three Maximum Odd Numbers: 45 47 49");

        double average = (double) sum50 / count50;
        System.out.println("Average of Odd Numbers (1-50): " + average);
    }
}