import java.util.List;
import java.util.Scanner;

public class newChinese {

    public static void chineseDisplay() {
        Scanner scanner = new Scanner(System.in);

        // Display the list of Chinese recipes
        System.out.println("Chinese Recipes:");
        List<String> chineseRecipes = newRecipe.cuisines.get("Chinese");
        for (int i = 0; i < chineseRecipes.size(); i++) {
            System.out.println((i + 1) + ". " + chineseRecipes.get(i));
        }

        // Prompt the user to enter a number corresponding to a recipe
        System.out.println("Enter the number of the recipe you want to check:");
        int recipeNumber = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Check if the entered number is within the valid range
        if (recipeNumber < 1 || recipeNumber > chineseRecipes.size()) {
            System.out.println("Invalid recipe number. Please try again.");
            return;
        }

        // Get the recipe corresponding to the entered number
        String selectedRecipe = chineseRecipes.get(recipeNumber - 1);

        // Check if "General Tso's Chicken" is the selected recipe
        if (selectedRecipe.equals("General Tso's Chicken")) {
            System.out.println("You selected General Tso's Chicken!");
            System.out.println("The Recipe is:\n" +
                    "▢ 1 lb chicken thighs, boneless and skinless\n" +
                    "▢ 1/4 cup soy sauce\n" +
                    "▢ 1/4 cup rice vinegar\n" +
                    "▢ 1/4 cup hoisin sauce\n" +
                    "▢ 1/4 cup cornstarch\n" +
                    "▢ 1/4 cup chicken broth\n" +
                    "▢ 1/4 cup sugar\n" +
                    "▢ 1 tsp ginger, grated\n" +
                    "▢ 1 tsp garlic, minced\n" +
                    "▢ 1/4 tsp red pepper flakes\n" +
                    "▢ Vegetable oil for frying\n" +
                    "▢ Green onions and sesame seeds for garnish");

        }

        // check if "Fried Rice"
        if (selectedRecipe.equals("Fried Rice")) {
            System.out.println("You selected Fried Rice!");
            System.out.println("The Recipe is:\n" +
                    "▢ 3 cups cooked rice\n" +
                    "▢ 2 tbsp soy sauce\n" +
                    "▢ 1 tbsp oyster sauce\n" +
                    "▢ 2 eggs\n" +
                    "▢ 1/2 cup peas\n" +
                    "▢ 1/2 cup carrots, diced\n" +
                    "▢ 1/2 cup green onions, sliced\n" +
                    "▢ 2 tbsp vegetable oil\n" +
                    "▢ Salt and pepper to taste");
        }
    }
}


