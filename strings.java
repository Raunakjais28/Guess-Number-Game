// import java.util.Scanner;
// public class strings {
//    public static void main(String[] args) {
//     Scanner sc= new Scanner(System.in);
//     String name=sc.nextLine();
//     System.out.println("your name: "+name);
//    } 
// }






// import java.util.Scanner;
// public class strings {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         String firstName=sc.nextLine();
//         String lastName=sc.nextLine();
//         String fullName=firstName + " " + lastName;
//         System.out.println(fullName);
//         System.out.println(fullName.length());
//         //charAt
//         for(int i=0;i<fullName.length();i++){
//             System.out.println(fullName.charAt(i));
//         }
//     }
// }






// public class strings {

//     public static void main(String[] args) {
//         String n1="tony";
//         String n2="tony";
//         if(n1.compareTo(n2)==0){
//             System.out.println("string are equal");
//         }else{
//             System.out.println("string are not equal");
//         }
//     }
// }





// public class strings {

//     public static void main(String[] args) {
//         String sentance = "My name is anuj";
//         String name = sentance.substring(11,sentance.length());
//         System.out.println(name);
//         String name1 = sentance.substring(0,7);
//         System.out.println(name1);
        
//     }
// }





//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/// string builder

// public class strings {

//     public static void main(String[] args) {
//         StringBuilder sb = new StringBuilder("tony");
//         System.out.println(sb);

//         //charAt
//         System.out.println(sb.charAt(0));


//         //set char at
//         sb.setCharAt(0, 'p');
//         System.out.println(sb);

//         //insert
//         sb.insert(0, 's');
//         System.out.println(sb);

//         //delete
//         sb.delete(0, 1);
//         System.out.println(sb);
//     }
// }



// public class strings {

//     public static void main(String[] args) {
//         StringBuilder sb = new StringBuilder("H");
//         sb.append("e");
//         sb.append("l");
//         sb.append("l");
//         sb.append("o");
//         System.out.println(sb);
//     }
// }




// //Reverse a string
// public class strings {

//     public static void main(String[] args) {
//         StringBuilder sb = new StringBuilder("Hello");
//         for(int i=0;i<sb.length()/2;i++){
//             int front = i;
//             int back = sb.length()-1-i;  //5-1-0=4
//             char frontChar = sb.charAt(front);
//             char backChar = sb.charAt(back);
//             sb.setCharAt(front, backChar);
//             sb.setCharAt(back, frontChar);
//         }
//         System.out.println(sb);
//     }
// }