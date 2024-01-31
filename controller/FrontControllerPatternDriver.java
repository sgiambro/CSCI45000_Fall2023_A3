//FrontControllerPatternDriver.java

package controller;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.io.*;
import common.StoreOp;

// This is the class which the clients use to access the remote store
// Part of the Front controller pattern
public class FrontControllerPatternDriver {
    
    StoreOp stub;

    // Sets up connection to remote server that the accounts use to access the store
    public static void main(String[] args){
        try{
            stub = (StoreOp)Naming.lookup("//in-csci-rrpc01.cs.iupui.edu:1234/Store");
            System.out.println("---Client calling server---");
        }
        catch(Exception e){

            System.out.println("Client err:" + e.getMessage());
            e.printStackTrace();
        }

        FrontController openStore = new FrontController(stub);

        // Determins if user is admin or customer
        openStore.authenticateUser();

        // Givers user their specific menu
        openStore.dispatchRequest();
    }

}

