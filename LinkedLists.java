// public class LinkedLists {

//     Node head;

//     class Node {
//         String data;
//         Node next;

//         Node(String data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     // add first
//     public void addFirst(String data) {
//         Node newNode = new Node(data);

//         if (head == null) {
//             head = newNode;
//             return;
//         }

//         newNode.next = head;
//         head = newNode;
//     }

//     // add last
//     public void addLast(String data) {
//         Node newNode = new Node(data);

//         if (head == null) {
//             head = newNode;
//             return;
//         }

//         Node currNode = head;

//         while (currNode.next != null) {
//             currNode = currNode.next;
//         }

//         currNode.next = newNode;
//     }

//     // print list
//     public void printList() {

//         if (head == null) {
//             System.out.println("List is empty");
//             return;
//         }

//         Node currNode = head;

//         while (currNode != null) {
//             System.out.print(currNode.data + " -> ");
//             currNode = currNode.next;
//         }

//         System.out.println("Null");
//     }

//     public static void main(String[] args) {

//         LinkedLists list = new LinkedLists();

//         list.addFirst("a");
//         list.addFirst("is");

//         list.printList();

//         list.addLast("list");
//         list.printList();

//         list.addFirst("This");
//         list.printList();
//     }
// }










// public class LinkedLists {

//     Node head;

//     private int size;
//     LinkedLists() {
//         this.size = 0;
//     }

//     class Node {
//         String data;
//         Node next;

//         Node(String data) {
//             this.data = data;
//             this.next = null;
//             size++;
//         }
//     }

//     // add first
//     public void addFirst(String data) {
//         Node newNode = new Node(data);

//         if (head == null) {
//             head = newNode;
//             return;
//         }

//         newNode.next = head;
//         head = newNode;
//     }

//     // add last
//     public void addLast(String data) {
//         Node newNode = new Node(data);

//         if (head == null) {
//             head = newNode;
//             return;
//         }

//         Node currNode = head;

//         while (currNode.next != null) {
//             currNode = currNode.next;
//         }

//         currNode.next = newNode;
//     }

//     // print list
//     public void printList() {

//         if (head == null) {
//             System.out.println("List is empty");
//             return;
//         }

//         Node currNode = head;

//         while (currNode != null) {
//             System.out.print(currNode.data + " -> ");
//             currNode = currNode.next;
//         }

//         System.out.println("Null");
//     }
//     // delete first
//     public void deleteFirst() {
//         if (head == null) {
//             System.out.println("List is empty");
//             return;
//         }
//          size--;
//         head = head.next;
//     }
//     // delete last
//     public void deleteLast() {
//         if (head == null) {
//             System.out.println("List is empty");
//             return;
//         }
//             size--;
//         if(head.next == null){
//             head = null;
//             return;
//         }

//         Node secondLast = head;
//         Node lastNode = head.next;
//         while(lastNode.next != null) {
//             secondLast = secondLast.next;
//             lastNode = lastNode.next;
//         }
//         secondLast.next = null;
//     }
//     public int getSize() {
//         return size;
//     }
//     public static void main(String[] args) {

//         LinkedLists list = new LinkedLists();

//         list.addFirst("a");
//         list.addFirst("is");

//         list.printList();

//         list.addLast("list");
//         list.printList();

//         list.addFirst("This");
//         list.printList();

//         list.deleteFirst();
//         list.printList();

//         list.deleteLast();
//         list.printList();

//         System.out.println(list.getSize());
//         list.addFirst("this");
//         System.out.println(list.getSize());
       
//     }
// }





// // using collections framework


// import java.util.LinkedList;
// public class LinkedLists {
//     public static void main(String[] args) {
//         LinkedList<String> list = new LinkedList<>();

//         // add elements to the linked list
//         list.add("This");
//         list.add("is");
//         list.add("a");
//         list.add("linked");
//         list.add("list");

//         System.out.println(list);

//         // add element at the beginning
//         list.addFirst("Hello");
//         System.out.println("After adding element at the beginning: " + list);

//         // add element at the end
//         list.addLast("!");
//         System.out.println("After adding element at the end: " + list);

//         // get element at index
//         String element = list.get(2);
//         System.out.println("Element at index 2: " + element);

//         // remove first element
//         list.removeFirst();
//         System.out.println("After removing first element: " + list);

//         // remove last element
//         list.removeLast();
//         System.out.println("After removing last element: " + list);

//         // size of the linked list
//         int size = list.size();
//         System.out.println("Size of the linked list: " + size);

//         // loop through the linked list
//         for(int i = 0; i < list.size(); i++) {
//             System.out.println(list.get(i)+" ->");
//         }
//          System.out.println("Null");
//     }
// }






//////////////////////////////////////////////////////////////////////////////////////////////////////////////

// reversing a linked list
// iterative approach

// public class LinkedLists {

//     Node head;

//     class Node {
//         int data;
//         Node next;

//         Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     // Add node at end
//     public void addLast(int data) {
//         Node newNode = new Node(data);

//         if (head == null) {
//             head = newNode;
//             return;
//         }

//         Node curr = head;
//         while (curr.next != null) {
//             curr = curr.next;
//         }

//         curr.next = newNode;
//     }

//     // Print Linked List
//     public void printList() {
//         Node curr = head;

//         while (curr != null) {
//             System.out.print(curr.data + " -> ");
//             curr = curr.next;
//         }

//         System.out.println("NULL");
//     }

//     // Reverse Linked List (Iterative)
//     public void reverseIterative() {
//         Node prev = null;
//         Node curr = head;
//         Node next;

//         while (curr != null) {
//             next = curr.next;
//             curr.next = prev;

//             prev = curr;
//             curr = next;
//         }

//         head = prev;
//     }

//     public static void main(String[] args) {

//         LinkedLists list = new LinkedLists();

//         list.addLast(10);
//         list.addLast(20);
//         list.addLast(30);
//         list.addLast(40);

//         System.out.println("Original List:");
//         list.printList();

//         list.reverseIterative();

//         System.out.println("Reversed List (Iterative):");
//         list.printList();
//     }
// }





// recursive approach

// public class LinkedLists {

//     Node head;

//     class Node {
//         int data;
//         Node next;

//         Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     // Add node at end
//     public void addLast(int data) {
//         Node newNode = new Node(data);

//         if (head == null) {
//             head = newNode;
//             return;
//         }

//         Node curr = head;
//         while (curr.next != null) {
//             curr = curr.next;
//         }

//         curr.next = newNode;
//     }

//     // Print list
//     public void printList() {
//         Node curr = head;

//         while (curr != null) {
//             System.out.print(curr.data + " -> ");
//             curr = curr.next;
//         }

//         System.out.println("NULL");
//     }

//     // Reverse recursively
//     public Node reverseRecursive(Node head) {

//         if (head == null || head.next == null) {
//             return head;
//         }

//         Node newHead = reverseRecursive(head.next);

//         head.next.next = head;
//         head.next = null;

//         return newHead;
//     }

//     public static void main(String[] args) {

//         LinkedLists list = new LinkedLists();

//         list.addLast(1);
//         list.addLast(2);
//         list.addLast(3);
//         list.addLast(4);

//         System.out.println("Original List:");
//         list.printList();

//         list.head = list.reverseRecursive(list.head);

//         System.out.println("Reversed List (Recursive):");
//         list.printList();
//     }
// }




/////////////////////////////////////////////////////////////////////////////////////////////////////////////////


// 3 most important questions on linked list

// remove nth node from end of list

// class LinkedLists {

//     Node head;

//     class Node {
//         int data;
//         Node next;

//         Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     // Add node at end
//     public void addLast(int data) {
//         Node newNode = new Node(data);

//         if (head == null) {
//             head = newNode;
//             return;
//         }

//         Node curr = head;
//         while (curr.next != null) {
//             curr = curr.next;
//         }

//         curr.next = newNode;
//     }

//     // Print list
//     public void printList() {
//         Node curr = head;

//         while (curr != null) {
//             System.out.print(curr.data + " -> ");
//             curr = curr.next;
//         }

//         System.out.println("NULL");
//     }

//     // Remove nth node from end
//     public void removeNthFromEnd(int n) {
//         Node dummy = new Node(0);
//         dummy.next = head;
//         Node first = dummy;
//         Node second = dummy;

//         for (int i = 0; i <= n; i++) {
//             first = first.next;
//         }

//         while (first != null) {
//             first = first.next;
//             second = second.next;
//         }

//         second.next = second.next.next;

//         head = dummy.next;
//     }

//     public static void main(String[] args) {

//         LinkedLists list = new LinkedLists();

//         list.addLast(1);
//         list.addLast(2);
//         list.addLast(3);
//         list.addLast(4);
//         list.addLast(5);

//         System.out.println("Original List:");
//         list.printList();

//         int n = 2; // Remove 2nd node from end
//         list.removeNthFromEnd(n);

//         System.out.println("List after removing " + n + "th node from end:");
//         list.printList();
//     }
// }






// palindrome linked list

// class LinkedLists {

//     Node head;

//     class Node {
//         int data;
//         Node next;

//         Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     // Add node at end
//     public void addLast(int data) {
//         Node newNode = new Node(data);

//         if (head == null) {
//             head = newNode;
//             return;
//         }

//         Node curr = head;
//         while (curr.next != null) {
//             curr = curr.next;
//         }

//         curr.next = newNode;
//     }

//     // Print list
//     public void printList() {
//         Node curr = head;

//         while (curr != null) {
//             System.out.print(curr.data + " -> ");
//             curr = curr.next;
//         }

//         System.out.println("NULL");
//     }

//     // Check if linked list is palindrome
//     public boolean isPalindrome() {
//         if (head == null || head.next == null) {
//             return true;
//         }

//         // Find the middle of the linked list
//         Node slow = head;
//         Node fast = head;

//         while (fast != null && fast.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;
//         }

//         // Reverse the second half of the linked list
//         Node prev = null;
//         Node curr = slow;

//         while (curr != null) {
//             Node nextTemp = curr.next;
//             curr.next = prev;
//             prev = curr;
//             curr = nextTemp;
//         }

//         // Compare the first half and the reversed second half
//         Node firstHalf = head;
//         Node secondHalf = prev;

//         while (secondHalf != null) {
//             if (firstHalf.data != secondHalf.data) {
//                 return false; // Not a palindrome
//             }
//             firstHalf = firstHalf.next;
//             secondHalf = secondHalf.next;
//         }

//         return true; // Is a palindrome
//     }

//     public static void main(String[] args) {

//         LinkedLists list = new LinkedLists();

//         list.addLast(1);
//         list.addLast(2);
//         list.addLast(3);
//         list.addLast(2);
//         list.addLast(1);

//         System.out.println("Linked List:");
//         list.printList();

//         boolean result = list.isPalindrome();
//         System.out.println("Is the linked list a palindrome? " + result);
//     }
// }









// linked list cycle
class LinkedLists{
    
}