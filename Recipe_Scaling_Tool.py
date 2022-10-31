```python
class RecipeScalingTool:
    def __init__(self):
        self.recipe = {}
        self.scale_factor = 1

    def add_ingredient(self, name, quantity):
        self.recipe[name] = quantity

    def set_scale_factor(self, scale_factor):
        self.scale_factor = scale_factor

    def get_scaled_recipe(self):
        scaled_recipe = {}
        for ingredient, quantity in self.recipe.items():
            scaled_recipe[ingredient] = quantity * self.scale_factor
        return scaled_recipe

def main():
    tool = RecipeScalingTool()
    while True:
        print("\n1. Add ingredient")
        print("2. Set scale factor")
        print("3. Get scaled recipe")
        print("4. Exit")
        choice = input("Enter your choice: ")
        if choice == '1':
            name = input("Enter ingredient name: ")
            quantity = float(input("Enter ingredient quantity: "))
            tool.add_ingredient(name, quantity)
        elif choice == '2':
            scale_factor = float(input("Enter scale factor: "))
            tool.set_scale_factor(scale_factor)
        elif choice == '3':
            scaled_recipe = tool.get_scaled_recipe()
            for ingredient, quantity in scaled_recipe.items():
                print(f"{ingredient}: {quantity}")
        elif choice == '4':
            break
        else:
            print("Invalid choice. Please try again.")

if __name__ == "__main__":
    main()
```