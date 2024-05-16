import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class newRecipe {

   public static Map<String, List<String>> cuisines = new HashMap<>();

    public static void newCuisine()  {
        // Add breakfast, brunch, lunch, and dinner options with corresponding recipes
        cuisines.put("Breakfast", Arrays.asList("Pancakes", "Omelette", "Smoothie", "French Toast"));
        cuisines.put("Brunch", Arrays.asList("Avocado Toast", "Quiche", "Eggs Benedict", "Fruit Salad"));
        cuisines.put("Lunch", Arrays.asList("Sandwich", "Salad", "Soup", "Pasta"));
        cuisines.put("Dinner", Arrays.asList("Steak", "Salmon", "Stir Fry", "Pizza"));

        // Add other cuisines and corresponding recipes
        cuisines.put("Japanese", Arrays.asList("Sushi", "Ramen", "Tempura", "Teriyaki"));
        cuisines.put("Chinese", Arrays.asList("General Tso's Chicken", "Fried Rice", "Dumplings", "Kung Pao Chicken"));
        cuisines.put("American", Arrays.asList("Burgers", "Fried Chicken", "Mac and Cheese", "BBQ Ribs"));
        cuisines.put("Italian", Arrays.asList("Pasta", "Pizza", "Tiramisu", "Risotto"));
    }
    public static String getRecipe(String cuisine, int index) {
        List<String> recipes = cuisines.get(cuisine);
        if (recipes != null && index >= 0 && index < recipes.size()) {
            return recipes.get(index);
        } else {
            return "Invalid selection";
        }
    }
}
