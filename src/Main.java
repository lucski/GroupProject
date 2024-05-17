import java.util.*;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        // Define cuisines and corresponding recipes through newRecipe class
        newRecipe recipe = new newRecipe();
        newRecipe.newCuisine();
        //New Class for breakfast recipes
        newBreakfast breakfast = new newBreakfast();
        //New Class for lunch recipes
        newLunch lunch = new newLunch();
        //New Class for brunch recipes
        newBrunch brunch = new newBrunch();
        //New Class for dinner recipes
        newDinner dinner = new newDinner();
        //new class for japanese recipes
        newJapanese japanese = new newJapanese();
        //new class for chinese recipes
        newChinese Chinese = new newChinese();
        //new class for american recipes
        newAmerican American = new newAmerican();
        //new class for italian recipes
        newItalian Italian = new newItalian();

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
                newDinner.dinnerDisplay();
                break;
            case 5:
                // Add code for Japanese options
                newJapanese.japaneseDisplay();
                break;
            case 6:
                // Add code for Chinese options
                newChinese.chineseDisplay();
                break;
            case 7:
                // Add code for American options
                newAmerican.americanDisplay();
                break;
            case 8:
                // Add code for Italian options
                newItalian.italianDisplay();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                break;
        }

        // Validate choice and select the cuisine

   }
}
