import java.util.List;
import java.util.Scanner;

public class newBrunch {

    public static void brunchDisplay() {
        Scanner scanner = new Scanner(System.in);

        // Display the list of lunch recipes
        System.out.println("Brunch Recipes:");
        List<String> lunchRecipes = newRecipe.cuisines.get("Brunch");
        for (int i = 0; i < lunchRecipes.size(); i++) {
            System.out.println((i + 1) + ". " + lunchRecipes.get(i));
        }

        // Prompt the user to enter a number corresponding to a recipe
        System.out.println("Enter the number of the recipe you want to check:");
        int recipeNumber = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Check if the entered number is within the valid range
        if (recipeNumber < 1 || recipeNumber > lunchRecipes.size()) {
            System.out.println("Invalid recipe number. Please try again.");
            return;
        }

        // Get the recipe corresponding to the entered number
        String selectedRecipe = lunchRecipes.get(recipeNumber - 1);

        // Check if "Sandwich" is the selected recipe
        if (selectedRecipe.equals("Sandwich")) {
            System.out.println("You selected Sandwich!");
            System.out.println("The Recipe is:\n" +
                    "slices sandwich bread\n" +
                    "tablespoons peanut butter\n" +
                    "teaspoons grape jelly or 2 teaspoons strawberry jam");
            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡖⠉⠉⠙⠒⠦⢤⣀⡀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣸⠦⡀⠀⠀⠀⠀⠀⠀⠉⠙⠲⢄⡀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⣀⡠⠤⠒⠊⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠲⣄⠀\n" +
                    "⣤⠤⠒⠊⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢳\n" +
                    "⢹⠉⠢⢄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣄⡀⠀⠀⠀⢠\n" +
                    "⠈⢳⢄⡀⠉⠢⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡠⠤⠒⠉⠀⣈⡉⠉⠉⡹\n" +
                    "⠀⢈⡷⣌⠐⢄⡀⠑⢦⡀⠀⠀⠀⠀⠀⣀⠤⠒⠈⠁⣀⢤⢔⣒⠩⠜⠹⠛⡝⢦\n" +
                    "⢰⡚⢑⠆⠙⠢⢌⠶⢄⠈⠲⡀⢠⠔⠉⣀⠤⣔⠮⣋⣀⠼⠂⠒⠂⣁⠥⠮⠕⡿\n" +
                    "⠀⢸⠛⠶⡤⢀⡀⠀⢈⠟⢦⡈⢁⡶⠭⠔⠊⡥⠜⠀⢸⡤⠤⠔⢊⣠⠤⠦⠴⠁\n" +
                    "⠀⠀⠑⠤⣌⠑⢬⡑⠋⠀⢠⣉⣉⠤⠤⠒⠒⠁⣀⣠⣊⠤⠖⠋⠁⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠙⢦⡈⠢⠒⠭⢥⣀⣀⠠⢄⣲⠽⠚⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠈⠢⣄⡀⣤⠤⠖⠊⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⣶⣶⣶⣶⣶⣶⣶⣶⣶⣾⣿⣷⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶");
        }
        //this will help display salad recipe
        if (selectedRecipe.equals("Salad")) {
            System.out.println("You selected Salad!");
            System.out.println("The Recipe is:\n" + "1 large or 2 small heads of romaine lettuce\n" +
                    "Parmesan cheese, shredded or shaved\n" +
                    "Crisp croutons – homemade can be made several days ahead. " +
                    "The recipe below makes enough for 2 salads.\n" +
                    "Caesar salad dressing – homemade is best and here is our " +
                    "favorite store-bought dressing in a pinch");
            System.out.println("");
        }
        //this will help display Omelette recipe
        if (selectedRecipe.equals("Soup")) {
            System.out.println("You selected Soup!");
            System.out.println("4 tablespoons unsalted butter\n" +
                    "1 medium yellow onion, chopped\n" +
                    "½ teaspoon sea salt\n" +
                    "Freshly ground black pepper\n" +
                    "3 garlic cloves, chopped\n" +
                    "¼ cup all-purpose flour\n" +
                    "2 cups whole milk or unsweetened almond milk\n" +
                    "2 cups vegetable broth\n" +
                    "3 cups chopped broccoli florets\n" +
                    "1 large carrot, julienned or finely chopped\n" +
                    "½ teaspoon Dijon mustard\n" +
                    "8 ounces shredded cheddar cheese, about 2 heaping cups\n" +
                    "Homemade croutons, for serving, optional");
        }
        //this will help display Pasta recipe
        if (selectedRecipe.equals("Pasta")) {
            System.out.println("You selected Pasta!");
            System.out.println("The Recipe is:\n" + "▢ 8 ounces uncooked penne pasta\n" +
                    "▢ 1 tablespoon olive oil\n" +
                    "▢ 2 tablespoons butter\n" +
                    "▢ 1/2 small onion chopped finely\n" +
                    "▢ 1 clove garlic minced\n" +
                    "▢ 1/4 cup vodka\n" +
                    "▢ 1/4 cup tomato paste see note\n" +
                    "▢ 3/4 cup heavy/whipping cream\n" +
                    "▢ Salt & pepper to taste\n" +
                    "▢ Fresh basil, sliced thin optional, to taste\n" +
                    "▢ Freshly grated parmesan cheese optional, to taste\n");
        }
    }
}



