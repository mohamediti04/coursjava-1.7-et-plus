package edu.developpementdigital.poo.constructeurs;

public class Voiture {

   private int vitesse;
     public Voiture(int vitesse){
       this.setVitesse(vitesse);


     }

    public Voiture(){



    }

    public void affciheVitess(){

        System.out.println("Vitesse = "+this.vitesse);
    }

    public void setVitesse(int vitesse){


         if(vitesse >0){
             this.vitesse=vitesse;
         }else{
             System.err.println("Vitesse doit etre positive");

         }
    }

}
