// public class stack {

//     static class Node {
//         int data;
//         Node next;

//         public Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     static class Stack {
//         Node head = null;

//         public boolean isEmpty() {
//             return head == null;
//         }

//         public void push(int data) {
//             Node newNode = new Node(data);

//             if (isEmpty()) {
//                 head = newNode;
//                 return;
//             }

//             newNode.next = head;
//             head = newNode;
//         }

//         public int pop() {
//             if (isEmpty()) {
//                 return -1;
//             }

//             int top = head.data;
//             head = head.next;
//             return top;
//         }

//         public int peek() {
//             if (isEmpty()) {
//                 return -1;
//             }

//             return head.data;
//         }
//     }

//     public static void main(String[] args) {

//         Stack s = new Stack();

//         s.push(0);
//         s.push(1);
//         s.push(2);
//         s.push(3);

//         while (!s.isEmpty()) {
//             System.out.println(s.peek());
//             s.pop();
//         }
//     }
// }





// arraylist 

// import java.util.ArrayList;

// public class stack {

//     static class Stack {
//         ArrayList<Integer> list = new ArrayList<>();

//         // check if stack is empty
//         public boolean isEmpty() {
//             return list.size() == 0;
//         }

//         // push
//         public void push(int data) {
//             list.add(data);
//         }

//         // pop
//         public int pop() {
//             if (isEmpty()) {
//                 return -1;
//             }
//             int top = list.get(list.size() - 1);
//             list.remove(list.size() - 1);
//             return top;
//         }

//         // peek
//         public int peek() {
//             if (isEmpty()) {
//                 return -1;
//             }
//             return list.get(list.size() - 1);
//         }
//     }

//     public static void main(String[] args) {
//         Stack s = new Stack();

//         s.push(0);
//         s.push(1);
//         s.push(2);
//         s.push(3);

//         while (!s.isEmpty()) {
//             System.out.println(s.peek());
//             s.pop();
//         }
//     }
// }






// collection framework

// import java.util.*;
// public class stack{
//     public static void main(String[] args) {
//         Stack<Integer> s=new Stack<>();
//          s.push(0);
//         s.push(1);
//         s.push(2);
//         s.push(3);

//         while (!s.isEmpty()) {
//             System.out.println(s.peek());
//             s.pop();
//         }
//     }
// }






// push at the bottom of stack

// import java.util.*;
// public class stack {
//     public static void pushatbottom(int data, Stack<Integer> s){
//         if(s.isEmpty()){
//             s.push(data);
//             return;
//         }
//      int top = s.pop();
//      pushatbottom(data, s);
//      s.push(top);
//     }
//     public static void main(String[] args) {
//         Stack<Integer> s=new Stack<>();
//         s.push(0);
//         s.push(1);
//         s.push(2);
//         s.push(3);
         
//         pushatbottom(4, s);
//         while (!s.isEmpty()) {
//             System.out.println(s.peek());
//             s.pop();
//         }
//     }
// }




// reverse a stack

import java.util.*;
public class stack {
    public static void pushatbottom(int data, Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
     int top = s.pop();
     pushatbottom(data, s);
     s.push(top);
    }
    public static void reverse(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverse(s);
        pushatbottom(top, s);
    }
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(0);
        s.push(1);
        s.push(2);
        s.push(3);
         

        reverse(s);
   
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}