// ToolItem.java

package model;

// Child class for the factory pattern
// Creates a generic tool item for store
public class ToolItem extends Items {
    

    public ToolItem(){

    String name = "Tool"
    String description = "Sturdy, reliable, and will get the job done right";
    double cost = 19.99;
    int amount = 5;

    super(name, description, cost, amount);
    }
}
