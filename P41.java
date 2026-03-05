public class p41 {
    public static void main(String[] args) {

        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // ===== Number Reverse Pattern =====
        int num = 1;

        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;

                if (num == 10) {   // reset after 9
                    num = 1;
                }
            }
            System.out.println();
        }
    }
}