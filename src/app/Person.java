package app;

class Person {
    // Propriétés des objets de type "personne"
    private String firstName;
    private String lastName;
    private int age;
    private boolean isMale;

    // Constructeur: cette méthode est appelée automatiquement lorsqu'une nouvelle instance
    // de cette classe est créée (à l'aide du mot-clé new)
    // Nous pouvons définir ici les paramètres que nous souhaitons demander lors de la
    // création de l'objet
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.setAge(age);
    }

    // Renvoie le nom complet d'une personne
    public String fullName() {
        return firstName + " " + lastName;
    }

    // Détermine si une personne est majeure ou non
    public boolean isLegal() {
        if (this.age < 18) {
            return false;
        } else {
            return true;
        }
    }

    // Getter: méthode publique qui permet d'avoir accès indirectement à une propriété privée
    public int getAge() {
        return this.age;
    }

    // Setter: méthode publique qui permet de modifier indirectement une propriété privée
    // On a rajouté ici de la logique préalable pour valider l'âge de la personne avant
    // de modifier la propriété
    // Si l'âge est invalide, on produit une erreur
    public void setAge(int value) {
        if (value < 0) {
            throw new RuntimeException("Age must be positive");
        }
        this.age = value;
    }
}
