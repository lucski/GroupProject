import java.util.List;
import java.util.Scanner;

public class newDinner {

    public static void dinnerDisplay() {
        Scanner scanner = new Scanner(System.in);

        // Display the list of lunch recipes
        System.out.println("Dinner Recipes:");
        List<String> dinnerRecipes = newRecipe.cuisines.get("Dinner");
        for (int i = 0; i < dinnerRecipes.size(); i++) {
            System.out.println((i + 1) + ". " + dinnerRecipes.get(i));
        }

        // Prompt the user to enter a number corresponding to a recipe
        System.out.println("Enter the number of the recipe you want to check:");
        int recipeNumber = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Check if the entered number is within the valid range
        if (recipeNumber < 1 || recipeNumber > dinnerRecipes.size()) {
            System.out.println("Invalid recipe number. Please try again.");
            return;
        }

        // Get the recipe corresponding to the entered number
        String selectedRecipe = dinnerRecipes.get(recipeNumber - 1);

        // Check if "Steak" is the selected recipe
        if (selectedRecipe.equals("Steak")) {
            System.out.println("You selected Steak!");
            System.out.println("The Recipe is:\n" +
                    "2 lbs New York Strip Steaks (2 steaks), or Ribeye or Top Sirloin Steaks (1 lb each steak, 1 1/4” thick)\n" +
                    "1/2 Tbsp vegetable oil, or any high heat cooking oil like canola or extra light olive oil\n" +
                    "1 1/2 tsp sea salt\n" +
                    "1 tsp black pepper, freshly ground\n" +
                    "2 Tbsp unsalted butter\n" +
                    "2 cloves garlic, peeled and quartered\n" +
                    "1 sprig fresh rosemary" + "\n Directions: " +
                    "\n Thoroughly pat steak dry with paper towels. Just before cooking, generously season with 1 1/2 tsp salt and 1 tsp black pepper\n" +
                    "Heat the cast iron pan until hot then add 1/2 Tbsp oil over medium-high heat, swirling to coat. Once the oil is very hot, add steaks to the skillet. \n Sear the steaks on the first side for 4 minutes until a brown crust has formed then flip and cook another 3-4 minutes. \n Using tongs, turn the steak on its sides to render the white fat and sear the edges (1-minute per edge).\n" +
                    "Reduce heat to medium and immediately add 2 Tbsp butter, quartered garlic cloves and rosemary to the pan. Spoon the butter sauce over the steak, tilting the pan to get butter on your spoon. " +
                    "Continue spooning the sauce over the steak for a minute or until the steak is about 5-10 degrees from your desired doneness (the temperature will continue to rise another 5-10 degrees while steaks rest).\n" +
                    " \n" + "Transfer steak to a cutting board, loosely cover and rest 10 minutes before slicing into 1/2\" strips to serve. Spoon extra butter sauce over sliced steak to serve.\n");
            //Steak ASCII art for display
            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣤⣤⣶⣶⣦⣤⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣤⣾⠟⠋⠁⠀⠀⠀⠀⠀⠙⠻⣷⣄⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⢀⣴⠟⢻⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠙⢷⡄⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⣠⡞⠁⠀⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⣿⠀⣄⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⣴⠋⠀⠀⠀⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⡟⢠⣿⡆⠀\n" +
                    "⠀⠀⠀⢀⣾⣧⣤⠤⠶⠾⣿⣦⣄⣀⠀⠀⠀⠀⠀⠀⣀⣠⡴⠞⠋⣠⣿⠟⠀⠀\n" +
                    "⠀⠀⠀⣼⠟⠁⠀⠀⠀⠀⠀⠈⠙⠻⢿⣿⣿⣿⠿⠛⠋⣁⣤⣶⡿⠟⠁⠀⠀⠀\n" +
                    "⠀⠀⣼⡇⠀⠀⠀⠀⠀⠀⠀⠀⣠⡾⠟⢉⣁⣤⣶⠾⠟⠋⠉⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⢠⣿⠀⢠⣾⣿⡆⠀⠀⣠⡾⠋⣠⣴⡿⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⢸⣿⠀⠘⠛⠛⠁⣠⣾⠏⢀⣾⡿⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠈⣿⡄⠀⠀⣠⣾⠟⢁⣴⡿⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠈⠻⠿⠿⠛⢁⣴⡿⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠚⠛⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        }
        //this will help display salmon recipe
        if (selectedRecipe.equals("Salmon")) {
            System.out.println("You selected Salmon!");
            System.out.println("The Recipe is:\n" + "▢ 4 salmon fillets (180g/6oz each), skinless and boneless\n" +
                    "▢ 1/2 tsp salt , cooking / kosher\n" +
                    "▢ 1/4 tsp black pepper\n" +
                    "▢ 1 1/2 tbsp olive oil\n" +
                    "▢ 1 tbsp garlic (~2 cloves) , finely minced by hand (don't use a garlic press)\n" +
                    "▢ 90g / 6 tbsp salted butter , cut into cubes (or unsalted + 1/4 tsp salt)\n" +
                    "▢ 1 tsp lemon juice , plus more to taste\n" +
                    "▢ 2 tsp parsley , finely chopped" + "\n Directions: " +
                    "\n Season salmon: Take salmon out of fridge 30 minutes prior to cooking. Sprinkle both sides with salt and pepper.\n" +
                    "Sear salmon 3 mins: Heat oil in large non stick skillet over medium-high heat. Add salmon, presentation side (ie. curved side) down, and cook for 3 minutes until golden.\n" +
                    "Turn, cook 1 min, then add butter: Turn salmon and cook the other side for 1 minute. THEN put the butter in.\n" +
                    "Baste 1 1/2 minutes: Once butter is melted and foaming, add garlic and immediately start spooning the bubbling butter continuously over the salmon for 1 1/2 minutes. " +
                    "To do this, tilt the pan slightly so the butter pools on one side. Use a large spoon to scoop the butter up and spoon it over the salmon.\n" +
                    "Remove salmon from stove: Check Internal temperature of salmon. It should be 50°C/122°F for medium-rare (optimum juiciness pull temp). " +
                    "Remove salmon to a plate. Rest for 3 minutes – it will rise to 53°C/127°F. (See Note 2 for internal temperatures)\n" +
                    "Add lemon juice to butter: Put pan back on unlit stove to keep butter hot. Add lemon juice.\n" +
                    "Serve: Place salmon on serving plates. Spoon over butter (be judicious, it's rich!), garnish with a sprinkle of parsley. Pictured in the post with Cauliflower Mash and leafy greens with French Vinaigrette.");
            //Salmon ASCII art display
            System.out.println("     /`·.¸\n" +
                    "     /¸...¸`:·\n" +
                    " ¸.·´  ¸   `·.¸.·´)\n" +
                    ": © ):´;      ¸  {\n" +
                    " `·.¸ `·  ¸.·´\\`·¸)\n" +
                    "     `\\\\´´\\¸.·´");
        }
        //this will help display Stir Fry recipe
        if (selectedRecipe.equals("Stir Fry")) {
            System.out.println("You selected Stir Fry!");
            System.out.println("Ingredients\n" +
                    "1 lb boneless, skinless chicken breast cut into 1 inch cubes\n" +
                    "salt and pepper to taste\n" +
                    "2 tbsp olive oil divided\n" +
                    "2 cups broccoli florets\n" +
                    "1/2 yellow bell pepper cut into 1 inch pieces\n" +
                    "1/2 red bell pepper cut into 1 inch pieces\n" +
                    "1/2 cup baby carrots sliced\n" +
                    "2 tsp minced ginger\n" +
                    "2 garlic cloves minced\n" +
                    "Stir Fry Sauce\n" +
                    "1 tbsp corn starch\n" +
                    "2 tbsp cold water\n" +
                    "1/4 cup low sodium chicken broth\n" +
                    "3 tbsp low sodium soy sauce\n" +
                    "1/4 cup honey\n" +
                    "1 tbsp toasted sesame oil\n" +
                    "1/2 tsp crushed red pepper flakes" + "\n Directions: " + "\n Stir Fry Sauce\n" +
                    "In a medium size bowl, whisk together corn starch and water. " +
                    "Add remaining ingredients (chicken broth, soy sauce, honey, and toasted sesame oil, red pepper flakes) and whisk to combine. Set aside.\n" +
                    "Add one tablespoon of olive oil to a large skillet or wok and heat over medium high heat.\n" +
                    "Add chicken (in batches if necessary) and season with salt and pepper. Cook for 3 to 5 minutes or until cooked through. Remove from skillet.\n" +
                    "Reduce heat to medium and add remaining tablespoon of oil to the skillet.\n" +
                    "Add broccoli, bell pepper, and carrots and cook, stirring occasionally, just until crisp tender. Add ginger and garlic and cook for an additional minute.\n" +
                    "Add chicken back into the skillet and stir to combine.\n" +
                    "Whisk stir fry sauce and pour over chicken and vegetables and stir gently to combine.\n" +
                    "Bring to a boil, stirring occasionally, and let boil for one minute.\n" +
                    "Serve with rice and/or chow mein if desired.\n");

            //Print out ASCII art for stir fry
            System.out.println("       ,~.\n" +
                    "                ,-'__ `-,\n" +
                    "               {,-'  `. }              ,')\n" +
                    "              ,( a )   `-.__         ,',')~,\n" +
                    "             <=.) (         `-.__,==' ' ' '}\n" +
                    "               (   )                      /\n" +
                    "                `-'\\   ,                  )\n" +
                    "                    |  \\        `~.      /\n" +
                    "                    \\   `._        \\    /\n" +
                    "                     \\     `._____,'   /\n" +
                    "                      `-.            ,'\n" +
                    "                         `-.      ,-'\n" +
                    "                            `~~~~'\n" +
                    "                            //_||\n" +
                    "                         __//--'/`          hjw\n" +
                    "                       ,--'/`  '");
        }
        //this will help display Pizza recipe
        if (selectedRecipe.equals("Pizza")) {
            System.out.println("You selected Pizza!");
            System.out.println("The Recipe is (There are three different Pizzas ingredient wise):" +
                    "\n" + "Ingredients\n" +
                    "Pizza Dough, 1 recipe per pizza\n" +
                    "Margherita Pizza\n" +
                    "½ heaping cup pizza sauce\n" +
                    "8 ounces fresh bocconcini mozzarella, sliced\n" +
                    "½ cup sliced cherry tomatoes\n" +
                    "10 basil leaves\n" +
                    "Pinch red pepper flakes\n" +
                    "Extra-virgin olive oil, for drizzling\n" +
                    "Peach & Basil Pizza\n" +
                    "1 tablespoon extra-virgin olive oil, more for drizzling\n" +
                    "½ garlic clove, minced\n" +
                    "8 ounces fresh bocconcini mozzarella, sliced\n" +
                    "2 ripe peaches, sliced\n" +
                    "Dollops of pesto\n" +
                    "10 basil leaves\n" +
                    "Pinches red pepper flakes\n" +
                    "Roasted Red Pepper Pesto Pizza\n" +
                    "Pesto, for spreading & dolloping\n" +
                    "1½ cups grated smoked mozzarella\n" +
                    "½ cup sliced roasted red peppers\n" +
                    "½ cup mint leaves\n" +
                    "Pinches red pepper flakes" + "\n Directions: " + "\n ");
            //Print out pizza ASCII art
            System.out.println("// \"\"--.._\n" +
                    "||  (_)  _ \"-._\n" +
                    "||    _ (_)    '-.\n" +
                    "||   (_)   __..-'\n" +
                    " \\\\__..--\"\"");
        }
    }
}
