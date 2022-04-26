package com.javalove;

// Object-Oriented Programming
// Classes & Object are introduced because to solve the problems of the real world

//Imp : We do not write destructor in java, the work of destructor is done by Garbage Collector
class Pen{
    String color; //property
    String type; //property

    //Functions which are defined inside class is called as methods
    public void write(){
        System.out.println("writing something");
    }

    public void printColor()
    {
        System.out.println(this.color);//this keyword will decide which object to call
    }
}

    class Student{
        String name; //property
        int age; //property

        public void printInfo(){
            System.out.println(this.name);
            System.out.println(this.age);
        }
       // Student(){
            //we created a Non-Parameterized constructor here
            //constructor is called every time we create a object
       //  System.out.println("Constructor called");
      //  }

        //Parameterized
//        Student(String name, int age){
//            this.name = name;
//            this.age = age; //this.age is an age of object and equal to age is the parameter passed in constructor
//
//        }

        Student(Student s2){ //copy constructor
            this.name = s2.name;
            this.age = s2.age;
        }
        Student(){

        }
    }

public class ClassObject {
    public static void main(String[] args) {
        Pen pen1 = new Pen(); //pen1 is the object of Pen Class
        pen1.color = "blue"; //stored some value in object pen1
        pen1.type = "gel";
        Pen pen2 = new Pen(); //pen1 is the object of Pen Class
        pen2.color = "black";
        pen2.type = "ballpoint";

        //new keyword will assign some memory
        //Student() is a constructor here
        Student s1 = new Student();
        s1.name = "Rav";
        s1.age = 18;
        s1.printInfo();

        Student s2 = new Student(s1);
        s2.printInfo();


//        pen1.printColor();
//        pen2.printColor();

//        pen1.write();
    }
}
