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
}