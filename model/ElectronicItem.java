// ElectronicItem.java

package model;

// Child class for the factory pattern
// Creates a generic electronic item for store
public class ElectronicItem extends Items {
    

    public ElectronicItem(){

    String name = "Electronic device"
    String description = "Fun, useful device that will improve your life (batteries not included).";
    double cost = 59.99;
    int amount = 7;

    super(name, description, cost, amount);
    }
}
