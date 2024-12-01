package edu.developpementdigital.heritage;

public     class Viehcule {
    protected int matricul;
    protected  String mark;

    public void whoIm(){
        System.out.println("Im Viehcule");

    }
    public Viehcule(){
        System.out.println("I create a  Viehcule");
    }
    public Viehcule(int matricul,String mark){
        System.out.println("I create a  Viehcule with parametrized constructor");
    }

    //matricule : 15 أ55545
    //Mark : Renault
}
