// // solid rectangle pattern
// public class patterns {

//     public static void main(String[] args) {
//         int rows = 5;
//         int cols = 5;
//          // outer loop for rows
//         for (int i = 1; i <= rows; i++) {
//             // inner loop for columns
//             for (int j = 1; j <= cols; j++) {
//                 System.out.print("*  ");
//             }
//             System.out.println();
//         }
//     }
// }







// // hollow rectangle pattern

// public class patterns {

//     public static void main(String[] args) {
//         int rows = 5;
//         int cols = 5;
//          // outer loop for rows
//         for (int i = 1; i <= rows; i++) {
//             // inner loop for columns
//             for (int j = 1; j <= cols; j++) {
//                 // print star for first and last row or first and last column
//                 if (i == 1 || i == rows || j == 1 || j == cols) {
//                     System.out.print("*  ");
//                 } else {
//                     System.out.print("   ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }






// // half pyramid pattern
// public class patterns {

//     public static void main(String[] args) {
//         int rows = 5;
//          // outer loop for rows
//         for (int i = 1; i <= rows; i++) {
//             // inner loop for columns
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*  ");
//             }
//             System.out.println();
//         }
//     }
// }






// // inverted half pyramid pattern
// public class patterns {

//     public static void main(String[] args) {
//         int rows = 5;
//          // outer loop for rows
//         for (int i = rows; i >= 1; i--) {
//             // inner loop for columns
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*  ");
//             }
//             System.out.println();
//         }
//     }
// }






// // inverted half pyramid rotated by 180 degree
// public class patterns {

//     public static void main(String[] args) {
//         int rows = 5;
//          // outer loop for rows
//         for (int i = 1; i <= rows; i++) {
//             // inner loop for spaces
//             for (int j = 1; j <= rows - i; j++) {
//                 System.out.print("   ");
//             }
//             // inner loop for stars
//             for (int k = 1; k <= i; k++) {
//                 System.out.print("*  ");
//             }
//             System.out.println();
//         }
//     }
// }






// // half pyramid with numbers
// public class patterns {

//     public static void main(String[] args) {
//         int rows = 5;
//          // outer loop for rows
//         for (int i = 1; i <= rows; i++) {
//             // inner loop for numbers
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(j + "  ");
//             }
//             System.out.println();
//         }
//     }
// }







// // inverted half pyramid number
// public class patterns {
//     public static void main(String[] args) {
//         int n=5;
//         //outer loop
//         for(int i=1;i<=n;i++){
//             //inner loop
//             for(int j=1;j<=n-i+1;j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }





// // Floyds triangle
// public class patterns {

//     public static void main(String[] args) {
//         int n=5;
//         int num = 1;
//         //outer loop
//         for(int i=1;i<=n;i++){
//             // inner loop
//             for(int j=1;j<=i;j++){
//                 System.out.print(num);
//                 num++;
//             }
//             System.out.println();
//         }
//     }
// }




//0-1 triangle
// public class patterns {

//     public static void main(String[] args) {
//         int n=5;
//         // outer loop
//         for(int i=1;i<=n;i++){
//             //inner loop
//             for(int j=1;j<=i;j++){
//                 int sum =i+j;
//                 if(sum%2==0){
//                     System.out.print("1 ");
//                 }else{
//                     System.out.print("0 ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }



//////////////////////////////////////////////////////////////////////////////////////////////////////////////


// // butterfly 
// public class patterns {

//     public static void main(String[] args) {
//         int n=5;
//         //upper half
//         for(int i=1;i<=n;i++){
//             //1st part
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             //spaces
//             int space=2*(n-i);
//             for(int j=1;j<=space;j++){
//                 System.out.print(" ");
//             }
//             //2nd half
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//          //lower half
//         for(int i=n;i>=1;i--){
//             //1st part
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             //spaces
//             int space=2*(n-i);
//             for(int j=1;j<=space;j++){
//                 System.out.print(" ");
//             }
//             //2nd half
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
    
//     }
// }





// //solid rhombus
// public class patterns {

//     public static void main(String[] args) {
//         int n=5;
//         for(int i=1;i<=n;i++){
//             //spaces
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             //stars
//             for(int j=1;j<=5;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }




// //number pyramid
// public class patterns {

//     public static void main(String[] args) {
//         int n=5;
//         for(int i=1;i<=n;i++){
//             //spaces
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             //number
//             for(int j=1;j<=i;j++){
//                 System.out.print(i+" ");
//             }
//             System.out.println();
//         }
//     }
// }




// // palindromic pattern
// public class patterns {

//     public static void main(String[] args) {
//         int n=5;
//         for(int i=1;i<=n;i++){
//             //spaces
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             //1st half number
//             for(int j=i;j>=1;j--){
//                 System.out.print(j);
//             }
//             // 2nd half number
//             for(int j=2;j<=i;j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }



//diamond
public class patterns {

    public static void main(String[] args) {
        int n=5;
        //upper half
        for(int i=1;i<=n;i++){
            //space
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //star
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
         //lower half
          for(int i=n;i>=1;i--){
            //space
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //star
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}