import java.util.List;
import java.util.Scanner;

public class newItalian {

    public static void italianDisplay() {
        Scanner scanner = new Scanner(System.in);

        // Display the list of Italian recipes
        System.out.println("Italian Recipes:");
        List<String> italianRecipes = newRecipe.cuisines.get("Italian");
        for (int i = 0; i < italianRecipes.size(); i++) {
            System.out.println((i + 1) + ". " + italianRecipes.get(i));
        }

        // Prompt the user to enter a number corresponding to a recipe
        System.out.println("Enter the number of the recipe you want to check:");
        int recipeNumber = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Check if the entered number is within the valid range
        if (recipeNumber < 1 || recipeNumber > italianRecipes.size()) {
            System.out.println("Invalid recipe number. Please try again.");
            return;
        }

        // Get the recipe corresponding to the entered number
        String selectedRecipe = italianRecipes.get(recipeNumber - 1);

        // Check if "Pasta" is the selected recipe
        if (selectedRecipe.equals("Pasta")) {
            System.out.println("You selected Pasta!");
            System.out.println("The Recipe is:\n" +
                    "▢ 1 lb spaghetti\n" +
                    "▢ 2 tbsp olive oil\n" +
                    "▢ 4 cloves garlic, minced\n" +
                    "▢ 1/4 tsp red pepper flakes\n" +
                    "▢ 1 can (28 oz) crushed tomatoes\n" +
                    "▢ 1/4 cup fresh basil, chopped\n" +
                    "▢ Salt and pepper to taste\n" +
                    "▢ Grated Parmesan cheese for serving");

        
        }

       
        // Check for "Pizza"
        if (selectedRecipe.equals("Pizza")) {
            System.out.println("You selected Pizza!");
            System.out.println("The Recipe is:\n" +
                    "▢ 2 1/2 cups all-purpose flour\n" +
                    "▢ 1 tsp sugar\n" +
                    "▢ 1 tsp salt\n" +
                    "▢ 1 tbsp olive oil\n" +
                    "▢ 1 cup warm water\n" +
                    "▢ 1 packet active dry yeast\n" +
                    "▢ 1/2 cup pizza sauce\n" +
                    "▢ 1 1/2 cups mozzarella cheese, shredded\n" +
                    "▢ Toppings of your choice (pepperoni, vegetables, etc.)");

          
        }
    }
}
