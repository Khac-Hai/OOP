package com.mycompany;


public class Main {
    public static void main(String[] args) {
        Book myObj = new Book("a","b",2);
        System.out.println(myObj.titel);
        Student myStu = new Student();
        myStu.StudentID ="abcd";
        System.out.println(myStu.StudentID);
    }
}
