package edu.developpementdigital.poo;

public class Main {

    public static void main(String[] args) {
        Student student1=new Student();
        Student student2=new Student();
        System.out.println(student1);
        student2.lastName="csd";
        student2.showStudentInformation();
    }
}
