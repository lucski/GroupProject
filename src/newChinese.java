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
            System.out.println("                     _\n" +
                    "                                   .-.  .--''` )\n" +
                    "                                _ |  |/`   .-'`\n" +
                    "                               ( `\\      /`\n" +
                    "                               _)   _.  -'._\n" +
                    "                             /`  .'     .-.-;\n" +
                    "                             `).'      /  \\  \\\n" +
                    "                            (`,        \\_o/_o/__\n" +
                    "                             /           .-''`  ``'-.\n" +
                    "                             {         /` ,___.--''`\n" +
                    "                             {   ;     '-. \\ \\\n" +
                    "           _   _             {   |'-....-`'.\\_\\\n" +
                    "          / './ '.           \\   \\          `\"`\n" +
                    "       _  \\   \\  |            \\   \\\n" +
                    "      ( '-.J     \\_..----.._ __)   `\\--..__\n" +
                    "     .-`                    `        `\\    ''--...--.\n" +
                    "    (_,.--\"\"`/`         .-             `\\       .__ _)\n" +
                    "            |          (                 }    .__ _)\n" +
                    "            \\_,         '.               }_  - _.'\n" +
                    "               \\_,         '.            } `'--'\n" +
                    "                  '._.     ,_)          /\n" +
                    "                     |    /           .'\n" +
                    "                      \\   |    _   .-'\n" +
                    "                       \\__/;--.||-'\n" +
                    "                        _||   _||__   __\n" +
                    "                 _ __.-` \"`)(` `\"  ```._)\n" +
                    "           jgs  (_`,-   ,-'  `''-.   '-._)\n" +
                    "               (  (    /          '.__.'\n" +
                    "                `\"`'--'");

            // check if "Fried Rice" is selected
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
                System.out.println("⠀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                        "⠀⠉⠛⠛⠓⠶⠶⠦⠤⢤⣄⣀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                        "⠀⣤⣤⣤⣤⣄⣀⣀⣀⣀⡀⠀⠈⠉⠉⠙⠛⠛⠶⠶⠶⣤⡄⠀⠀⠀⠀⠀⠀⠀\n" +
                        "⠀⠀⠀⠀⠀⠈⠉⠉⠉⠉⠙⠛⠛⠛⠛⠳⠶⠶⠶⠶⣤⣤⡄⠀⠀⠀⠀⠀⠀⠀\n" +
                        "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                        "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣐⣶⣿⣦⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                        "⠀⠀⠀⠀⠀⢠⣰⣤⣶⣿⣛⢻⣿⣿⣿⣿⣿⣦⣼⣤⣆⣀⠀⡀⠀⠀⠀⠀⠀⠀\n" +
                        "⠀⠀⠀⠀⠀⣨⣿⣿⢿⣿⣿⣿⣿⣿⣥⣼⣿⢿⣿⣿⣟⠻⣿⣯⣤⡄⠀⠀⠀⠀\n" +
                        "⠀⠀⠀⠀⠀⠛⠛⠒⠒⠛⠛⠛⠛⠛⠛⠛⠛⠒⠚⠛⠛⠛⠛⠛⠛⠃⠀⠀⠀⠀\n" +
                        "⠀⠀⢰⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⡆⠀⠀\n" +
                        "⠀⠀⠈⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠀⠀⠀\n" +
                        "⠀⠀⠀⠈⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠁⠀⠀⠀\n" +
                        "⠀⠀⠀⠀⠀⠙⠻⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠟⠉⠀⠀⠀⠀⠀\n" +
                        "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢉⣉⣉⣉⣉⣉⣉⡉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                        "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠉⠉⠉⠉⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
                // check if "Dumplings" is selected
                if (selectedRecipe.equals("Dumplings")) {
                    System.out.println("You selected Dumplings!");
                    // Print Dumplings recipe
                    System.out.println("The Recipe is:\n" +
                            "▢ 1 lb ground pork\n" +
                            "▢ 2 cups finely chopped napa cabbage\n" +
                            "▢ 3 green onions, finely chopped\n" +
                            "▢ 2 cloves garlic, minced\n" +
                            "▢ 1 tbsp soy sauce\n" +
                            "▢ 1 tbsp sesame oil\n" +
                            "▢ 1 tsp grated ginger\n" +
                            "▢ 1/4 tsp salt\n" +
                            "▢ 1/4 tsp black pepper\n" +
                            "▢ Dumpling wrappers\n" +
                            "▢ Dipping sauce (e.g., soy sauce, vinegar, chili oil)\n");
                    System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⣠⣶⣿⣿⣿⣶⠶⣶⣶⣶⣤⣤⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⣿⣧⣄⣉⠉⣁⣄⠙⠛⠛⠋⠀⣿⣿⣿⣶⣤⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠸⣿⣿⣿⣿⣿⣿⣿⣶⣶⣿⣦⣈⣉⣁⠀⣿⣿⣷⣄⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣆⡙⠛⠋⢻⣷⡀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⢿⣿⣿⡄⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⣄⠉⢙⣿⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⢻⣯⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⣾⣿⡇⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠈⢿⣦⠙⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣄⠙⠻⣿⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠻⣷⣄⠙⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠁⣴⣿⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠈⠻⣷⣄⠈⠻⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡄⠻⢿⡇⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠻⢷⣦⣄⠉⠛⠿⢿⣿⣿⣿⣿⣿⣿⠃⣰⣾⡇⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠻⢿⣷⣦⣤⣬⣭⣿⣿⣿⣿⡀⢻⣿⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠙⠷⠾⠋⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");

                    // check if "Kung Pao Chicken" is selected
                    if (selectedRecipe.equals("Kung Pao Chicken")) {
                        System.out.println("You selected Kung Pao Chicken!");
                        // Print Kung Pao Chicken recipe
                        System.out.println("The Recipe is:\n" +
                                "▢ 1 lb boneless chicken thighs, cut into bite-sized pieces\n" +
                                "▢ 2 tbsp soy sauce\n" +
                                "▢ 1 tbsp hoisin sauce\n" +
                                "▢ 1 tbsp rice vinegar\n" +
                                "▢ 1 tbsp cornstarch\n" +
                                "▢ 2 tbsp vegetable oil\n" +
                                "▢ 3 cloves garlic, minced\n" +
                                "▢ 1 inch ginger, minced\n" +
                                "▢ 1/2 cup peanuts\n" +
                                "▢ 2-3 dried red chilies\n" +
                                "▢ 3 green onions, chopped\n" +
                                "▢ Cooked rice for serving\n");
                        System.out.println("⠀⢀⢬⡷⠛⡂⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                                "⠀⡎⡳⣐⠊⢥⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣀⣀⠀⠀⠀⠀⠀⠀\n" +
                                "⠰⢻⠀⠩⠗⡄⠙⢆⠀⠀⠀⠀⠀⢀⡴⠚⠉⠀⠀⠀⠈⠑⠢⡀⠀⠀\n" +
                                "⠀⠰⣄⡘⠚⢀⠀⢸⠀⠀⠀⠀⢠⠏⠀⠀⠀⣀⠔⠒⠀⠒⢤⡈⢆⠀\n" +
                                "⢠⠊⠀⠀⠀⠀⡆⢸⠀⠀⠀⠀⡼⠀⠀⠀⠜⢋⡉⠀⢉⠢⡀⠹⡜⡄\n" +
                                "⡎⠀⠀⠀⠀⢠⠃⠘⣆⠀⠀⠀⡇⠀⠀⠀⠀⢉⣀⣉⡠⡙⢎⡆⢣⡇\n" +
                                "⡁⠀⠀⠀⡔⠁⠀⠀⠈⠉⠑⠒⠒⠤⡀⢀⡀⢬⢅⢂⠉⢧⠈⡷⢸⠃\n" +
                                "⡇⠀⠀⡌⡄⠀⠀⠀⠀⠀⠈⠄⠀⠀⠐⡄⠫⠫⡆⢻⠀⠈⠀⠁⠈⠀\n" +
                                "⠹⣄⠀⠀⢱⠀⠀⠀⠀⠀⠀⠈⠢⡀⠀⢸⢻⠀⠇⠀⠀⠀⠀⠀⠀⠀\n" +
                                "⠀⠈⠳⣄⢄⠳⡀⠀⠀⠀⠀⠀⠀⠈⠲⣤⡁⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                                "⠀⠀⠀⠈⢇⠑⢎⠑⠒⠄⠤⠤⠤⡤⠒⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                                "⠀⠀⠀⠀⠈⡆⠈⣆⠀⢸⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                                "⠀⠀⠀⠀⠀⠘⡆⠘⢒⠚⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                                "⠀⠀⢀⣠⣤⣤⢇⠆⢸⢀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                                "⠀⠀⠈⠀⠠⠒⠛⢻⡧⠎⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");

                    }
                }
            }
        }
    }
}


