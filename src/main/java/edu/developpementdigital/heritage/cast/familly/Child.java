package edu.developpementdigital.heritage.cast.familly;

public class Child extends Parent{


    public void imChildMethod(){

        System.out.println("Im Child Methode dont call me , i must sleep now ;*)");
    }


    @Override
    public void whoIm() {
        System.out.println("Im Child");
    }
}
