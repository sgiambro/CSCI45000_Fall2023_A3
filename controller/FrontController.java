//FrontController.java

package controller;

// Tells the dispatcher what views to get and display
// Part of the Front controller pattern
public class FrontController {

    Dispatcher dispatcher;
    boolean isAdmin;

    public FrontController(StoreOp stub){

        dispatcher = new Dispatcher(stub);
    }

    // Sends dispatcher to get login menu
    public void authenticateUser(){

        dispatcher.dispatch(1);
    }

    // Sends dispatcher to get either customer or admin menu
    // depending on the users login info
    public void dispatchRequest(){

        dispatcher.dispatch(2);
    }
}

