// // get bit at pos
// public class bitmanipulation {
//     public static void main(String[] args) {
//         int n = 5;
//         int pos = 2;
//         int bitMask = 1<<pos;
//         if((bitMask & n) == 0){ //AND
//             System.out.println("bit was zero");
//         }else{
//             System.out.println("bit was one");
//         }
//     }
// }







// // set bit at pos
// public class bitmanipulation {
//     public static void main(String[] args) {
//         int n = 5;
//         int pos = 1;
//         int bitMask = 1<<pos;
//         int newNumber = bitMask | n; //OR
//         System.out.println(newNumber);
//     }
// }






// // clear bit at pos
// public class bitmanipulation {
//     public static void main(String[] args) {
//         int n = 5;
//         int pos = 2;
//         int bitMask = ~(1<<pos); //NOT
//         int newNumber = bitMask & n; //AND
//         System.out.println(newNumber);
//     }
// }







// // update bit at pos
// import java.util.Scanner;
// public class bitmanipulation {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int oper= sc.nextInt();
//         // oper=1 : set   oper=0:clear
//         int n = 5;
//         int pos = 1;
//         int bitMask = 1<<pos;
//         if(oper == 1){
//             int newNumber = bitMask | n; //OR
//             System.out.println(newNumber);
//         }else{
//             int newNumber = ~(bitMask) & n; //NOT AND
//             System.out.println(newNumber);
//         }
//     }
// }