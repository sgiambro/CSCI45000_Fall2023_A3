// CustomerView.java

package view;

// Class for front controller pattern
// View of the Customer menu
public class CustomerView {
    

    public CustomerView(){

    }

    // Menu specificly for the customers of the online store
    public void customerMenu(StoreOp stub, InputValidator input, int identifyer){

        int userInt, index, type, pn,m;
        double userDouble, m;
        String userString;

        type = identifyer / 100;
        index = identifyer % 100;

        System.out.println("\n\n-----------Customer Menu-----------");
        try{
            while(true){

                System.out.println("Browse Products---------1");
                System.out.println("Add Item to Cart--------2");
                System.out.println("View Cart---------------3");
                System.out.println("Buy Cart----------------4");
                System.out.println("Add Money To Account----5");
                System.out.println("QUIT--------------------6");

                userInt = input.getInputInt();

                // Shows all items that the store is selling
                if(userInt == 1){
                    
                    System.out.println("\n\n-----------Product SCREEN-----------");

                    stub.showInventory();
                    
                }

                // Adds an item to the customers cart based on the given product number
                else if(userInt == 2){
                    
                    System.out.println("\n\n-----------Add Item SCREEN-----------");

                    System.out.print("\nProduct Number:   ");
                    pn = input.getInputInt();

                    if(pn >= 0 && pn <= stub.getItemNum()-1){

                        stub.addCustomerItem(index, pn);
                    }
                }

                // Shows the user whats in their cart
                else if(userInt == 3){
                    
                    System.out.println("\n\n-----------Cart SCREEN-----------");

                    stub.customerCart(index);
                    
                }

                // Users can buy the items in their cart if they have the money to do so
                else if(userInt == 4){
                    
                    System.out.println("\n\n-----------Buy Cart SCREEN-----------");

                    f = stub.customerBuy(index);

                    if(f == 1){

                        System.out.println("Transaction Complete.\nThanks For Shopping!");
                    }
                    else if(f == 2){

                        System.out.println("Transaction Incomplete.\nNot Enough Money In Account.");
                    }
                }

                // The customer can add money to their account
                else if(userInt == 5){

                    System.out.println("\n\n-----------Add Money SCREEN-----------");

                    System.out.print("\nAmount:   ");
                    m = input.getInputDouble();

                    stub.addCustomerMoney(index, m);

                }

                // Quits out of the program if quit is selected
                else if(userInt == 6){
                    System.exit(0);
                }

                else{
                    System.out.println("\n***INVALID INPUT***\n\n");
                }
            }
        }

        catch(Exception e){

            System.out.println("Client err:" + e.getMessage());
            e.printStackTrace();
        }
    }
}
