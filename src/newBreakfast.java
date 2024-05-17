import java.util.List;
import java.util.Scanner;

public class newBreakfast {

    public static void breakfastDisplay() {
        Scanner scanner = new Scanner(System.in);

        // Display the list of breakfast recipes
        System.out.println("Breakfast Recipes:");
        List<String> breakfastRecipes = newRecipe.cuisines.get("Breakfast");
        for (int i = 0; i < breakfastRecipes.size(); i++) {
            System.out.println((i + 1) + ". " + breakfastRecipes.get(i));
        }

        // Prompt the user to enter a number corresponding to a recipe
        System.out.println("Enter the number of the recipe you want to check:");
        int recipeNumber = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Check if the entered number is within the valid range
        if (recipeNumber < 1 || recipeNumber > breakfastRecipes.size()) {
            System.out.println("Invalid recipe number. Please try again.");
            return;
        }

        // Get the recipe corresponding to the entered number
        String selectedRecipe = breakfastRecipes.get(recipeNumber - 1);

        // Check if "Pancakes" is the selected recipe
        if (selectedRecipe.equals("Pancake")) {
            System.out.println("You selected Pancake!");
            System.out.println("The Recipe is:\n" + "▢ 2 cups all purpose | plain flour, (290 g | 10 oz)\n" +
                    "▢ 1/4 cup granulated sugar or sweetener, (60g | 2 oz)\n" +
                    "▢ 4 teaspoons baking powder\n" +
                    "▢ 1/4 teaspoon baking soda\n" +
                    "▢ 1/2 teaspoon salt\n" +
                    "▢ 1 3/4 cups milk, (440ml)\n" +
                    "▢ 1/4 cup butter, (60g | 2 oz)\n" +
                    "▢ 2 teaspoons pure vanilla extract\n" +
                    "▢ 1 large egg");
            System.out.println("/Users/kameronzurzolo/Downloads/GroupProject/src/Pancake Art");
        }
        //this will help display smoothie recipe
        if (selectedRecipe.equals("Smoothie")) {
            System.out.println("You selected Smoothie!");
            System.out.println("The Recipe is:\n" + "2 cups frozen strawberries\n" +
                    "1 fresh banana, peeled\n" +
                    "1 cup milk (I used almond milk)\n" +
                    "1 cup ice");
            System.out.println("      ████                            \n" +
                    "    ██  ▒▒██                          \n" +
                    "      ██  ▒▒██                        \n" +
                    "      ░░██░░▓▓██                      \n" +
                    "          ██  ▓▓██                    \n" +
                    "            ██  ██                    \n" +
                    "            ██▒▒██                    \n" +
                    "            ██  ██                    \n" +
                    "          ████▒▒██████████████        \n" +
                    "      ████  ██████            ██      \n" +
                    "    ██░░░░░░░░░░░░░░░░░░░░░░░░░░██    \n" +
                    "██████████████████████████████████████\n" +
                    "██░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██\n" +
                    "██████████████████████████████████████\n" +
                    "  ██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██  \n" +
                    "  ██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██  \n" +
                    "  ████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒████  \n" +
                    "  ░░██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██░░  \n" +
                    "    ██▒▒▒▒▒▒▒▒▒▒  ▒▒  ▒▒▒▒▒▒▒▒▒▒██    \n" +
                    "    ██▒▒▒▒▒▒▒▒  ▒▒  ▒▒  ▒▒▒▒▒▒▒▒██    \n" +
                    "      ██▒▒▒▒▒▒  ▒▒  ▒▒  ▒▒▒▒▒▒██      \n" +
                    "      ██▒▒▒▒▒▒  ▒▒  ▒▒  ▒▒▒▒▒▒██      \n" +
                    "      ██▒▒▒▒▒▒  ▒▒▒▒▒▒  ▒▒▒▒▒▒██      \n" +
                    "      ██▒▒▒▒▒▒  ▒▒▒▒▒▒  ▒▒▒▒▒▒██      \n" +
                    "      ██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██      \n" +
                    "      ░░██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██░░      \n" +
                    "        ██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██        \n" +
                    "        ██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██        \n" +
                    "        ██████████████████████        \n");
        }
        //this will help display Omelette recipe
        if (selectedRecipe.equals("Omelette")) {
            System.out.println("You selected Omelette!");
            System.out.println("The Recipe is:\n" + "▢ ½ Tablespoon salted butter\n" +
                    "▢ 3 large eggs\n" +
                    "▢ Pinch salt and pepper\n" +
                    "▢ ¼ cup sharp cheddar cheese shredded\n" +
                    "Fillings:\n" +
                    "Vegetables\n" +
                    "▢ 1 teaspoon olive oil\n" +
                    "▢ 1 teaspoon minced garlic\n" +
                    "▢ 1 cup vegetables diced small (bell pepper, zucchini, onion, etc.)\n" +
                    "▢ Salt and pepper to taste\n" +
                    "Onion bacon, garlic:\n" +
                    "▢ 1 teaspoon minced garlic\n" +
                    "▢ 2 Tablespoon minced onion\n" +
                    "▢ 2 slices bacon diced");
        }
        //this will help display french toast recipe
        if (selectedRecipe.equals("French Toast")) {
            System.out.println("You selected French Toast!");
            System.out.println("The Recipe is:\n" + "▢ 4 large eggs\n" +
                    "▢ 2/3 cup milk\n" +
                    "▢ 1/4 cup all-purpose flour\n" +
                    "▢ 1/4 cup granulated sugar\n" +
                    "▢ 1/4 teaspoon salt\n" +
                    "▢ 1 teaspoon ground cinnamon\n" +
                    "▢ 1 teaspoon vanilla extract\n" +
                    "▢ 8 thick slices bread");
        }
    }
}

