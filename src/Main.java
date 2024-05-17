import java.util.*;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        // Define cuisines and corresponding recipes through newRecipe class
        newRecipe recipe = new newRecipe();
        newRecipe.newCuisine();
        newBreakfast breakfast = new newBreakfast();
        newLunch lunch = new newLunch();
        newBrunch brunch = new newBrunch();

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

        // Map the user's choice to the corresponding cuisine used a switch instead to call
        //the classes
        switch (choice) {
            case 1:
                // Print breakfast options
                newBreakfast.breakfastDisplay();
                break;
            case 2:
                // Add code for brunch options
                newBrunch.brunchDisplay();
                break;
            case 3:
                // Add code for lunch options
                newLunch.lunchDisplay();
                break;
            case 4:
                // Add code for dinner options
                break;
            case 5:
                // Add code for Japanese options
                break;
            case 6:
                // Add code for Chinese options
                break;
            case 7:
                // Add code for American options
                break;
            case 8:
                // Add code for Italian options
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                break;
        }

        // Validate choice and select the cuisine

   }
}
