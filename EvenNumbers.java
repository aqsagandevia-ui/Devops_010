public class EvenNumbers 
{
    public static void main(String[] args) 
    {
        System.out.println("\nEven Numbers between 1 to 50:");

        int sum = 0;
        int count = 0;

        for (int i = 2; i <= 50; i += 2) {
            System.out.print(i + " ");
            sum += i;
            count++;
        }

        System.out.println();

        // First three minimum even numbers
        System.out.println("\nThree Minimum Even Numbers:");
        System.out.println("2 4 6");

        // Last three maximum even numbers
        System.out.println("\nThree Maximum Even Numbers:");
        System.out.println("46 48 50");

        // Average
        double average = (double) sum / count;
        System.out.println("\nAverage of Even Numbers (1-50): " + average);


        System.out.println("\n\nOdd numbers between 1 to 50:");

        for (int i = 1; i <= 50; i += 2) {
            System.out.print(i + " ");
            sum += i;
            count++;
        }

        int minThreeSum = 1 + 3 + 5;

        int maxThreeSum = 45 + 47 + 49;

        System.out.println("\n\nSum of first 3 odd numbers: " + minThreeSum);
        System.out.println("Sum of last 3 odd numbers: " + maxThreeSum);
        System.out.println("Average of odd numbers: " + average);


    }
}