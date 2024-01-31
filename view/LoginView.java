// LoginView.java

package view;

// Class for front controller pattern
// View of the login menu
public class LoginView {
    

    public LoginView(){

    }

    // Menu for when you first enter the online store
    public int loginMenu(StoreOp stub, InputValidator input){

        int userInt, index, type, tai;
        double userDouble;
        String userString, n, un, p;

        System.out.println("Welcome to our online store!");
        System.out.println("What what whould you like to do?");
        
        try{
            while(true){

                System.out.println("Login---------------1");
                System.out.println("Register Account----2");
                System.out.println("QUIT----------------3");

                userInt = input.getInputInt();

                // Login menu for existing accounts
                if(userInt == 1){
                    
                    System.out.println("\n\n-----------LOGIN SCREEN-----------");

                    System.out.print("\nUsername:   ");
                    un = input.getInputString();

                    System.out.print("\nPassword:   ");
                    p = input.getInputString();

                    index = stub.login(un, p);

                    // tests if account is customer or admin
                    if(p != "779988"){
                        type = 100;

                        return (type + index);
                    }
                    else{
                        type = 200;

                        return (type + index);
                    }

                    // If account not found then break out of login menu
                    if(index != -1){
                        break;
                    }
                }

                // A new user can create an account
                // password 779988 is only for admins
                else if(userInt == 2){
                    
                    System.out.println("\n\n-----------SIGN UP SCREEN-----------");

                    System.out.print("\nYour Name:   ");
                    n = input.getInputString();

                    System.out.print("\nCreate Username:   ");
                    un = input.getInputString();

                    System.out.print("\nCreate Password:   ");
                    p = input.getInputString();

                    // tests if account is customer or admin
                    if(p != "779988"){
                        type = 100;

                        return (type + index);
                    }
                    else{
                        type = 200;

                        return (type + index);
                    }

                    index = stub.addAcount(n, un, p, type);

                }
                // Quits out of the program if quit is selected
                else if(userInt == 3){
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
