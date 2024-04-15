import java.util.*;

public class Main {

    // Define cuisines and corresponding recipes
    static Map<String, List<String>> cuisines = new HashMap<>();

    static {
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display meal options and other cuisines
        System.out.println("Please choose one of the following options:");
        System.out.println("1. Breakfast");
        System.out.println("2. Brunch");
        System.out.println("3. Lunch");
        System.out.println("4. Dinner");
        System.out.println("5. Japanese");
        System.out.println("6. Chinese");
        System.out.println("7. American");
        System.out.println("8. Italian");
        System.out.println("Enter your choice (1-8):");

        // Get user input
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character after nextInt()

        // Map the user's choice to the corresponding cuisine
        String[] cuisineOptions = {
                "Breakfast",
                "Brunch",
                "Lunch",
                "Dinner",
                "Japanese",
                "Chinese",
                "American",
                "Italian"
        };

        // Validate choice and select the cuisine
        if (choice < 1 || choice > 8) {
            System.out.println("Invalid choice. Please try again.");
            return;
        }

        String chosenCuisine = cuisineOptions[choice - 1];

        // Display recipes for the chosen cuisine
        List<String> recipes = cuisines.get(chosenCuisine);
        System.out.println("Recipes for " + chosenCuisine + ": " + String.join(", ", recipes));

        // Prompt user to choose a recipe or ask for one at random
        System.out.println("Enter the number of the recipe (1-" + recipes.size() + ") to select a recipe, or type 'random' for a random recipe:");
        String userChoice = scanner.nextLine().trim();

        String selectedRecipe = null;

        if (userChoice.equalsIgnoreCase("random")) {
            // Choose a random recipe from the list
            Random random = new Random();
            selectedRecipe = recipes.get(random.nextInt(recipes.size()));
        } else {
            // Validate user input and choose the selected recipe
            try {
                int recipeIndex = Integer.parseInt(userChoice) - 1;
                if (recipeIndex >= 0 && recipeIndex < recipes.size()) {
                    selectedRecipe = recipes.get(recipeIndex);
                } else {
                    System.out.println("Invalid recipe choice. Please try again.");
                    return;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number or 'random'.");
                return;
            }
        }

        // Output the selected recipe
        System.out.println("You selected: " + selectedRecipe);
    }
}
