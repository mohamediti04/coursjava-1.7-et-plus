package edu.developpementdigital.heritage.cast;

public class TestHeritage {


    public static void main(String[] args) {
        //Upcasting
        Student student=new Student();
        Person person=student;
        person.showInformation();

        Professor professor=new Professor();
        person=professor;
        //person.showInformation();

        //Downcasting

        Person personProfessor=new Professor();
        Professor professor1=(Professor) personProfessor;
       // professor1.getMaxSalary();








    }
}
