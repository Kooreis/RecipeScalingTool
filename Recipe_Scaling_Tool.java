import java.util.Scanner;

public class RecipeScalingTool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the original number of servings: ");
        int originalServings = scanner.nextInt();
        System.out.println("Enter the desired number of servings: ");
        int desiredServings = scanner.nextInt();