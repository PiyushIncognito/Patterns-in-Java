package com.javalove;

//Polymorphism : Poly means many & morphism means forms
// to do a particular work in different ways is polymorphism
//Two types :1) Compile time(Function Overloading)
//           2) Runtime (Function Overriding)
//Function Overloading - Similar names of func but different work
class Employee{
    String name;
    int age;

    public void printInfo(String name){
        System.out.println(name);
    }
    public void printInfo(int age){
        System.out.println(age);
    }
    public void printInfo(String name, int age){
        System.out.println(name + " " + age);
    }
}

//Errors which comes while compile time is compile time polymorphism
//Errors which comes while run time is run time polymorphism

public class Polymorphism {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.name = "Raju";
        emp1.age = 25;

        emp1.printInfo(emp1.age);
        emp1.printInfo(emp1.name);
        emp1.printInfo(emp1.name, emp1.age);
    }
}
