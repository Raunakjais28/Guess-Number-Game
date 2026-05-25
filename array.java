// type[] arrayName=new type[size];

// public class array {
//     public static void main(String[] args) {
//         int[] marks = new int[3];
//         // int[] marks={97,98,95}; // another way to initialize array
//         marks[0] = 97;
//         marks[1] = 98;
//         marks[2] = 95;
//         // System.out.println(marks[0]);
//         // System.out.println(marks[1]);
//         // System.out.println(marks[2]);
//         for (int i = 0; i <3; i++) {
//             System.out.println(marks[i]);
//         }
//     }
// }







import java.util.Scanner;
// public class array {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int number[]=new int[size];
//         // input
//             for(int i=0;i<size;i++){
//                 number[i]=sc.nextInt();
//             }
//             // output
//         for(int i=0;i<size;i++){
//             System.out.println(number[i]);
//         }
//         sc.close();
//     }
// }







// public class array {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int number[]=new int[size];
//         // input
//             for(int i=0;i<size;i++){
//                 number[i]=sc.nextInt();
//             }
//             int x=sc.nextInt();
//             // output
//         for(int i=0;i<number.length;i++){
//             if(number[i]==x){
//                 System.out.println("found at index: "+i);
//             }
//         }
//         sc.close();
//     }
// }





//type[][] arrayName=new type[row][column];

// public class array {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int row = sc.nextInt();
//         int column = sc.nextInt();
//         int number[][] = new int[row][column];
//         // input
//         for (int i = 0; i < row; i++) {
//             for (int j = 0; j < column; j++) {
//                 number[i][j] = sc.nextInt();
//             }
//         }
//         // output
//         for (int i = 0; i < row; i++) {
//             for (int j = 0; j < column; j++) {
//                 System.out.print(number[i][j] + " ");
//             }
//             System.out.println();
//         }
//         sc.close();
//     }
// }



public class array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();
        int number[][] = new int[row][column];
        // input
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                number[i][j] = sc.nextInt();
            }
        }
        int x=sc.nextInt();
        // output
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if(number[i][j]==x){
                    System.out.println("found at index: ("+i+" "+j+")");
                }
            }
        }
        sc.close();
    }
}