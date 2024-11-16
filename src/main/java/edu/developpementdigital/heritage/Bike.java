package edu.developpementdigital.heritage;

public class Bike  extends Viehcule{

    int nbrCC;
//overriding (redifinition)
@Override
public void whoIm(){
    super.whoIm();
    System.out.println("Im Bike");

}
//nouvelle methode
public void comunnWhoIm(){
    whoIm();
    System.out.println("Im Bike");

}
public Bike(){
    System.out.println("I create a  Bike");

}
}
