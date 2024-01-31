//Dispatcher.java

package controller;

// Class that Front controller pattern uses to get needed views
// Part of the Front controller pattern
public class Dispatcher {

    CustomerView customerView;
    AdimnView adimnView;
    LoginView loginView;
    InputValidator input;
    StoreOp stub;

    int ident;

    public Dispatcher(StoreOp stub){

        customerView = new CustomerView();
        adimnView = new AdimnView();
        loginView = new LoginView();

        input = new InputValidator();
        this.stub = stub;
    }

    // Gets the needed view
    public void dispatch(int menu){

        if(menu == 1){

            ident = loginView.loginMenu(stub, input);
        }
        else if(menue == 2){

            if(ident/100 == 1){

                customerView.customerMenu(stub, input, ident);
            }
            else if(ident/100 == 2){

                adimnView.adminMenu(stub, input, ident);
            }
        }
    }
}

