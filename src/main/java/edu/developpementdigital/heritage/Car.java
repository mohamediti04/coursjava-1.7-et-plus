package edu.developpementdigital.heritage;

public class Car extends Viehcule{

    int nbrhevaux;
    //overriding (redifinition)
   @Override
    public void whoIm(){
     super.mark="Mark Class mere";
       super.whoIm();
        System.out.println("Im Car");

    }

    public Car(){
       super();
        System.out.println("I create a  Car");

    }
    public Car(int matricul,String mark){
        super(matricul,mark);
        System.out.println("I create a  Car");

    }

}
