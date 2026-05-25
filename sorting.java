// Bubble Sort

// public class sorting {
//     public static void print(int arr[]) {
//         for(int i = 0; i < arr.length; i++){
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {

//         int arr[] = {7, 8, 3, 1, 2};

//         // Bubble Sort
//         for(int i = 0; i < arr.length - 1; i++){
//             for(int j = 0; j < arr.length - 1 - i; j++){
//                 if(arr[j] > arr[j + 1]){
                    
//                     // swap
//                     int temp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = temp;
//                 }
//             }
//         }

//         // print sorted array
//         print(arr);
//     }
// }







// Selection Sort

// public class sorting {

//     public static void print(int arr[]) {
//         for(int i = 0; i < arr.length; i++){
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {

//         int arr[] = {7, 8, 3, 1, 2};

//         // Selection Sort
//         for(int i = 0; i < arr.length - 1; i++){
//             int minPos = i;
//             for(int j = i + 1; j < arr.length; j++){
//                 if(arr[minPos] > arr[j]){
//                     minPos = j;
//                 }
//             }

//             // swap
//             int temp = arr[minPos];
//             arr[minPos] = arr[i];
//             arr[i] = temp;
//         }

//         // print sorted array
//         print(arr);
//     }
// }








// Insertion Sort

// public class sorting {

//     public static void print(int arr[]) {
//         for(int i = 0; i < arr.length; i++){
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {

//         int arr[] = {7, 8, 3, 1, 2};

//         // Insertion Sort
//         for(int i = 1; i < arr.length; i++){
//             int current = arr[i];
//             int j = i - 1;
//             while(j >= 0 && arr[j] > current){
//                 arr[j + 1] = arr[j];
//                 j--;
//             }
//             // placement
//             arr[j + 1] = current;
//         }

//         // print sorted array
//         print(arr);
//     }
// }







// Merge Sort

// public class sorting {
//      public static void divide(int arr[], int si, int ei) {
//         if(si >= ei) {
//             return;
//         }

//         int mid = si + (ei - si) / 2;
//         divide(arr, si, mid);
//         divide(arr, mid + 1, ei);
//         conquer(arr, si, mid, ei);
//     }
//     public static void conquer(int arr[], int si, int mid, int ei) {
//         int merged[] = new int[ei - si + 1];
//         int idx1 = si;
//         int idx2 = mid + 1;
//         int x = 0;

//         while(idx1 <= mid && idx2 <= ei) {
//             if(arr[idx1] <= arr[idx2]) {
//                 merged[x++] = arr[idx1++];
//             } else {
//                 merged[x++] = arr[idx2++];
//             }
//         }

//         while(idx1 <= mid) {
//             merged[x++] = arr[idx1++];
//         }

//         while(idx2 <= ei) {
//             merged[x++] = arr[idx2++];
//         }

//         for(int i = 0, j = si; i < merged.length; i++, j++) {
//             arr[j] = merged[i];
//         }
//     }

//     public static void print(int arr[]) {
//         for(int i = 0; i < arr.length; i++){
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {

//         int arr[] = {9, 7, 8, 3, 1, 2};

//         // Merge Sort
//         divide(arr, 0, arr.length - 1);

//         // print sorted array
//         print(arr);
//     }
// }







// Quick Sort

// public class sorting {
//     public static void quickSort(int arr[], int si, int ei) {
//         if(si >= ei) {
//             return;
//         }

//         int pIdx = partition(arr, si, ei);
//         quickSort(arr, si, pIdx - 1);
//         quickSort(arr, pIdx + 1, ei);
//     }

//     public static int partition(int arr[], int si, int ei) {
//         int pivot = arr[ei];
//         int i = si - 1;

//         for(int j = si; j < ei; j++) {
//             if(arr[j] <= pivot) {
//                 i++;
//                 // swap
//                 int temp = arr[i];
//                 arr[i] = arr[j];
//                 arr[j] = temp;
//             }
//         }

//         // swap pivot
//         int temp = arr[i + 1];
//         arr[i + 1] = arr[ei];
//         arr[ei] = temp;

//         return i + 1;
//     }

//     public static void print(int arr[]) {
//         for(int i = 0; i < arr.length; i++){
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {

//         int arr[] = {9, 7, 8, 3, 1, 2};

//         // Quick Sort
//         quickSort(arr, 0, arr.length - 1);

//         // print sorted array
//         print(arr);
//     }
// }
    