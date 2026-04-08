class BakedGood:
    """
    Represents a single baked good in our bakery's inventory
    """

    def __init__(self, name, recipe, price, quantity):
        self.name = name
        self.recipe = recipe
        self.price = price
        self.quantity = quantity

    # Modify the quantity
    def increase_quantity(self, count):
        self.quantity += count

    # Buy some baked goods
    def purchase(self, count):
        if count > self.quantity:
            raise ValueError("You cannot buy more than our current inventory")
        self.quantity -= count
        return self.price * count

    def print_recipe(self):
        ingredients = self.recipe.split(", ")
        print("Ingredients:")
        for ingredient in ingredients:
            print(ingredient)

    def __str__(self):
        return f"Baked good: {self.name} ({self.quantity} @ ${self.price})"


if __name__ == "__main__":
    croissant = BakedGood("croissant", "butter, flour, laminate, yum", 20.0, 0)

    # Bake a dozen croissants
    croissant.increase_quantity(12)
    print(croissant)

    # Bake 3 more croissants with the leftover dough
    # croissant.increase_quantity(3)
    # print(croissant)

    print(croissant.purchase(3))
    print(croissant)

    # Purchasing too many should throw the error
    # croissant.purchase(10)

    croissant.print_recipe()
