// Command.java

package model;

// Parent class for the command pattern comamnds
public class Command {
    

    public Command(){

    }

    // Method that children will override
    public void execute(){

        cout << "No commands created" << endl;
    }

}
