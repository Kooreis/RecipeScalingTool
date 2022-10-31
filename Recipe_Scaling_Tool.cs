```CSharp
using System;

class Program
{
    static void Main(string[] args)
    {
        Console.WriteLine("Enter the original number of servings: ");
        int originalServings = Convert.ToInt32(Console.ReadLine());

        Console.WriteLine("Enter the desired number of servings: ");
        int desiredServings = Convert.ToInt32(Console.ReadLine());

        Console.WriteLine("Enter the number of ingredients: ");
        int numIngredients = Convert.ToInt32(Console.ReadLine());

        for (int i = 0; i < numIngredients; i++)
        {
            Console.WriteLine("Enter the quantity of ingredient " + (i + 1) + ": ");
            double quantity = Convert.ToDouble(Console.ReadLine());

            double newQuantity = (quantity / originalServings) * desiredServings;

            Console.WriteLine("The new quantity for ingredient " + (i + 1) + " is: " + newQuantity);
        }

        Console.WriteLine("Press any key to exit...");
        Console.ReadKey();
    }
}
```