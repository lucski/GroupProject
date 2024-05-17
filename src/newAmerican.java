import java.util.List;
import java.util.Scanner;

public class newAmerican {

    public static void americanDisplay() {
        Scanner scanner = new Scanner(System.in);

        // Display the list of American recipes
        System.out.println("American Recipes:");
        List<String> americanRecipes = newRecipe.cuisines.get("American");
        for (int i = 0; i < americanRecipes.size(); i++) {
            System.out.println((i + 1) + ". " + americanRecipes.get(i));
        }

        // Prompt the user to enter a number corresponding to a recipe
        System.out.println("Enter the number of the recipe you want to check:");
        int recipeNumber = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Check if the entered number is within the valid range
        if (recipeNumber < 1 || recipeNumber > americanRecipes.size()) {
            System.out.println("Invalid recipe number. Please try again.");
            return;
        }

        // Get the recipe corresponding to the entered number
        String selectedRecipe = americanRecipes.get(recipeNumber - 1);

        // Check if "Burgers" is the selected recipe
        if (selectedRecipe.equals("Burgers")) {
            System.out.println("You selected Burgers!");
            System.out.println("The Recipe is:\n" +
                    "▢ 1 lb ground beef\n" +
                    "▢ 1/2 tsp salt\n" +
                    "▢ 1/2 tsp black pepper\n" +
                    "▢ 1/2 tsp garlic powder\n" +
                    "▢ 1/2 tsp onion powder\n" +
                    "▢ 4 hamburger buns\n" +
                    "▢ Optional toppings: lettuce, tomato, cheese, pickles, onions, ketchup, mustard");
            System.out.println("\\\\|/          (__)    \\n\" +\n" +
                    "                            \"     `\\\\------(oo)\\n\" +\n" +
                    "                            \"       ||    (__)\\n\" +\n" +
                    "                            \"       ||w--||     \\\\|/\\n\" +\n" +
                    "                            \"   \\\\|/");


        }


        // Check if  "Fried Chicken" is the selected recipe
        if (selectedRecipe.equals("Fried Chicken")) {
            System.out.println("You selected Fried Chicken!");
            System.out.println("The Recipe is:\n" +
                    "▢ 1 whole chicken, cut into pieces\n" +
                    "▢ 2 cups buttermilk\n" +
                    "▢ 2 cups all-purpose flour\n" +
                    "▢ 1 tsp paprika\n" +
                    "▢ 1 tsp garlic powder\n" +
                    "▢ 1 tsp salt\n" +
                    "▢ 1/2 tsp black pepper\n" +
                    "▢ Vegetable oil for frying");
            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠲⠾⢶⣦⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣶⣾⣿⣹⣇⡶⠆\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⣿⣿⣿⣿⣿⡇⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣼⣿⣿⣿⣿⡇⡇⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣤⡴⣿⣿⣿⣿⣿⣿⡗⡁⠀⠀\n" +
                    "⢀⣾⣿⠷⣶⣄⡀⠀⠀⠀⠀⠀⠀⠀⣀⣀⣴⣿⣿⣷⣽⣿⣿⣿⣿⣟⣠⣧⠀⠀\n" +
                    "⢣⣀⣿⣿⣾⣝⢷⣄⠀⠀⢀⣤⣶⣿⣿⣿⣿⣿⣿⣿⣿⣷⣞⡻⡿⣿⣿⣿⠀⠀\n" +
                    "⠘⢖⣈⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠋⣱⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣷⣵⡽⠀⠀\n" +
                    "⠀⠀⠉⠻⢿⣿⣿⣿⣿⣿⣿⣿⢖⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿⢿⣿⣿⣿⠇⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⢻⣿⣿⣿⣿⢿⣷⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢃⣼⣿⣿⡟⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠹⣿⣯⣵⣿⠿⠋⠿⠿⠿⠿⣿⣟⣛⣭⣵⣿⣿⣿⠏⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠈⠛⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠛⠉⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⣿⣿⣿⣿⣿⣿⣿⣿⠛⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠙⠛⣿⠋⠁⠉⢳⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⢧⠀⠀⠔⠻⠿⡶⠤⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⣷⣤⠤⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠙⠏⠓⠀⠀⠀⠀⠀⠀⠀⠀⠀");

            if (selectedRecipe.equals("Mac and Cheese")) {
                System.out.println("You selected Mac and Cheese!");
                // Print Mac and Cheese recipe and ASCII art
                System.out.println("The Recipe is:\n" +
                        "▢ 8 oz elbow macaroni\n" +
                        "▢ 2 cups shredded cheddar cheese\n" +
                        "▢ 1/2 cup milk\n" +
                        "▢ 2 tbsp butter\n" +
                        "▢ Salt and pepper to taste\n" +
                        "Optional: breadcrumbs for topping\n");
                System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                        "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⡞⠉⠛⠶⢤⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                        "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡴⠋⢰⠞⠛⢷⠀⠈⠙⠳⠦⣄⣀⠀⠀⠀⠀\n" +
                        "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⠞⠁⠀⠘⠒⠒⠋⠀⣠⣤⡀⠀⠀⠉⠛⢶⣤⣀\n" +
                        "⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡼⠋⢀⡴⠖⠶⢦⠀⠀⠀⢧⣬⠇⣀⣠⠴⠞⠋⠁⡏\n" +
                        "⠀⠀⠀⠀⠀⠀⠀⠀⣠⠟⠀⠀⠘⠧⣤⣀⡼⠀⢀⣀⡤⠶⢛⣩⣤⣀⠀⢠⡞⠋\n" +
                        "⠀⠀⠀⠀⠀⠀⣠⠞⣁⣀⠀⠀⠀⠀⢀⣠⡴⠖⠋⠁⠀⠀⣿⠁⠀⣹⠀⠈⢷⡄\n" +
                        "⠀⠀⠀⠀⣠⠞⠁⠀⠷⠿⣀⣤⠴⠚⠉⠁⠀⠀⠀⠀⠀⠀⠈⠓⠒⠃⠀⠀⠀⡇\n" +
                        "⠀⠀⣠⠞⣁⣠⡤⠶⠚⠛⠉⠀⠀⠀⣀⡀⠀⠀⠀⠀⢀⡤⠶⠶⠦⣄⠀⠀⠀⡇\n" +
                        "⠀⡾⠛⠋⢉⣤⢤⣀⠀⠀⠀⠀⣰⠞⠉⠙⠳⡄⠀⠀⡟⠀⠀⠀⠀⢸⡆⠀⠀⡇\n" +
                        "⠀⡇⠀⢰⡏⠀⠀⢹⡆⠀⠀⠀⡇⠀⠀⠀⠀⣿⠀⠀⠳⣄⡀⠀⢀⣸⠇⠀⠀⡇\n" +
                        "⠀⡇⠀⠀⢷⣤⣤⠞⠁⠀⠀⠀⢷⣀⣀⣠⡴⠃⠀⠀⠀⠈⠉⠉⠉⠁⣀⣠⠴⠇\n" +
                        "⠀⠻⣆⠀⠀⠀⠀⢀⣀⣤⣀⠀⠀⠉⠉⠁⠀⠀⠀⠀⠀⢀⣠⡤⠖⠛⠉⠀⠀⠀\n" +
                        "⠀⠀⡿⠀⠀⠀⢰⡏⠀⠀⢹⡆⠀⠀⠀⠀⠀⣀⣤⠶⠚⠉⠁⠀⠀⠀⠀⠀⠀⠀\n" +
                        "⢰⠞⠁⠀⠀⠀⠀⢷⣄⣤⠞⠁⣀⣠⠴⠚⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                        "⢸⡆⠀⠀⠀⠀⠀⠀⣀⡤⠖⠛⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                        "⢸⡇⠀⢀⣠⡴⠞⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                        "⠀⠟⠛⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");

                if (selectedRecipe.equals("BBQ Ribs")) {
                    System.out.println("You selected BBQ Ribs!");
                    // Print BBQ Ribs recipe and ASCII art
                    System.out.println("The Recipe is:\n" +
                            "▢ 3 lbs pork ribs\n" +
                            "▢ 1 cup BBQ sauce\n" +
                            "▢ 2 tbsp brown sugar\n" +
                            "▢ 1 tbsp paprika\n" +
                            "▢ 1 tbsp garlic powder\n" +
                            "▢ 1 tbsp onion powder\n" +
                            "▢ Salt and pepper to taste\n");
                    System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⡄⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⠊⠜⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⠔⠁⠀⢸⡄⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⡇⠑⠂⠤⠠⠤⠤⣀⠀⠀⠀⠀⠀⠎⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⢃⠀⢸⢄⣀⠀⠀⠀⠘⡄⢀⣀⡄⢧⣀⣀⠀⠀⠀⡧⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⢇⠘⡆⠀⠉⠑⡄⠀⠈⠁⠀⠀⠀⠀⠀⠙⠳⢴⡃⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⢸⠀⠹⡄⠀⠀⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⡄⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠣⡀⠙⠲⢤⠏⠀⠀⠀⠀⢀⠀⠀⣀⢀⠌⢠⣤⡞⡆⠀⠀⠀⠀\n" +
                            "⢀⠀⣠⠄⠀⠀⠀⢈⡛⠀⠀⠀⠀⠀⠀⠀⢄⠀⣿⡿⠈⠀⣘⠿⠃⢱⠀⠀⠀⠀\n" +
                            "⠀⠁⢛⠁⢀⠴⠊⠉⢡⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠁⠀⠀⠀⠀⠀⠘⡶⡄⠠⠀\n" +
                            "⠀⠀⠀⡵⠃⠀⠀⠀⠈⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⢄⠇⠚⡸\n" +
                            "⠀⠀⢸⠁⠀⠀⠀⠀⠀⠘⢆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢈⠝⠉⠀\n" +
                            "⠀⠀⠸⡄⠀⠀⠀⠀⠀⠀⠀⠙⠢⢄⡀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡠⠖⠁⠀⠀⠀\n" +
                            "⠀⠀⠀⠙⢄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠙⠓⢒⠖⠒⠉⠉⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⢸⡇⢠⢤⣀⡀⠀⠀⠀⠀⡄⠀⢰⠚⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⢸⡇⢸⠀⡞⠀⠈⠉⠉⠀⡇⠀⡎⠀⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠈⠃⠘⠙⠁⠀⠀⠀⠀⠀⠃⡄⠋⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
                }
            }
        }
    }
}
