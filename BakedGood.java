package bakery;
/**
 * Represents a single baked good in our bakery's inventory
 */
public class BakedGood
{
    // Instance variables
    private String name;
    private String recipe;
    private double price;
    private int quantity;

    public BakedGood(String name, String recipe, double price, int quantity) 
    {
        // Initialize instance variables
        this.name = name;
        this.recipe = recipe;
        this.price = price;
        this.quantity = quantity;
    }

    // Modify the quantity
    public void increaseQuantity(int count) 
    {
        this.quantity += count;
    }

    // Instance method to buy some baked goods
    public double purchase(int count) {
        if (count > this.quantity) {
            throw new IllegalArgumentException("You cannot buy more than our current inventory");
        }
        this.quantity -= count;
        return this.price * count;
    }

    public void printRecipe() {
        String[] ingredients = this.recipe.split(", ");
        System.out.println("Ingredients:");
        for (String ingredient : ingredients) {
            System.out.println(ingredient);
        }
    }

    public String toString() {
        return "Baked good: " + this.name + " (" + this.quantity + " @ $" + this.price + ")";    }

    public static void main(String[] args) {
        BakedGood croissant = new BakedGood("croissant", "butter, flour, laminate, yum", 20.0, 0);

        // Bake a dozen croissants
        croissant.increaseQuantity(12);
        System.out.println(croissant);

        // Bake 3 more croissants with the leftover dough
        // croissant.increaseQuantity(3);
        // System.out.println(croissant);
        
        System.out.println(croissant.purchase(3));
        System.out.println(croissant);
        
        //Purchasing too many should throw the error
        //croissant.purchase(10);

        croissant.printRecipe();

    }

}