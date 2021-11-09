package cc39005364.q2;

import java.util.Set;

public class Recette {
    private String nom;
    private Set<String> ingredients;
    private String description;

    public Recette(String nom, Set<String> ingredients, String description) {
        this.nom = nom;
        this.ingredients = ingredients;
        this.description = description;
    }

    public String nom() {
        return nom;
    }

    public Set<String> ingredients() {
        return ingredients;
    }

    public String description() {
        return description;
    }
}
