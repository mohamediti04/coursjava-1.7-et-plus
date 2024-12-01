package edu.developpementdigital.heritage.cast;

import java.util.ArrayList;
import java.util.List;

public class TestInstanceOf {
    public static <T> void sort(List<T> collection) {
      /*  if (collection instanceof List<String>) {//must have a real type in runtime stage
            System.out.println("Error java: illegal generic type for instanceof ");
        }
*/

    }
    public static void main(String[] args) {
        Object person=new Person();
        Object o=null;
        List<Person> personList=new ArrayList<>();

        System.out.println("Which my parent : "+person.getClass());
        System.out.println(person instanceof Object);
        System.out.println(o instanceof Object); //check in runtime stage
        System.out.println(personList instanceof ArrayList);

    }
}
