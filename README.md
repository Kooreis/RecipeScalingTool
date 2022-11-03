# Python Documentation

# Recipe Scaling Tool

This Python script provides a simple tool for scaling recipes. It allows users to add ingredients and their quantities, set a scale factor, and get the scaled recipe. The script does not require any external libraries.

## Class: RecipeScalingTool

This class provides the main functionality of the script. It has the following methods:

### `__init__(self)`

This is the constructor method which initializes an empty recipe and a scale factor of 1.

### `add_ingredient(self, name, quantity)`

This method allows users to add an ingredient to the recipe. The ingredient name is the key and the quantity is the value in the recipe dictionary.

### `set_scale_factor(self, scale_factor)`

This method allows users to set the scale factor. The scale factor is used to multiply the quantity of each ingredient in the recipe.

### `get_scaled_recipe(self)`

This method returns the scaled recipe. It creates a new dictionary where each ingredient quantity is multiplied by the scale factor.

## Function: main()

This function provides a simple text-based user interface for interacting with the RecipeScalingTool. It provides the following options:

1. Add ingredient: This option prompts the user to enter an ingredient name and quantity, which are then added to the recipe.
2. Set scale factor: This option prompts the user to enter a scale factor, which is then set in the RecipeScalingTool.
3. Get scaled recipe: This option prints the scaled recipe to the console. Each ingredient and its scaled quantity are printed on a separate line.
4. Exit: This option breaks the loop and ends the program.

## Running the Script

To run the script, simply execute it with a Python interpreter. The script does not require any command line arguments or external libraries.

---

# C# Documentation

# Recipe Scaling Script in C#

This repository contains a simple C# script that helps to scale the quantity of ingredients based on the desired number of servings. The script prompts the user to input the original number of servings, the desired number of servings, and the quantity of each ingredient. It then calculates and displays the new quantity for each ingredient.

## Script Explanation

The script begins by importing the System namespace, which provides fundamental classes and base classes that define commonly-used value and reference data types, events and event handlers, interfaces, attributes, and processing exceptions.

```CSharp
using System;
```

The script then defines a class named `Program` and a `Main` method, which is the entry point of the C# console application.

```CSharp
class Program
{
    static void Main(string[] args)
    {
        ...
    }
}
```

The script prompts the user to enter the original number of servings, the desired number of servings, and the number of ingredients. These values are read from the console and converted to integers.

```CSharp
Console.WriteLine("Enter the original number of servings: ");
int originalServings = Convert.ToInt32(Console.ReadLine());

Console.WriteLine("Enter the desired number of servings: ");
int desiredServings = Convert.ToInt32(Console.ReadLine());

Console.WriteLine("Enter the number of ingredients: ");
int numIngredients = Convert.ToInt32(Console.ReadLine());
```

The script then enters a loop that runs for each ingredient. In each iteration, the script prompts the user to enter the quantity of the ingredient. This value is read from the console and converted to a double. The script then calculates the new quantity for the ingredient based on the desired number of servings and displays this value.

```CSharp
for (int i = 0; i < numIngredients; i++)
{
    Console.WriteLine("Enter the quantity of ingredient " + (i + 1) + ": ");
    double quantity = Convert.ToDouble(Console.ReadLine());

    double newQuantity = (quantity / originalServings) * desiredServings;

    Console.WriteLine("The new quantity for ingredient " + (i + 1) + " is: " + newQuantity);
}
```

Finally, the script prompts the user to press any key to exit the application.

```CSharp
Console.WriteLine("Press any key to exit...");
Console.ReadKey();
```

## Libraries Used

- `System`: This namespace is automatically imported in every C# program. It contains fundamental classes and base classes that define commonly-used value and reference data types, events and event handlers, interfaces, attributes, and processing exceptions. In this script, it is used for console input/output and converting string inputs to integers and doubles.

---

# Java Documentation

# Recipe Scaling Tool

This is a simple Java program that helps you scale your recipes. It takes the original number of servings and the desired number of servings as input, and adjusts the quantity of each ingredient accordingly.

## How it works

The program first asks for the original number of servings and the desired number of servings. It then asks for the number of ingredients in the recipe. For each ingredient, it asks for the name and the quantity. Finally, it calculates the scaled quantity for each ingredient and prints it out.

## Code Explanation

```java
import java.util.Scanner;
```
The Scanner class is used to get user input, and it is found in the java.util package.

```java
public class RecipeScalingTool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
```
A new Scanner object is created to read the input from the user.

```java
        System.out.println("Enter the original number of servings: ");
        int originalServings = scanner.nextInt();
        System.out.println("Enter the desired number of servings: ");
        int desiredServings = scanner.nextInt();
        System.out.println("Enter the number of ingredients: ");
        int numIngredients = scanner.nextInt();
```
The program asks for the original number of servings, the desired number of servings, and the number of ingredients, and stores these values in variables.

```java
        String[] ingredients = new String[numIngredients];
        double[] quantities = new double[numIngredients];
```
Two arrays are created to store the names and quantities of the ingredients.

```java
        for (int i = 0; i < numIngredients; i++) {
            System.out.println("Enter ingredient " + (i + 1) + " name: ");
            ingredients[i] = scanner.next();
            System.out.println("Enter ingredient " + (i + 1) + " quantity: ");
            quantities[i] = scanner.nextDouble();
        }
```
The program asks for the name and quantity of each ingredient, and stores these values in the arrays.

```java
        System.out.println("Scaled Recipe: ");
        for (int i = 0; i < numIngredients; i++) {
            double scaledQuantity = quantities[i] * desiredServings / originalServings;
            System.out.println(ingredients[i] + ": " + scaledQuantity);
        }
    }
}
```
The program calculates the scaled quantity for each ingredient and prints it out. The scaled quantity is calculated by multiplying the original quantity by the ratio of the desired servings to the original servings.

---
