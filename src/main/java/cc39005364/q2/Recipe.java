package cc39005364.q2;

import java.util.List;
import java.util.Map;

public class Recipe {
    private String identifier;
    private Map<String, Integer> ingredients;
    private List<String> steps;

    public Recipe(String identifier, Map<String, Integer> ingredients, List<String> steps) {
        this.identifier = identifier;
        this.ingredients = ingredients;
        this.steps = steps;
    }

    public String identifier() {
        return identifier;
    }

    public Map<String, Integer> ingredients() {
        return ingredients;
    }

    public List<String> steps() {
        return steps;
    }
}
