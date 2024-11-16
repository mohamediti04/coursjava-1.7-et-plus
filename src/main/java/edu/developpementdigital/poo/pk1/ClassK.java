package edu.developpementdigital.poo.pk1;

import edu.developpementdigital.poo.pk2.ClassB;

public class ClassK {

   public  ClassK(){
  ClassB classB=new ClassB();
       System.out.println("Use of public attribute of other package edu.developpementdigital.poo.pk2.ClassB; ");
       classB.studentNote=15.50;
   }

}
