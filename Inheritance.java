package com.javalove;

//Inheritance : If a class wants to inherit the properties of another clas then it is called as inheritance
//Reusablity is increased
//Parent Class - Base Class | Child Class - Sub Class
//4 types of inheritance :
//1) Single Inheritance : Only base and sub class

class Shape{
    String color;
}

class Triangle extends Shape{

}

public class Inheritance {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.color = "blue";

    }
}
