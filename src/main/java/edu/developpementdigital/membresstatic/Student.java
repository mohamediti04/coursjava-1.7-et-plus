package edu.developpementdigital.membresstatic;

public class Student {

//test without static
public static int studentCount=0;
    //test without static
//public  static Integer studentCount=0;

    public Student (){


        System.out.println("Count of students number  for each creation of object Student using constructor");
                ++studentCount;
        System.out.println("Count of students number is  : "+studentCount);

    }
}
