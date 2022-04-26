package com.javalove;
//Access Specifiers
//default,public,private,protected
//protected : Accessed by only Subclass and its own package
//private : used by getters and setters
//Encapsulation : Data hiding

class Account{
    public String name;
    protected String email;
    private String password;

    public String getPassword(){
        return this.password;
    }
    public void setPassword(String pass){
        this.password = pass;
    }

}
public class Encapsulation {
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.setPassword("Piyu");
        System.out.println(a1.getPassword());
    }

}
