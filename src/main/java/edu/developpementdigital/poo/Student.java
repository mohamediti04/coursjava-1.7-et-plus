package edu.developpementdigital.poo;

 public class Student {

    int id;
    String lastName;
    String firstName;
    String subscriptionDate;
    String branch;

     void showStudentInformation(){

        System.out.println("ID : "+id);
        System.out.println("Last name  : "+lastName);
        System.out.println("First name  : "+firstName);
        System.out.println("Subscription date : "+subscriptionDate);
        System.out.println("Branch : "+branch);
    }
}
