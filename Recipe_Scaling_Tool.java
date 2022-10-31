```java
import java.util.Scanner;

public class RecipeScalingTool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the original number of servings: ");
        int originalServings = scanner.nextInt();
        System.out.println("Enter the desired number of servings: ");
        int desiredServings = scanner.nextInt();
        System.out.println("Enter the number of ingredients: ");
        int numIngredients = scanner.nextInt();
        String[] ingredients = new String[numIngredients];
        double[] quantities = new double[numIngredients];
        for (int i = 0; i < numIngredients; i++) {
            System.out.println("Enter ingredient " + (i + 1) + " name: ");
            ingredients[i] = scanner.next();
            System.out.println("Enter ingredient " + (i + 1) + " quantity: ");
            quantities[i] = scanner.nextDouble();
        }
        System.out.println("Scaled Recipe: ");
        for (int i = 0; i < numIngredients; i++) {
            double scaledQuantity = quantities[i] * desiredServings / originalServings;
            System.out.println(ingredients[i] + ": " + scaledQuantity);
        }
    }
}
```