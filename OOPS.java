// class Pen{
//     String color;
//     String type;

//     public void write(){
//         System.out.println("writing something");
//     }
// }
// public class OOPS {
//     public static void main(String[] args) {
//         Pen pen1 = new Pen();
//         pen1.color = "blue";
//         pen1.type = "gel";
//         pen1.write();
//     }
// }




// class Pen{
//     String color;
//     String type;

//     public void write(){
//         System.out.println("writing something");
//     }
//     public void printColor(){
//         System.out.println(this.color);
//     }
// }
// public class OOPS {
//     public static void main(String[] args) {
//         Pen pen1 = new Pen();
//         pen1.color = "blue";
//         pen1.type = "gel";
//         pen1.printColor();

//         Pen pen2= new Pen();
//             pen2.color = "black";
//             pen2.type = "ballpoint";
//             pen2.printColor();
//     }

// }




// class Student{
//     String name;
//     int age;

//     public void printInfo(){
//         System.out.println(this.name);
//         System.out.println(this.age);
//     }
//     Student(){
//         System.out.println("constructor called");
//     }
// }
//     public class OOPS {
//         public static void main(String[] args) {
//             Student student1 = new Student();
//             student1.name = "Alice";
//             student1.age = 20;
//             student1.printInfo();

//             Student student2 = new Student();
//             student2.name = "Bob";
//             student2.age = 22;
//             student2.printInfo();
//         }
        
// }







// parameterized constructor

// class Student{
//     String name;
//     int age;

//     public void printInfo(){
//         System.out.println(this.name);
//         System.out.println(this.age);
//     }
//     Student(String name, int age){
//         this.name = name;
//         this.age = age;
//     }
// }
//     public class OOPS {
//         public static void main(String[] args) {
//             Student student1 = new Student("Alice", 20);
//             student1.printInfo();
//         }
//     }








// copy constructor

// class Student{
//     String name;
//     int age;

//     public void printInfo(){
//         System.out.println(this.name);
//         System.out.println(this.age);
//     }
//     Student(String name, int age){
//         this.name = name;
//         this.age = age;
//     }
//     Student(){

//     }
//     Student(Student s){
//         this.name = s.name;
//         this.age = s.age;
//     }
// }
//     public class OOPS {
//         public static void main(String[] args) {
//             Student student1 = new Student("Alice", 20);
//             Student student2 = new Student(student1);
//             student2.printInfo();

//         }
//     }






// method overloading  compile time polymorphism

// class Student{
//     String name;
//     int age;

//     public void printInfo(String name){
//         System.out.println(name);
//     }
//     public void printInfo(int age){
//         System.out.println(age);
//     }
//     public void printInfo(String name, int age){
//         System.out.println(name + " " + age);
//     }
// }
//     public class OOPS {
//         public static void main(String[] args) {
//             Student student1 = new Student();
//             student1.name = "Alice";
//             student1.age = 20;
//             student1.printInfo(student1.name, student1.age);
//         }
//     }

        




///////////////////////////////////////////////////////////////////////////////////////////////////////////////

// inheritance

// class Shape{
//     String color;
// }
// class Triangle extends Shape{
// }
//     public class OOPS {
    
//         public static void main(String[] args) {
//             Triangle triangle1 = new Triangle();
//             triangle1.color = "red";
//             System.out.println(triangle1.color);
//         }
//     }





// single level inheritance

// class shape{
//     public void area(){
//         System.out.println("displaying area");
//     }
// }
// class Triangle extends shape{
//     public void area(int base, int height){
//         System.out.println(0.5 * base * height);
//     }
// }
//     public class OOPS {
//         public static void main(String[] args) {
//             Triangle triangle1 = new Triangle();
//             triangle1.area(10, 20);
//         }
//     }




// multi level inheritance

// class shape{
//     public void area(){
//         System.out.println("displaying area");
//     }
// }
// class Triangle extends shape{
//     public void area(int base, int height){
//         System.out.println(0.5 * base * height);
//     }
// }
// class EquilateralTriangle extends Triangle{
//     public void area(int side){
//         System.out.println((Math.sqrt(3) / 4) * side * side);
//     }
// }
//     public class OOPS {
//         public static void main(String[] args) {
//             EquilateralTriangle triangle1 = new EquilateralTriangle();
//             triangle1.area(10);
            
//         }
//     }



// hierarchical inheritance

// class shape{
//     public void area(){
//         System.out.println("displaying area");
//     }
// }
// class Triangle extends shape{
//     public void area(int base, int height){
//         System.out.println(0.5 * base * height);
//     }
// }
// class EquilateralTriangle extends Triangle{
//     public void area(int side){
//         System.out.println((Math.sqrt(3) / 4) * side * side);
//     }
// }
//     class Circle extends shape{
//         public void area(int radius){
//             System.out.println(Math.PI * radius * radius);
//         }
// }
//     public class OOPS {
//         public static void main(String[] args) {
//             EquilateralTriangle triangle1 = new EquilateralTriangle();
//             triangle1.area(10);
//             Circle circle1 = new Circle();
//             circle1.area(5);
//         }
//     }




// hybrid inheritance

// class shape{
//     public void area(){
//         System.out.println("displaying area");
//     }
// }
// class Triangle extends shape{
//     public void area(int base, int height){
//         System.out.println(0.5 * base * height);
//     }
// }
// class EquilateralTriangle extends Triangle{
//     public void area(int side){
//         System.out.println((Math.sqrt(3) / 4) * side * side);
//     }
// }
//     class Circle extends shape{
//         public void area(int radius){
//             System.out.println(Math.PI * radius * radius);
//         }
// }
//     class Cylinder extends Circle{
//         public void area(int radius, int height){
//             System.out.println(2 * Math.PI * radius * height + 2 * Math.PI * radius * radius);
//         }
// }
//     public class OOPS {
//         public static void main(String[] args) {
//             EquilateralTriangle triangle1 = new EquilateralTriangle();
//             triangle1.area(10);
//             Circle circle1 = new Circle();
//             circle1.area(5);
//             Cylinder cylinder1 = new Cylinder();
//             cylinder1.area(5, 10);
//         }
//     }




//////////////////////////////////////////////////////////////////////////////////////////////////////////////////





// abstraction

// abstract class Animal {
//    abstract void walk();
//    void breathe() {
//        System.out.println("This animal breathes air");
//    }
//    Animal() {
//        System.out.println("You are about to create an Animal.");
//    }
// }


// class Horse extends Animal {
//    Horse() {
//        System.out.println("Wow, you have created a Horse!");
//    }
//    void walk() {
//        System.out.println("Horse walks on 4 legs");
//    }
// }


// class Chicken extends Animal {
//    Chicken() {
//        System.out.println("Wow, you have created a Chicken!");
//    }
//    void walk() {
//        System.out.println("Chicken walks on 2 legs");
//    }
// }


// public class OOPS {
//    public static void main(String args[]) {
//       Horse horse = new Horse();
//       horse.walk();
//       horse.breathe();
//    }
// }



//////////////////////////////////////////////////////////////////////////////////////////////////////////////////


// interface

// interface Animal {
//    void walk();
// }


// class Horse implements Animal {
//    public void walk() {
//        System.out.println("Horse walks on 4 legs");
//    }
// }


// class Chicken implements Animal {
//    public void walk() {
//        System.out.println("Chicken walks on 2 legs");
//    }
// }


// public class OOPS {
//    public static void main(String args[]) {
//       Horse horse = new Horse();
//       horse.walk();
//    }
// }




//////////////////////////////////////////////////////////////////////////////////////////////////////////////////



// static keyword

// class Student {
//    static String school;
//    String name;   
// }


// public class OOPS {
//    public static void main(String args[]) {
//        Student.school = "JMV";
//        Student s1 = new Student();
//        Student s2 = new Student();


//        s1.name = "Meena";
//        s2.name = "Beena";


//        System.out.println(s1.school);
//        System.out.println(s2.school);
//    }
// }
