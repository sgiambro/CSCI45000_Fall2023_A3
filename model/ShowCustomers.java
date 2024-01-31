// ShowCustomers.java

package model;

// Child class for the command pattern
// Command that shows all of the customers in the store
public class ShowCustomers extends Command{
    
    Users customers[];
    int customerNum;

    public ShowCustomers(Users c[], int cn){

        customers = c;
        custNum = cn;
    }

    // Method  overrides the parent execute()
    public void execute(){

        for(int i = 0; i<customerNum; i++){

            System.out.println("Account Number:        " + i);
            System.out.println("Account Holder Name:   " + customers[i].getName());
            System.out.println("Account Username:      " + customers[i].getUsername());
            System.out.println("Account Password:      " + customers[i].getPassword());
            System.out.println("------------------------\n");

        }
    }

}
