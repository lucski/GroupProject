import java.util.List;
import java.util.Scanner;

public class newBrunch {

    public static void brunchDisplay() {
        Scanner scanner = new Scanner(System.in);

        // Display the list of lunch recipes
        System.out.println("Brunch Recipes:");
        List<String> brunchRecipes = newRecipe.cuisines.get("Brunch");
        for (int i = 0; i < brunchRecipes.size(); i++) {
            System.out.println((i + 1) + ". " + brunchRecipes.get(i));
        }

        // Prompt the user to enter a number corresponding to a recipe
        System.out.println("Enter the number of the recipe you want to check:");
        int recipeNumber = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Check if the entered number is within the valid range
        if (recipeNumber < 1 || recipeNumber > brunchRecipes.size()) {
            System.out.println("Invalid recipe number. Please try again.");
            return;
        }

        // Get the recipe corresponding to the entered number
        String selectedRecipe = brunchRecipes.get(recipeNumber - 1);

        // Check if "Avocado Toast" is the selected recipe
        if (selectedRecipe.equals("Avocado Toast")) {
            System.out.println("You selected Avocado Toast!");
            System.out.println("The Recipe is:\n" +
                    "1 slice of bread (I like thick-sliced whole-grain bread best)\n" +
                    "½ ripe avocado\n" +
                    "Pinch of salt\n" +
                    "Optional: Any of the extra toppings suggested in this post");
            //ASCII art display for avocado toast
            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⣤⣶⣲⣻⣿⢯⡿⣟⣿⣟⣶⣶⣤⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣤⢖⣿⡿⣷⢿⡻⣿⣽⡻⣽⡻⣽⣯⣿⣿⣿⣽⣿⣿⣿⣷⣦⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣠⣴⢺⡝⣲⣟⡞⣟⢧⣻⣝⢮⣽⣳⢽⣹⢷⣿⡞⣿⡿⣿⣽⣿⣿⣿⣿⣿⣿⣶⣄⡀⠀⠀⠀⠀⠀⠀⠠⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⢔⣶⡝⡽⡜⣥⢧⣚⡱⣎⡳⣭⢶⣳⢮⢿⣜⣳⢯⣟⣮⢷⣻⣷⣻⢯⣿⣯⣿⣿⣿⣿⣿⣿⣿⣿⣦⡄⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣴⣯⢳⡌⡖⣩⢳⣛⣮⣦⣳⣽⣚⣵⣹⣎⣿⣯⣛⣯⣟⣻⣾⣹⣯⣷⣯⣿⣟⣿⣻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⡀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡴⣿⣿⠸⣬⢧⢧⡷⣯⢿⠻⣾⣿⢿⣿⡿⢿⣿⡿⣿⠿⡿⣿⣿⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣖⡟⡯⢖⢦⡳⣩⣞⡎⠷⡽⣭⢓⣮⢳⢧⣖⡽⣳⣭⢿⣫⢿⣟⣽⣷⣻⣿⣾⣯⡿⣽⣿⣻⣿⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣇⠂⠄⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣴⣿⣾⣫⣯⣝⡎⠶⣵⢇⡞⣽⣫⡷⣭⣻⡼⣹⣶⣫⢷⣳⡽⡷⣯⣽⣿⣿⣷⣏⣿⣿⣿⣽⣿⣿⣯⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡝⡜⡄\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⣿⠿⣟⣛⠛⠽⠽⠿⣫⣝⡾⣽⣾⣣⠟⣼⣣⢿⡞⣷⢯⣷⢿⣿⢿⡿⣽⡿⣿⣯⣿⣽⣷⣟⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣟⣼⢳\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⡝⠊⣼⣎⠍⠋⣠⠤⣌⢐⣬⠒⣊⢛⠻⣷⢾⣿⣻⣿⣻⣿⣿⣿⣿⣿⣻⣟⣿⣿⣿⢾⣽⣿⣾⣿⣟⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡽⣞⣯\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠹⣷⠊⠨⠁⡀⠈⠀⠘⡠⢕⠈⠀⡯⡄⠑⠠⡨⠝⣻⣿⣿⣿⣯⢯⣿⣿⣽⣿⢿⣻⡿⣿⣳⣿⣿⣿⣽⣿⣿⣿⣿⣿⣽⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢿⣻⢿⣹\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠤⢙⣬⣢⠰⡎⢂⡰⠆⡈⡲⠗⡤⡃⠀⠀⠀⠀⠕⠦⣰⠙⢛⢿⣿⣿⣾⣿⣽⣿⣻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣟⣻⡞⣧⢷\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣎⠱⠀⠱⣀⡄⡈⠂⠀⠠⠆⠹⠀⡀⠀⣄⠀⠈⠃⢬⠛⢝⢻⣿⢿⣿⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣟⡞⣧⢿⡹⣞\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⡩⠀⢵⡁⠀⠀⠐⠁⠡⣊⢆⡀⠲⠢⠁⠠⠒⠈⠄⡠⠀⠇⢙⠷⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣯⣟⣞⣯⡽⣞\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⢯⢄⡳⡀⠀⠀⠀⠐⣁⠎⢈⠌⡖⠜⡨⢫⡀⠠⠀⠘⠀⠂⡀⠂⠘⣻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⣾⡽⢾⣹⢯\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⡯⢢⡈⡓⠀⢀⡢⠁⠐⡓⠂⡘⠈⠀⠀⠀⡄⠀⢀⠂⢴⠀⠅⠀⡈⢄⣘⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⣽⣳⢟⡯⣟⡞\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣿⠄⠢⠀⠢⠈⠀⠀⠀⠁⠈⠁⠀⠀⠒⠀⠁⡰⠆⣀⠈⠂⠀⠊⠀⠀⠀⢿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣻⡷⣯⢿⡝⣮⠙\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣿⠓⢄⠈⢀⡀⠄⠀⠀⠤⠖⢈⠢⠀⠀⠑⡀⡀⠌⡁⠀⠀⢲⠀⠀⢈⠈⣤⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣟⣿⣳⣟⡻⣞⠹⡌⡉\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⢀⣰⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⣻⣀⠀⢀⠀⠀⠶⡄⠀⠀⠀⠀⠀⠀⣠⡷⢀⡆⡄⢰⣼⠇⣀⢦⣇⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣿⠷⡟⠶⢠⠃\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠒⠈⠁⠁⠒⠠⠤⠤⠄⠀⠀⠀⠠⠤⠤⠤⠀⡤⡤⠀⠤⣣⡍⣆⠈⡠⢄⡐⠀⠀⠀⠀⠀⠀⣀⠕⠁⠌⠁⢀⠈⠀⠀⣿⡼⢩⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣿⡾⣭⠳⡍⢆⠁⢂⠠⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡠⣲⠹⠉⠀⠀⠀⠀⠙⡿⢿⣤⣄⠔⣘⠁⠄⠀⠀⠀⢁⠀⠈⡀⠀⠀⠀⠀⡠⡅⡀⢣⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⣿⢿⡟⣯⠝⢎⡑⢂⠂⠁⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠤⠄⠀⠀⠀⠀⠐⠒⠂⣒⢖⠟⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠈⠑⠻⠿⢶⣤⣨⠵⠄⠀⠀⠀⠂⠐⠐⣋⠠⠋⢪⠠⠅⢑⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⣯⢷⡿⣽⣫⠟⡬⠩⠄⡈⠀⠀⠀⠀⡀⠀\n" +
                    "⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⢒⡝⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠑⠻⢶⠯⣴⡞⣠⣂⣤⠗⠀⠄⠂⠔⠁⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⣽⡳⣭⢛⠜⡡⠒⠤⠡⠌⠤⠡⠄⠡\n" +
                    "⠀⠀⠀⠀⠀⠀⠠⠠⠤⠬⣥⠤⣤⣴⣚⠕⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠫⠛⢟⣷⣦⣰⠢⠄⠐⡰⠚⡀⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢿⡟⣷⣛⠳⡙⠔⣂⠒⡐⢀⢂⡐⢀⢂⡐⣀⠂\n" +
                    "⠀⠀⠀⠀⠀⠀⢀⣴⣶⠚⠖⠾⠊⠉⠠⠀⠀⠀⠀⠀⠀⠄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠐⠀⠀⠀⠀⠠⡀⠐⡀⠐⠑⠻⠿⣿⣾⣀⡟⣅⣾⣿⣿⣿⣿⣿⣿⡿⠿⠉⠂⠁⠌⠀⠁⠀⠁⠈⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⣴⣿⡟⢁⠅⠀⠀⠀⠀⠁⢀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠁⠐⢸⠀⠠⠀⢀⡁⠙⣿⣼⣶⣿⣿⣿⣿⡿⠛⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠐⠀⢀⢀⠀⡀⠀⠀⠀⠠⠀⠄⠀\n" +
                    "⠀⠀⠀⠀⢸⣿⢳⠓⠁⠀⠀⠠⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠄⠀⠀⠀⠨⠁⠄⠆⣠⣾⣿⣆⡉⠁⠈⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡀⠀⢀⠀⢀⡀⣀⢀⡀⣀⠄⡠⢈⡀⠒⣈⠁\n" +
                    "⠀⠀⠀⠀⣿⣧⠅⠀⠀⠀⢀⠀⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡄⠀⠀⠀⠀⢀⣠⣿⣿⣿⣿⣿⠇⠀⠠⠀⠀⠀⠀⠂⠀⠀⠀⠐⡀⡀⠂⠀⠀⠀⠄⡀⡀⠂⢀⠂⠄⠁⠠⢁⢀⠊\n" +
                    "⠀⠀⠀⠀⢻⣿⢴⠀⠀⠀⢬⠂⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡠⠁⠀⠀⠄⣘⣿⣿⣿⣿⣿⡿⠗⠀⠀⠀⠀⠀⠀⠄⠀⠀⠀⠀⠀⠀⠀⠀⢀⠀⠁⠄⠐⠀⠉⠂⠊⠐⡁⢂⠁⢄⠂\n" +
                    "⠀⠀⠀⠀⠈⣿⣯⡵⡄⠀⠈⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠂⠀⠀⠀⠀⠌⠀⠀⠠⣰⣾⣿⣿⣿⣿⣿⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠐⠠⠐⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠘⣿⣖⡟⠀⠀⠀⠀⢀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠄⠀⠀⠀⠀⡀⢀⠔⠀⠠⣠⣾⣿⣿⣿⣿⠟⠁⠂⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠐⠀⠂⠂⠀⠀⠀⠄⠠⠂⠤⠠⠄⠂⢀⠢⠔⠂\n" +
                    "⠀⠀⠀⠀⠀⠀⠾⣿⣿⣿⣧⣰⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⠀⠁⢠⣦⣿⣿⣿⣿⣿⡿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⠀⠰⠈⠀⠀⠀⠀⠈⠈⠁⠈⠀⡀⠀⠀⠰⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠘⢿⣿⣿⣿⣧⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠁⠀⡀⣼⣿⣿⣿⣿⣿⠯⠄⠀⠀⠀⠀⠀⠀⠀⠀⢀⠀⠀⠀⠀⠈⠉⢀⢃⠘⠃⠀⠀⠀⠀⠀⠀⠀⠀⠁⠀⡀⠀⠀⠀⠀⠄⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠈⠛⢿⣿⣿⡿⣧⣠⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣽⣾⣿⣿⣿⡿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠒⠀⠀⠀⠀⠀⠀⠠⠀⠀⠠⠀⠀⠀⠂⠀⠂⠄⠀⠠⠀⠂⠠⠐⠈\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⢽⣿⣿⣟⡷⣷⣦⣄⣤⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⠔⣼⣿⣿⣿⡿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠀⠀⠀⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠉⠉⠀⠀⠀⠀⠀⠈⠻⢿⣿⣿⣾⣿⣿⣛⣳⣶⣦⢤⣄⣀⡄⣀⣀⣀⣢⣤⣾⣶⣾⣿⣿⣿⣿⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠂⠀⠈⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠁⠈⠙⠻⢿⣿⣿⢿⣿⣿⣿⣿⣾⣽⣿⣾⣯⣿⣿⣿⣿⣿⣿⣿⠟⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠀⠀⡀⢀⠀⠀⠀⠀⠁⠁\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠛⠻⠾⠿⢿⣿⣿⣿⣿⣿⣿⣿⠿⡿⠟⠛⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠂⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠀⠀⠀⠀⠀⠀⠀⠀⠒⠀⠐⠂⠀⠀⠀⠀⠐⠀⠀⠀⠀⠂⠀⠀⠀⠀⠐⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        }
        //this will help display Eggs Benedict recipe
        if (selectedRecipe.equals("Eggs Benedict")) {
            System.out.println("You selected Eggs Benedict!");
            System.out.println("The Recipe is:\n" + "▢ 2 English muffins\n" +
                    "▢ 4 large eggs\n" +
                    "▢ 4 slices Canadian bacon\n" +
                    "▢ Vinegar , just a splash\n" +
                    "For the Hollandaise sauce:\n" +
                    "▢ 4 Tablespoons butter\n" +
                    "▢ 4 egg yolks\n" +
                    "▢ 2 teaspoons lemon juice , or lime juice\n" +
                    "▢ 1 Tablespoon heavy whipping cream\n" +
                    "▢ salt and pepper (to taste)");
            //ASCII art for eggs benedict
            System.out.println("  ,'\"`.\n" +
                    " /     \\\n" +
                    ":       :\n" +
                    ":       :\n" +
                    " `.___,'");
        }
        //this will help display Quiche recipe
        if (selectedRecipe.equals("Quiche")) {
            System.out.println("You selected Quiche!");
            System.out.println("1 unbaked Flaky Pie Crust (what I used) or All Butter Pie Crust*\n" +
                    "4 large eggs\n" +
                    "1/2 cup whole milk*\n" +
                    "1/2 cup heavy cream or heavy whipping cream*\n" +
                    "1/4 teaspoon each salt and pepper*\n" +
                    "1 cup shredded or crumbled cheese such as feta, cheddar, goat cheese, or gruyere\n" +
                    "up to 2 cups add-ins (see recipe note)\n" +
                    "optional toppings for serving: extra cheese, chopped herbs, hollandaise sauce, " +
                    "& freshly ground pepper to taste");
            //ASCII art for Quiche
            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠐⠈⠁⢷⡄⢀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡀⠔⠈⠁⠀⠈⠢⣀⡀⠐⠛⠚⣰⢀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠔⠉⠠⠄⠀⠀⠀⠀⠀⠈⠲⣇⠀⠉⣛⣁⣣⡀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⢀⠠⠐⠈⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⣦⠀⠀⢚⣉⣉⠄⠀\n" +
                    "⠀⢀⡀⠐⠈⠀⠒⣀⣀⠒⠂⠀⠀⠀⠀⢈⡀⠀⠀⠀⠀⠀⠈⠀⠀⡤⢍⡉⠀⡇\n" +
                    "⠀⠏⢑⢶⠒⢶⠶⡶⡦⠄⢠⣈⠉⠀⣤⣄⣀⣉⣁⣒⡂⠀⠤⠀⠂⠉⠀⠀⡠⠃\n" +
                    "⠐⢆⣈⣜⠀⣜⠀⢃⠃⡀⣰⡃⠠⡄⠈⣶⡁⠀⠢⢬⣯⡈⠉⢩⠇⡠⠊⠀⠀⠀\n" +
                    "⠀⣞⠰⠈⣹⠟⢒⡒⢢⣬⠋⠁⠲⣤⠾⠄⣑⡶⠞⢻⡀⢉⡩⢃⠌⠀⠀⠀⠀⠀\n" +
                    "⠀⠙⠓⠀⠩⠦⡀⣤⠆⠘⠂⠀⣚⣡⠀⠈⣴⣇⠠⠤⠴⡋⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠈⠀⠀⠀⠀⠀⠐⠈⠀⠐⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        }
        //this will help display Fruit Salad recipe
        if (selectedRecipe.equals("Fruit Salad")) {
            System.out.println("You selected Fruit Salad!");
            System.out.println("The Recipe is:\n" + "Sauce:\n" +
                    "\n" +
                    "⅔ cup fresh orange juice\n" +
                    "\n" +
                    "⅓ cup fresh lemon juice\n" +
                    "\n" +
                    "⅓ cup packed brown sugar\n" +
                    "\n" +
                    "½ teaspoon grated orange zest\n" +
                    "\n" +
                    "½ teaspoon grated lemon zest\n" +
                    "\n" +
                    "1 teaspoon vanilla extract\n" +
                    "\n" +
                    "Salad:\n" +
                    "\n" +
                    "2 cups cubed fresh pineapple\n" +
                    "\n" +
                    "2 cups strawberries, hulled and sliced\n" +
                    "\n" +
                    "3 kiwi fruit, peeled and sliced\n" +
                    "\n" +
                    "3 bananas, sliced\n" +
                    "\n" +
                    "2 oranges, peeled and sectioned\n" +
                    "\n" +
                    "1 cup seedless grapes\n" +
                    "\n" +
                    "2 cups blueberries");
            //ASCII art display for fruit salad
            System.out.println(" _\n" +
                    "//\\\n" +
                    "V  \\\n" +
                    " \\  \\_\n" +
                    "  \\,'.`-.\n" +
                    "   |\\ `. `.       \n" +
                    "   ( \\  `. `-.                        _,.-:\\\n" +
                    "    \\ \\   `.  `-._             __..--' ,-';/\n" +
                    "     \\ `.   `-.   `-..___..---'   _.--' ,'/\n" +
                    "      `. `.    `-._        __..--'    ,' /\n" +
                    "        `. `-_     ``--..''       _.-' ,'\n" +
                    "          `-_ `-.___        __,--'   ,'\n" +
                    "             `-.__  `----\"\"\"    __.-'\n" +
                    "                   `--..____..--'");
        }
    }
}



