// FoodItem.java

package model;

// Child class for the factory pattern
// Creates a generic food item for store
public class FoodItem extends Items {
    

    public FoodItem(){

    String name = "Food"
    String description = "Delicious and used to satiate your hunger";
    double cost = 13.99;
    int amount = 10;

    super(name, description, cost, amount);
    }
}
