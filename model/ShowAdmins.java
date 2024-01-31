// ShowAdmins.java

package model;

// Child class for the command pattern
// Command that shows all of the admins in the store
public class ShowAdmins extends Command{
    
    Administrators admins[];
    int adminNum;

    public ShowAdmins(Users a[], int an){

        admins = a;
        adminNum = an;
    }

    // Method  overrides the parent execute()
    public void execute(){

        for(int i = 0; i<adminNum; i++){

            System.out.println("Account Number:        " + i);
            System.out.println("Account Holder Name:   " + admins[i].getName());
            System.out.println("Account Username:      " + admins[i].getUsername());
            System.out.println("Account Password:      " + admins[i].getPassword());
            System.out.println("------------------------\n");

        }
    }

}
