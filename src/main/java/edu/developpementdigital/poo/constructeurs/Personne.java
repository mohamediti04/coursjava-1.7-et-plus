package edu.developpementdigital.poo.constructeurs;

public class Personne {

    public  int id;
    public String nom;

    public Personne(){

        System.out.println("Je suis Constructeur explicite");
    }


    /*public Personne(int idParametre , String nomParametre){
            this(); // Appel constrcuteur sans parametres
        id=idParametre;
        nom=nomParametre;
    }*/
    public Personne(int idParametre ){

        id=idParametre;

    }
    public Personne(String nomParametre ){

    nom=nomParametre;

    }

    public Personne(Personne personne){

        id=personne.id;
        nom=personne.nom;
    }

    public Personne(int id , String nom){
            this();
           // this(5,"ali");
        this.id=id;
        this.nom=nom;
    }
}
