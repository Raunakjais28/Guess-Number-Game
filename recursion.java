// public class recursion {

//     public static void print(int n) {
//         if(n == 0){
//             return;
//         }
//         System.out.println(n);
//         print(n - 1);
//     }

//     public static void main(String[] args) {
//         int n = 5;
//         print(n);
//     }
// }






// public class recursion {
// public static void printsum(int i, int n, int sum) {
//     if(i==n){
//         sum += i;
//         System.out.println(sum);
//         return;
//     }
//     sum += i;
//     printsum(i + 1, n, sum);
// }
//     public static void main(String[] args) {
//         printsum(1,5,0);
//     }
// }






// public class recursion {
//     public static int printfactorial(int n){
//         if(n==1 || n==0){
//             return 1;
//         }
//         int fact_nm1=printfactorial(n-1);
//         int fact_n = n*fact_nm1;
//         return fact_n;
//     }

//     public static void main(String[] args) {
//         int n=5;
//         int ans = printfactorial(n);
//         System.out.println(ans);

//     }
// }






// public class recursion {
//      public static void printfibo(int a, int b, int n){
//         if(n==0){
//             return;
//         }
//         int c=a+b;
//          System.out.println(c);
//          printfibo(b,c,n-1);
//      }
//     public static void main(String[] args) {
//         int a=0, b=1;
//         System.out.println(a);
//         System.out.println(b);
//         int n=7;
//         printfibo(a,b,n-2);
//     }
// }






// public class recursion {
//     public static int calpower(int x, int n){
//         if(n==0){
//             return 1;
//         }
//         if(x==0){
//             return 0;
//         }
//         int xpower1=calpower(x,n-1);
//         int xpower =x*xpower1;
//         return xpower;
//     }
// stack height n
//     public static void main(String[] args) {
//         int x=2, n=5;
//         int ans = calpower(x, n);
//         System.out.println(ans);
//     }
// }






// public class recursion {
//     public static int calpower(int x, int n){
//         if(n==0){
//             return 1;
//         }
//         if(x==0){
//             return 0;
//         }
//         // if n is even
//         if(n%2==0){
//            return calpower(x, n/2)* calpower(x, n/2);

//         }else{ // n is odd
//             return calpower(x, n/2)* calpower(x, n/2) * x;
//         }
//     }
//    // stack height (log n)
//     public static void main(String[] args) {
//         int x=2, n=5;
//         int ans = calpower(x, n);
//         System.out.println(ans);
//     }
// }







// 9 top questions on recursion


// public class recursion {

//     public static void towerofhanoi(int n, String src, String helper, String dest) {
//         if (n == 1) {
//             System.out.println("transfer disk " + n + " from " + src + " to " + dest);
//             return;
//         }
//         towerofhanoi(n - 1, src, dest, helper);
//         System.out.println("transfer disk " + n + " from " + src + " to " + dest);
//         towerofhanoi(n - 1, helper, src, dest);
//     }

//     public static void main(String[] args) {
//         int n = 3;
//         towerofhanoi(n, "S", "H", "D");

//     }
// }






// public class recursion {

//     public static void printreverse(String str, int idx) {
//         if (idx == 0) {
//             System.out.println(str.charAt(idx));
//             return;
//         }
//         System.out.print(str.charAt(idx));
//         printreverse(str, idx - 1);
//     }
//     public static void main(String[] args) {
//         String str = "hello";
//         printreverse(str, str.length() - 1);
//     }
// }






// public class recursion {

//     public static int first=-1;
//     public static int last=-1;
//     public static void findoccurrence(String str,int idx, char element) {
//         if(idx==str.length()){
//             System.out.println(first);
//             System.out.println(last);
//             return;
//         }
//         char currentchar = str.charAt(idx);
//         if(currentchar==element){
//             if(first==-1){
//                 first=idx;
//             }else{
//                 last=idx;
//             }
//         }
//         findoccurrence(str, idx + 1, element);
//     }
//     public static void main(String[] args) {
//         String str = "hello";
//         char element = 'l';
//         findoccurrence(str, 0, element);
//     }
// }






// public class recursion {

//     public static boolean issorted(int arr[], int idx) {
//         if (idx == arr.length - 1) {
//             return true;
//         }
//         if (arr[idx] < arr[idx + 1]) {
//             return issorted(arr, idx + 1);
//         } else {
//             return false;
//         }
//     }
//     public static void main(String[] args) {
//         int arr[] = {1, 2, 3, 4, 5};
//         boolean ans = issorted(arr, 0);
//         System.out.println(ans);
//     }
// }






// public class recursion {
//     public static void moveallx(String str, int idx, int countx, String newstr) {
//         if (idx == str.length()) {
//                 for (int i = 0; i < countx; i++) {
//                     newstr += 'x';
//                 }
//             System.out.println(newstr);
//             return;
//         }
//         char currchar = str.charAt(idx);
//         if (currchar == 'x') {
//             countx++;
//             moveallx(str, idx + 1, countx, newstr);
//         } else {
//             newstr += currchar;
//             moveallx(str, idx + 1, countx, newstr);
//         }
//     }
//     public static void main(String[] args) {
//         String str = "axbcxxd";
//         moveallx(str, 0, 0, "");
//     }
// }






// public class recursion {
//     public static boolean[] map = new boolean[26];
//         public static void removeduplicates(String str, int idx, String newstr){
//             if(idx==str.length()){
//                 System.out.println(newstr);
//                 return;
//             }
//         char currchar = str.charAt(idx);
//         if(map[currchar - 'a']){
//             removeduplicates(str, idx + 1, newstr);
//         }else{
//             newstr += currchar;
//             map[currchar - 'a'] = true;
//             removeduplicates(str, idx + 1, newstr);
//         }

//  }
//     public static void main(String[] args) {
//         String str = "abccba";
//         removeduplicates(str, 0, "");
//     }
// }






// public class recursion {
//     public static void subsequences(String str, int idx, String newstr) {
//         if (idx == str.length()) {
//             System.out.println(newstr);
//             return;
//         }
//         char currchar = str.charAt(idx);
//         // to be
//         subsequences(str, idx + 1, newstr + currchar);
//         // not to be
//         subsequences(str, idx + 1, newstr);
//     }
//     public static void main(String[] args) {
//         String str = "abc";
//         subsequences(str, 0, "");
//     }
// }






// import java.util.HashSet;
// public class recursion {
//     public static void subsequences(String str, int idx, String newstr, HashSet<String> set) {
//         if (idx == str.length()) {
//             if (set.contains(newstr)) {
//                 return;
//             } else {
//                 System.out.println(newstr);
//                 set.add(newstr);
//             }
//             return;
//         }
//         char currchar = str.charAt(idx);
//         // to be
//         subsequences(str, idx + 1, newstr + currchar, set);
//         // not to be
//         subsequences(str, idx + 1, newstr, set);
//     }
//     public static void main(String[] args) {
//         String str = "aaa";
//         HashSet<String> set = new HashSet<>();
//         subsequences(str, 0, "", set);
//     }
// }






// public class recursion {
//     public static String keypad[] = { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs",
//             "tu", "vwx", "yz" };

//     public static void printKeypadCombination(String number, int idx, String res) {
//         if (idx == number.length()) {
//             System.out.println(res);
//             return;
//         }
//         for (int i = 0; i < keypad[number.charAt(idx) - '0'].length(); i++) {
//             char curr = keypad[number.charAt(idx) - '0'].charAt(i);
//             printKeypadCombination(number, idx + 1, res + curr);
//         }
//     }

//     public static void main(String args[]) {
//         String number = "23";
//         printKeypadCombination(number, 0, "");
//     }
// }





// 5 advanced questions on recursion



// public class recursion {
//     public static void printpermutation(String str, String perm){
//         if(str.length()==0){
//             System.out.println(perm);
//             return;
//         }
//         for(int i=0; i<str.length(); i++){
//             char currchar = str.charAt(i);
//             // "abc" -> "ab"
//             String newstr = str.substring(0, i) + str.substring(i + 1);
//             printpermutation(newstr, perm + currchar);
//         }
//     }

//     public static void main(String[] args) {
//         printpermutation("abc", "");
//     }
// }





// public class recursion {

//     public static int countpaths(int i, int j, int n, int m) {
//         if(i==n||j==m){
//             return 0;
//         }
//         if (i == n - 1 && j == m - 1) {
//             return 1;
//         }
//         if (i >= n || j >= m) {
//             return 0;
//         }
//         int downpaths = countpaths(i + 1, j, n, m);
//         int rightpaths = countpaths(i, j + 1, n, m);
//         return downpaths + rightpaths;
//     }
//     public static void main(String[] args) {
//         int n = 3, m = 3;
//         int ans = countpaths(0, 0, n, m);
//         System.out.println(ans);
//     }

// }





// public class recursion {
//     public static int placetiles(int n, int m) {
//         if (n == m) {
//             return 2;
//         }
//         if (n < m) {
//             return 1;
//         }
//         int vert = placetiles(n - m, m);
//         int horiz = placetiles(n - 1, m);
//         return vert + horiz;
//     }
//     public static void main(String[] args) {
//         // int n = 3, m = 3;
//         int n = 4, m = 2;
//         int ans = placetiles(n, m);
//         System.out.println(ans);
//     }
// }





// public class recursion {

//     public static int callguests(int n) {
//         if(n<=1){
//             return 1;
//         }
//         //single
//         int ways1= callguests(n-1);
//         //pair
//         int ways2= (n-1)*callguests(n-2);
//         return ways1 + ways2;
//     }
//     public static void main(String[] args) {
//         int n = 4;
//         int ans = callguests(n);
//         System.out.println(ans);
//     }
// }





// import java.util.*;

// public class recursion {

//     public static void printsubsets(ArrayList<Integer> subset){
//         for(int i = 0; i < subset.size(); i++){
//             System.out.print(subset.get(i) + " ");
//         }
//         System.out.println();
//     }

//     public static void findsubsets(int n, ArrayList<Integer> subset){
//         if(n == 0){
//             printsubsets(subset);
//             return;
//         }

//         // add element
//         subset.add(n);
//         findsubsets(n - 1, subset);

//         // remove element
//         subset.remove(subset.size() - 1);
//         findsubsets(n - 1, subset);
//     }

//     public static void main(String[] args) {
//         int n = 3;
//         ArrayList<Integer> subset = new ArrayList<>();
//         findsubsets(n, subset);
//     }
// }