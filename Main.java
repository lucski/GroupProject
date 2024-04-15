import java.util.*;

public class Main {
    // Define cuisines and corresponding recipes
    static Map<String, List<String>> cuisines = new HashMap<>();

    static {
        cuisines.put("Japanese", Arrays.asList("Sushi", "Ramen", "Tempura", "Teriyaki"));
        cuisines.put("Chinese", Arrays.asList("Sweet and Sour Chicken", "Fried Rice", "Dumplings", "Kung Pao Chicken"));
        cuisines.put("American", Arrays.asList("Burgers", "Fried Chicken", "Mac and Cheese", "BBQ Ribs"));
        cuisines.put("Italian", Arrays.asList("Pasta", "Pizza", "Tiramisu", "Risotto"));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to choose a cuisine
        System.out.println("What culture? (pick a cuisine: Japanese, Chinese, American, Italian)");
        System.out.println("Available cuisines: " + String.join(", ", cuisines.keySet()));
        String chosenCuisine = scanner.nextLine().trim();

        // Validate the chosen cuisine
        if (!cuisines.containsKey(chosenCuisine)) {
            System.out.println("Invalid choice. Please try again.");
            return;
        }

        // Display recipes for the chosen cuisine
        List<String> recipes = cuisines.get(chosenCuisine);
        System.out.println("Recipes for " + chosenCuisine + ": " + String.join(", ", recipes));

        // Prompt user to choose a recipe or ask for a random one
        System.out.println("Enter the name of a recipe from the list, or type 'random' for a random recipe:");
        String userChoice = scanner.nextLine().trim();

        String selectedRecipe = null;

        if (userChoice.equalsIgnoreCase("random")) {
            // Select a random recipe from the list
            Random random = new Random();
            selectedRecipe = recipes.get(random.nextInt(recipes.size()));
        } else {
            // Check if the user choice matches a recipe
            if (recipes.contains(userChoice)) {
                selectedRecipe = userChoice;
            } else {
                System.out.println("Invalid recipe choice. Please try again.");
                return;
            }
        }

        // Output the selected recipe
        System.out.println("You selected: " + selectedRecipe);
    }
}
