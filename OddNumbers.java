public class OddNumbers {
    public static void main(String[] args) {

        int s = 0;

        System.out.println("Odd Numbers between 1 to 100:");

        for (int i = 1; i <= 100; i += 2) 
        {
            System.out.print(i + " ");
            s += i;
        }

        System.out.println("\n\nMinimum Odd Number: 1");
        System.out.println("Maximum Odd Number: 99");
        System.out.println("Total Sum of Odd Numbers: " + s);

        int min = 2;
        int max = 100;
        int sum = 0;

        System.out.println("\n\nEven numbers between 1 to 100:");

        for (int i = 2; i <= 100; i += 2) {
            System.out.print(i + " ");
            sum += i;
        }

        System.out.println("\n\nMinimum even number: " + min);
        System.out.println("Maximum even number: " + max);
        System.out.println("Sum of even numbers: " + sum);

    }
}
