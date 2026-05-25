// import java.util.Scanner;
// public class condition {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int age = sc.nextInt();
//         if (age >= 18) {
//             System.out.println("eligible");
//         } else {
//             System.out.println("not eligible");
//         }
//         sc.close();
//     }
// }

import java.util.*;

// public class condition {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         switch (n) {
//             case 1:
//                 System.out.println("monday");
//                 break;
//             case 2:
//                 System.out.println("tuesday");
//                 break;
//             case 3:
//                 System.out.println("wednesday");
//                 break;
//             case 4:
//                 System.out.println("thursday");
//                 break;
//             case 5:
//                 System.out.println("friday");
//                 break;
//             case 6:
//                 System.out.println("saturday");
//                 break;
//             case 7:
//                 System.out.println("sunday");
//                 break;
//             default:
//                 System.out.println("invalid");
//                 break;
//         }
//         sc.close();
//     }
// }

public class condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter operation (1:Add, 2:Sub, 3:Mul, 4:Div, 5:Mod): ");
        int n = sc.nextInt();
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        switch (n) {
            case 1:
                System.out.println("Addition: " + (a + b));
                break;
            case 2:
                System.out.println("Subtraction: " + (a - b));
                break;
            case 3:
                System.out.println("Multiplication: " + (a * b));
                break;
            case 4:
                if (b != 0) {
                    System.out.println("Division: " + (a / b));
                } else {
                    System.out.println("Error: Division by zero");
                }
                break;
            case 5:
                System.out.println("Modulus: " + (a % b));
                break;
            default:
                System.out.println("Invalid operation");
                break;
        }
        sc.close();
    }
    
}