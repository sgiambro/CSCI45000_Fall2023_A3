// ClothesItem.java

package model;

// Child class for the factory pattern
// Creates a generic clothes item for store
public class ClothesItem extends Items {
    

    public ClothesItem(){

    String name = "Clothes"
    String description = "A stylish and comfortable piece that look good any time of the year";
    double cost = 39.99;
    int amount = 20;

    super(name, description, cost, amount);
    }
}
