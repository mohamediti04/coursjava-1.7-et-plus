package edu.developpementdigital.poo.pk1;

public class ClassA {

    int number;
    private  String email;
    public void showNumber(){

        System.out.println("Number  = "+number);
    }

    public void setNumber(int number){
        this.number=number;
    }

    public String getEmail(){
        return this.email;
    }
}

class ClassB extends ClassA{

    String name;

    public void showName(){
        System.out.println("Name  = "+this.number);
       number=5;
        System.out.println("access to show Email for classA : "+getEmail());

    }

}
