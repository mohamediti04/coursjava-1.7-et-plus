package edu.developpementdigital.strings;

import java.util.regex.Pattern;

public class StringModifiables {
    /*1-Création String*/
    /*
2-Comparison  Référence et contenu
3-Lecture des Strings
4-Chercher dans String
4-Couper  String
5-Extraction  String
6-Concaténation  String*/
    public static void main(String[] args) {
        //1-Création String
        String ab="jj";
        StringBuffer sss=new StringBuffer("ddsd");
        StringBuilder lastName=new StringBuilder("Ali");
        StringBuffer lastName2=new StringBuffer("Ali");
        StringBuilder firstName=new StringBuilder("Samraoui");
        StringBuilder mailAdress =new StringBuilder("ali@outlook.ma");
        StringBuilder adresse =new StringBuilder("Hay Walaa ,45 Av Kolina , Morocco.");
        StringBuilder telephonNumber =new StringBuilder("+212 -67 85 69 32");
        StringBuilder identityNumber=new StringBuilder("AB125865588");

//2-Comparison  Référence et content
        System.out.println(lastName.toString().equals(lastName2.toString()));
        System.out.println(lastName.equals(lastName2));
        System.out.println(lastName.toString().compareTo(lastName2.toString()));


        //3-Lecture des Strings
        System.out.println(lastName);
        for (int i=0;i<lastName.length();i++){
            System.out.println(lastName.charAt(i));
        }
        //4-Chercher dans String
        System.out.println(mailAdress.indexOf("outlook")); //either -1 not found or other positif number
        System.out.println(mailAdress.indexOf("outlook")); //either -1 not found or other positif number
        //5-Couper  String
        String splitedString []=Pattern.compile(",").split(adresse);
        System.out.println();
        for (int i=0;i<splitedString.length;i++){
            System.out.println(splitedString[i]);
        }
        //5-Extraction  String
        String serveurMessagerieName=mailAdress.substring(4,11);
        System.out.println("Serveur Messagerie Name = "+serveurMessagerieName);
      // 6-Concaténation  String
        StringBuilder fullName=lastName.append(" "+firstName);
        System.out.println("Fullname : "+fullName);

        //Other operation
        StringBuilder s1 = new StringBuilder("Ali Samraoui");
        s1.reverse();
        System.out.println("S1 = " +s1);

        StringBuilder s2 = new StringBuilder("Ali Samraoui");
//index end exclusive
        s2.delete(0, 1);
        System.out.println("S2 delete = " +s2);

        StringBuilder s3 = new StringBuilder("Ali Samraoui");
        s3.deleteCharAt(s3.length() -1);
        System.out.println("S3 deleteCharAt = " +s3);

        StringBuilder s4 = new StringBuilder("ALI Samraoui");
        s4.replace(0, 2, "al");
        System.out.println("S4 replace = " +s4);

        StringBuilder s5 = new StringBuilder("AliSamraoui");
        s5.insert(3, "__");
        System.out.println("S5 insert String = " +s5);

        StringBuilder s6 = new StringBuilder("aligmail.com");
        s6.insert(3,"@");
        System.out.println("S6 insert char= " +s6);
    }

}
