package edu.developpementdigital.compitition;

public class TestCompetition {

    public static void main(String[] args) {
        //Call parent method
        Joueur joueur=new Joueur();
       // joueur.imParentMethod();
        //Call Entraineur child method using Parent joueur instance
        //joueur.  // dont exsist
        //solution is downcasting
        Joueur joueur2=new Entraineur();
        Entraineur entraineur= (Entraineur)joueur2;
        entraineur.imMehodeChild();
    }
}
