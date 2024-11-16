package edu.developpementdigital.heritage.cast;

public class UpDownCasting {

    interface Inter { }

    class ClasseParent implements Inter {  }

    class Derivee extends ClasseParent {  }

    Derivee objEnfant = new Derivee();
    // Conversion implicite upcasting
    ClasseParent objParent = (ClasseParent)objEnfant; // optional (ClasseParent) // équivaut à ClasseParent objParent = objEnfant;

    Inter objInterface = (Inter)objParent;// optional (Inter) // équivaut à Inter objInterface = objParent;

    Inter objInterface2 = (Inter)objEnfant; // optional (Inter) // équivaut à Inter objInterface2 = objEnfant;


    // Conversion explicite downcasting
    Derivee objEnfant2 = (Derivee)objParent;
    ClasseParent objParent2 = (ClasseParent)objInterface2;
    Derivee objEnfant3 = (Derivee)objInterface2;

    public static void main(String[] args) {

    }
}
