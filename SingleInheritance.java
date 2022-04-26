package com.javalove;
//Single Inheritance
//Multilevel Inheritance
//Hierarchical Inheritance
//Interface(Java) used instead of Multiple inheritance(C++)
class Aakar{
    public void area(){
        System.out.println("display area");
    }
}

class Square extends Aakar{
    public void area(int l, int h) {
        System.out.println(1/2*l*h);
    }
}

class Circle extends Aakar{
    public void area(int r){
        System.out.println((3.14)*r*r*r);
    }
}

class EquilateralTriangle extends Square{
    public void area(int l, int h) {
        System.out.println(1/2*l*h);
    }
}



public class SingleInheritance {
    public static void main(String[] args) {

        Circle c1 = new Circle();
        c1.area(4);

        EquilateralTriangle a1 = new EquilateralTriangle();
        a1.area(4,5);
        a1.area();

    }
}
