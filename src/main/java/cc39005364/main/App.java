package cc39005364.main;

import cc39005364.q2.CookingReference;
import cc39005364.q2.CookingReferenceRetriever;
import cc39005364.q2.Recette;
import cc39005364.q2.Recipe;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class App {
    public class Marmitor {
        //
        // éléments statiques pour simuler l'accès à un site Web
        //
        private static Recette r1 = new Recette("Salade de tomates", Set.of("tomate", "oignon", "vinaigrette"),
                "Couper deux tomates en rondelles." + //
                        "Emincer l'oignon. Répartir l'oignon sur les tomates." + //
                        "Verser la vinaigrette.");
        private static Recette r2 = new Recette("Steak frites", Set.of("viande de boeuf", "pomme de terre", "huile"),
                "Couper les pommes de terre en bâtonnets." + //
                        "Les faire frire dans l'huile." + //
                        "Faire cuire la viande dans une poëlle." + //
                        "Servir.");
        private static Recette r3 = new Recette("Tomates farcies", Set.of("tomate", "farce", "sel", "poivre"),
                "Saler et poivrer la farce." + //
                        "Farcir les tomates avec la farce." + //
                        "Faire cuire en cocotte.");
        private static Map<String, Recette> recettes = List.of(r1, r2, r3).stream()
                .collect(Collectors.toMap(Recette::nom, Function.identity()));

        //
        // recherche de recettes par ingrédient
        // (renvoie la liste des recettes qui contiennent un ingrédient donné)
        //
        public List<Recette> rechercher(String ingredient) {
            return recettes.values().stream().filter(r -> r.ingredients().contains(ingredient)).toList();
        }

        public class GrossBouf {
            //
            // éléments statiques pour simuler l'accès à un site Web
            //
            private static Recipe r1 = new Recipe("Houmous", Map.of("pois-chiche", 200, "sesame", 10, "citron", 10),
                    List.of("Mixer les pois-chiche.", "Ajouter le sesame et le citron."));
            private static Recipe r2 = new Recipe("Ketchup maison",
                    Map.of("tomate", 100, "vinaigre", 10, "sucre", 10),
                    List.of("Mettre tous les ingrédients dans un bol et mixer."));
            private static Map<String, Recipe> references = List.of(r1, r2).stream()
                    .collect(Collectors.toMap(Recipe::identifier, Function.identity()));

            //
            // recherche de references par ingrédient
            // (renvoie la liste des references qui contiennent un ingrédient donné)
            //
           /* public List<Recipe> find(String ingredient) {
                return references.values().stream().filter(r -> r.ingredients().keySet()
            }*/
    public static void main(String[] args) {
        CookingReferenceRetriever retriever =
        Map<String, CookingReference> = retriever.retrieveFromIngredient("tomate");
    }
}
