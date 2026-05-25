import java.util.Scanner;

// public class loop {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = 5;
//         for (int i = 0; i < 5; i++) {
//             System.out.println("Raunak");

//         }
//         sc.close();
//     }
// }


public class loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) {
            System.out.println(i);
            i++;
        }
        sc.close();
    }
}
