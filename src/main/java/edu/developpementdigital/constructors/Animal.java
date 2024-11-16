package edu.developpementdigital.constructors;

public class Animal {
    protected  String nom;
    protected String nouriture;



    public void emettreSon(){}
    public void manger(){

        System.out.println("Je mange "+this.nouriture);
    }

    public static void main(String[] args) {

        Animal animalChien=new Animal(); //cree automatique par compilateur
        animalChien.nom="dalmatin";
        animalChien.nouriture="viande";
        animalChien.manger();



    }

}
