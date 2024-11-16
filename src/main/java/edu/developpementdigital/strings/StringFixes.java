package edu.developpementdigital.strings;


import edu.developpementdigital.poo.Student;

public class StringFixes {
    /*1-Création String*/
    /*
2-Comparison  Référence et contenu
3-Lecture des Strings
4-Chercher dans String
5-Validation données String
6-Couper  String
7-Extraction  String
8-Concaténation  String*/
    public static void main(String[] args) {

        //1-Création String
        String lastName="Ali";
        String lastName2="Ali";
        String firstName="Samraoui";
        String mailAdress ="ali@outlook.ma";
        String adresse ="Hay Walaa ,45 Av Kolina , Morocco.";
        String telephonNumber ="+212 -67 85 69 32";
        String identityNumber="AB125865588";

        //2-Comparison  Référence et contenu
        //Reference
        Boolean isStringEqualsReference= (lastName == lastName2);
        System.out.println(isStringEqualsReference);
        //Contenu
        Boolean isStringEqualsContenuSameStringPool= lastName.equals(lastName2);
        System.out.println(isStringEqualsContenuSameStringPool);

        Boolean isStringEqualsContenuOtherStringPool= lastName.equals(firstName);
        System.out.println(isStringEqualsContenuOtherStringPool);
        // sans verifier majuscule ou minscule

        Boolean isStringEqualsContenuOthrString= lastName.equalsIgnoreCase("ali");
        System.out.println(" Sans verifier majuscule ou minscule "+ isStringEqualsContenuOthrString);

        //3-Lecture des Strings
        for (int i =0; i<lastName.length(); i++){
            System.out.println("Char At = "+lastName.charAt(i));

        }
        //Lecture simple
        System.out.println("Last name : "+lastName);

        //Chercher

        Boolean isStringContainsFalse= lastName.contains("lI");
        System.out.println("Test recherche String = "+isStringContainsFalse);
        Boolean isStringContainsTrue= lastName.contains("li");
        System.out.println("Test recherche String = "+isStringContainsTrue);

        //Validation données String
        //-adresse  termine par Morocco.

        Boolean validateAdress=adresse.endsWith("Morocco");
        System.out.println("Test validation adresse : "+validateAdress);

        //-telephone   commence par  +212
        Boolean validatePhone=telephonNumber.startsWith("+212");

        System.out.println("Test validation telephone : "+validatePhone);

        //6-Couper  String
        String[] taleauAdressSplited =adresse.split(",");
        System.out.println("Show splited adress table");
        for (int i=0; i<taleauAdressSplited.length; i++){
            System.out.println("Value of  case ["+i+"] = "+taleauAdressSplited[i]);
        }
        //7-Extraction  String
        //-extarct serveur messagerie  "ali@outlook.ma"
        /*the beginIndex starts from 0, whereas the endIndex starts from 1.
        beginIndex is inclusive, and endIndex is exclusive.*/
        String serveurMessagerieName=mailAdress.substring(4,11);
        System.out.println("Serveur Messagerie Name = "+serveurMessagerieName);

        //8-Concaténation  String
        String fullName="Last name : ".concat(lastName.concat("; First name : "+firstName));
        System.out.println("Full name : "+fullName);

        //Majuscule te minscule
        String majusculeLastName=lastName.toUpperCase();
        System.out.println("Test majuscule : "+majusculeLastName);
        String minusculeFullName=fullName.toLowerCase();
        System.out.println("Test minsucle : "+minusculeFullName);
    }

}
