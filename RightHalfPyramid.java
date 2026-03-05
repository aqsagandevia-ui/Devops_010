// public class RightHalfPyramid 
// {
//     public static void main(String[] args) 
//     {
//         System.out.println("Inverted Right Half Pyramid:");
        
//         int num = 1;
//         int rows = 5;

//         for (int i = rows; i >= 1; i--) 
//         {
//             for (int j = 1; j <= i; j++) 
//             {
//                 System.out.print(num + " ");
//                 num++;

//                 if (num > 9) {
//                     num = 1;
//                 }
//             }
//             System.out.println();
//         }

//         int n = 5;

//         for (int i = 1; i <= n; i++) {
//             for (int  j = 1; j <= i; j++) {
//                 System.out.print(num + " ");
//                 num++;
//                 if (num == 10) num = 1; 
//             }
//             System.out.println();
//         }
//     }
// }

public class RightHalfPyramid {
    public static void main(String[] args) {

        int rows = 6;

        // ----- Inverted Star Pyramid -----
        for (int i = rows; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // ----- Number Pattern -----
        int n = 1;

        for (int i = 1; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(n + " ");
                n++;
                if (n > 9) {
                    n = 1;
                }
            }
            System.out.println();
        }
    }
}