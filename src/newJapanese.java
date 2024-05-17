import java.util.List;
import java.util.Scanner;

public class newJapanese {
  public static void japaneseDisplay() {
    Scanner scanner = new Scanner(System.in);
    // Display the list of japanese recipes
    System.out.println("japanese Recipes:");
        List<String> japaneseRecipes = newRecipe.cuisines.get("Japanese");
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
}
// Check if "Sushi" is the selected recipe
        if (selectedRecipe.equals("Sushi")) {
            System.out.println("You selected Sushi!");
            System.out.println("The Recipe is:\n" +
                    "▢ 2 cups sushi rice\n" +
                    "▢ 2 1/2 cups water\n" +
                    "▢ 1/2 cup rice vinegar\n" +
                    "▢ 1/4 cup sugar\n" +
                    "▢ 1 tsp salt\n" +
                    "▢ Nori (seaweed sheets)\n" +
                    "▢ Fresh fish (e.g., tuna, salmon)\n" +
                    "▢ Vegetables (e.g., cucumber, avocado)\n" +
                    "▢ Soy sauce, wasabi, and pickled ginger for serving");
// Check if "Ramen" is the selected recipe
  if (selectedRecipe.equals("Ramen")) {
            System.out.println("You selected Ramen!");
            System.out.println("The Recipe is:\n" +
                    "▢ 4 cups chicken broth\n" +
                    "▢ 2 cups water\n" +
                    "▢ 1 pack ramen noodles\n" +
                    "▢ 2 tbsp soy sauce\n" +
                    "▢ 1 tbsp miso paste\n" +
                    "▢ 1/2 cup sliced mushrooms\n" +
                    "▢ 1/2 cup sliced green onions\n" +
                    "▢ 2 soft-boiled eggs\n" +
                    "▢ Optional toppings: nori, corn, spinach, etc.");
    // Check if "Teriyaki" is the selected recipe
        if (selectedRecipe.equals("Teriyaki")) {
            System.out.println("You selected Teriyaki!");
            System.out.println("The Recipe is:\n" +
                    "▢ 1 lb chicken breast or thighs\n" +
                    "▢ 1/4 cup soy sauce\n" +
                    "▢ 1/4 cup mirin (sweet rice wine)\n" +
                    "▢ 2 tbsp sugar\n" +
                    "▢ 1 tbsp sake\n" +
                    "▢ 1 tsp grated ginger\n" +
                    "▢ 1 tsp minced garlic\n" +
                    "▢ 1 tbsp vegetable oil\n" +
                    "▢ Sesame seeds and chopped green onions for garnish");
          // Check if "Tempura" is the selected recipe
          if (selectedRecipe.equals("Tempura")) {
            System.out.println("You selected Tempura!");
            // Print Tempura recipe and ASCII art
            System.out.println("The Recipe is:\n" +
                    "▢ Assorted vegetables (e.g., bell peppers, zucchini, sweet potatoes)\n" +
                    "▢ 1 cup all-purpose flour\n" +
                    "▢ 1 egg\n" +
                    "▢ 1 cup ice-cold water\n" +
                    "▢ Oil for frying\n" +
                    "▢ Tempura dipping sauce (tentsuyu) for serving\n");
        }
    }
}
