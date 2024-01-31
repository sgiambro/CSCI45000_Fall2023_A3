// DecorationItem.java

package model;

// Child class for the factory pattern
// Creates a generic decoration item for store
public class DecorationItem extends Items {
    

    public DecorationItem(){

    String name = "Decoration"
    String description = "A modern piece constructed from wood and hand painted.";
    double cost = 99.99;
    int amount = 4;

    super(name, description, cost, amount);
    }
}
