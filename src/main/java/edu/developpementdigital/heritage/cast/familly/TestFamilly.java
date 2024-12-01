package edu.developpementdigital.heritage.cast.familly;

public class TestFamilly {


    public static void main(String[] args) {
        //Upcasting
        Parent parent=new Child();//Runtime execution time
        //Child child2=new Parent(); //downcasting eplicite
        //Downcasting
        Child child=(Child) parent; //downcasting
        boolean cc= child instanceof Parent;

                child.imChildMethod();
                Parent pp=new Child();

    }
}
