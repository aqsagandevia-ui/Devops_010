// public class StarPattern {
//     public static void main(String[] args) {
//         int rows = 5;


//         for (int i = 1; i <= rows; i++) 
//         {
//             for (int j = 1; j <= rows - i; j++) 
//             {
//                 System.out.print(" ");
//             }
//             for (int k = 1; k <= i; k++) 
//             {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//         for (int i = rows; i >= 1; i--) 
//         {
//             for (int j = 1; j <= rows - i; j++) 
//             {
//                 System.out.print(" ");
//             }
//             for (int k = 2; k <= i; k++) 
//             {
//                 System.out.print(" *");
//             }
//             System.out.println();
//         }
//     }
// }

public class StarPattern {
    public static void main(String[] args) {

        int rows = 5;

        // ----- Star Increasing -----
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // ----- Alphabet Reverse -----
        for (int i = rows; i > 0; i--) {
            char ch = 'A';
            for (int j = 0; j < i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
}