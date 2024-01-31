// ShowInventory.java

package model;

// Child class for the command pattern
// Command that shows all of the product in the store
public class ShowInventory extends Command{
    
    Items inventory[];
    int itemNum;

    public ShowAdmins(Users i[], int in){

        inventory = i;
        itemNum = in;
    }

    // Method  overrides the parent execute()
    public void execute(){

        for(int i = 0; i<itemNum; i++){

            System.out.println("---" + inventory[i].getName() + "---");
            System.out.println(inventory[i].getDescription());
            System.out.println("\nProduct Number:   " + i);
            System.out.println("------------------------\n");

        }
    }

}
