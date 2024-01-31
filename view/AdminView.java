// AdminView.java

package view;

// Class for front controller pattern
// View of the Admin menu
public class AdminView {
    

    public AdminView(){

    }

    // Menu specificly for the admins of the online store
    public void adminMenu(StoreOp stub, InputValidator input, int identifyer){

        int userInt, index, type, pn, a;
        double userDouble, c;
        String userString, n, un, p, des;

        type = identifyer / 100;
        index = identifyer % 100;

        System.out.println("\n\n-----------Admin Menu-----------");
        try{
            while(true){

                System.out.println("Show Inventory--------1");
                System.out.println("Add Item--------------2");
                System.out.println("Remove Item-----------3");
                System.out.println("Add Item Amount-------4");
                System.out.println("Remove Item Amount----5");
                System.out.println("Show Accounts---------6");
                System.out.println("Add Account-----------7");
                System.out.println("Remove Account--------8");
                System.out.println("QUIT------------------9");

                userInt = input.getInputInt();

                // Shows all items that the store is selling
                if(userInt == 1){
                    
                    System.out.println("\n\n-----------Product SCREEN-----------");

                    stub.showInventory();
                    
                }

                // Adds an item to the store's inventory
                else if(userInt == 2){
                    
                    System.out.println("\n\n-----------Add Item SCREEN-----------");

                    System.out.println("\nWhich item would you like to add");
                    System.out.println("\nFood-------------1");
                    System.out.println("\nTool-------------2");
                    System.out.println("\nElectronics------3");
                    System.out.println("\nClothes----------4");
                    System.out.println("\nDecoration-------5");
                    
                    a = input.getInputInt();

                    stub.addItem(a);

                }

                // Removes an item from the store's inventory
                else if(userInt == 3){
                    
                    System.out.println("\n\n-----------Remove Item SCREEN-----------");

                    System.out.println("\nProduct Number:   ");
                    pn = input.getInputInt();

                    stub.removeItem(pn);
                    
                }

                // Adds more of an item to the store's inventory
                else if(userInt == 4){
                    
                    System.out.println("\n\n-----------Add Item Amount SCREEN-----------");

                    System.out.println("\nProduct Number:   ");
                    pn = input.getInputInt();

                    System.out.println("\nAmount To Add:   ");
                    a = input.getInputInt();

                    stub.addItemAmount(a, pn);
                    
                }

                // Removes some of an item to the store's inventory
                else if(userInt == 5){

                    System.out.println("\n\n-----------Reduce Item Amount SCREEN-----------");

                    System.out.println("\nProduct Number:   ");
                    pn = input.getInputInt();

                    System.out.println("\nAmount To Remove:   ");
                    a = input.getInputInt();

                    stub.reduceItemAmount(a, pn);

                }

                // Shows all the store's accounts
                else if(userInt == 6){
                    
                    System.out.println("\n\n-----------Account SCREEN-----------");

                    System.out.println("\nAdmin Accounts");
                    stub.getAdmins();

                    System.out.println("\nCustomer Accounts");
                    stub.getCustomer();
                }

                // Adds an account to the store
                else if(userInt == 7){
                    
                    System.out.println("\n\n-----------Add Account SCREEN-----------");

                    System.out.print("\nName:   ");
                    n = input.getInputString();

                    System.out.print("\nCreate Username:   ");
                    un = input.getInputString();

                    System.out.print("\nCreate Password:   ");
                    p = input.getInputString();

                    // tests if account is customer or admin
                    if(p != "779988"){

                        stub.addAcount(n, un, p, 1);
                    }
                    else{

                        stub.addAcount(n, un, p, 2);
                    }
                }

                // Removes an account from the store
                else if(userInt == 8){
                    
                    System.out.println("\n\n-----------Remove Account SCREEN-----------");

                    System.out.println("\nCustomer Account Number:   ");
                    userInt = input.getInputInt();

                    stub.removeAcount(userInt, 1);

                }

                // Quits out of the program if quit is selected
                else if(userInt == 9){
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
