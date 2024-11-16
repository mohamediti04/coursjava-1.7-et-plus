package edu.developpementdigital.heritage.cast;

public class Person {

    protected int personId;
    protected String personName;

    //Method to show information  of person
    public void showInformation(){
        System.out.println("Person information");

        System.out.println("Person ID : "+this.personId);
        System.out.println("Person Name : "+this.personName);

    }
    /*public void getSalary(){
        System.out.println("Salary = "+10000+"DH");
    }*/
}
