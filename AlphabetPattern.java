// public class AlphabetPattern 
// {
//     public static void main(String[] args) 
//     {
//         // int i,j,k,s=10;
//         // for(i=65;i<=69;i++)
//         // {
//         //     for(k=1;k<=s;k++)
//         //     {
//         //         System.out.print(" ");
//         //     }
//         //     for(j=65;j<=i;j++)
//         //     {
//         //         System.out.print((char)j+" ");
//         //     }
//         //     System.out.println();
//         //     s--;
//         // }

//         int i,j,k,s=10;
//         int rows=5;

//         for(i = 1; i <= rows; i++) 
//         {
//             for(k = 1; k <= s; k++) 
//             {
//                 System.out.print(" ");
//             }
//             for(j = 1; j <= i; j++) 
//             {
//                 System.out.print("* ");
//             }
//             System.out.println();
//             s--;
//         }
//         //s = s - 1;

//         for(i=69;i>=65;i--)
//         {
//             for(k=1;k<=s;k++)
//             {
//                 System.out.print(" ");
//             }
//             for(j=65;j<=i;j++)
//             {
//                 System.out.print((char)j+" ");
//             }
//             System.out.println();
//             s++;
//         }


//     //  int n = 5;

//     //     for (i = n; i >= 1; i--) {
//     //         char ch = 'A';
//     //         for (j = 1; j <= i; j++) {
//     //             System.out.print(ch + " ");
//     //             ch++;
//     //         }
//     //         System.out.println();
//     //     }
//     }
// }

public class AlphabetPattern {
    public static void main(String[] args) {

        int i, j, k, s = 10;
        int rows = 5;

        for (i = 1; i <= rows; i++) 
        {
            for (k = 1; k <= s; k++) 
            {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) 
            {
                System.out.print("* ");
            }
            System.out.println();
            s--;
        }
        s=s+1;
        for (i = 69; i >= 65; i--)
        {
            for (k = 1; k <= s; k++)
            {
                System.out.print(" ");
            }
            for (j = 65; j <= i; j++)
            {
                System.out.print((char)j + " ");
            }
            System.out.println();
            s++;   
        }
    }
}