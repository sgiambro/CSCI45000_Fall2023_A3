// ItemFactory.java

package model;

// Class for the factory pattern that makes the product
public class ItemFactory {

    public ItemFactory(){
        
    }
	
    // makes the requested item and sends it to the store
    public Items makeItem(int item){
       
        if (item == 1){

            return new FoodItem();
        }
        else if (item == 2){

            return new ToolItem();
        }
        else if (item == 3){

            return new ElectronicItem();
        }
        else if (item == 4){

            return new ClothesItem();
        }
        else if (item == 5){

            return new DecorationItem();
        }
       
        return new FoodItem();
    }
 }