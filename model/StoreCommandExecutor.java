// StoreCommandExecutor.java

package model;

// Class that executes all of the commands from the command pattern
public class StoreCommandExecutor{
    
    public StoreCommandExecutor(){

    }

    // executes the given command
    public void executeCommand(Command c){

        c.execute();
    }

}
