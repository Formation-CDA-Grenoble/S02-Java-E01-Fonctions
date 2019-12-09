package app;

import app.Person;

public class App {
    public static void main(String[] args) throws Exception {
        // Nombre entier (codé sur 2 octets)
        short myShort = 100;
        // Nombre entier (codé sur 4 octets)
        int myInt = 2;
        // Nombre entier de double précision (code sur 8 octets)
        long myLong = 10;
        // Nombre à virgule (code sur 4 octets)
        float myFloat = 1;
        // Nombre à virgule de double précision (codé sur 8 octets)
        double myDouble = 3;
        // Chaîne de caractères
        String text = "Bonjour Grenoble!";
        // Booléen
        boolean myBool = true;
        // Caractère
        char myChar = 'A';

        // Crée un tableau initialisé avec des valeurs nulles de taille 3
        int[] myNullIntArray = new int[3];
        // Crée un tableau initialisé avec ses valeurs: [1, 2, 3]
        int[] myIntArray = {1, 2, 3};
        // Crée un tableau à deux dimensions de taille 3 sur 5
        int[][] myDoubleDimensionArray = new int[3][5];

        // Crée un objet de type "personne", en l'initialisant avec des propriétés
        // (voir le constructeur de la classe Person)
        Person myPerson = new Person("Josette", "Martin", 18);


        if (myPerson.isLegal()) {
            print(myPerson.fullName() + " est majeur(e)");
        } else {
            print(myPerson.fullName() + " est mineur(e)");
        }
    }
    
    // Cette méthode permet d'afficher une valeur dans la console
    // Elle existe en plusieurs versions, une pour chaque type de données
    // Il est donc possible d'avoir plusieurs méthodes avec le même nom,
    // dès leurs que les types de leurs paramètres sont différents
    static void print(String text) {
        System.out.println("Printing a String: ");
        System.out.println(text);
    }

    static void print(int number) {
        System.out.println("Printing an integer: ");
        System.out.println(number);
    }

    static void print(float number) {
        System.out.println("Printing a float: ");
        System.out.println(number);
    }

    // Renvoie le double d'un nombre
    static int doubleInt(int number) {
        return number * 2;
    }

    // Renvoie la somme de deux nombres
    static int addNumbers(int number1, int number2) {
        return number1 + number2;
    }

    // Renvoie la concaténation de deux chaînes de caractères
    static String concatenate(String string1, String string2) {
        return string1 + string2;
    }
}