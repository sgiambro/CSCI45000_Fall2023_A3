Overview:

    common:
    
        StoreOp - contains the remote interface that the Store class is bases off off
    
    controller:
        
        Dispatcher - gets the requested view (Front Controller Pattern)
        FrontController - tells the dispatcher what view to get and show the user (Front Controller Pattern)
        FrontControllerPatternDriver - the driver class which the client runs to access the online store (Front Controller Pattern)
        InputValidator - gets user input and verifies that it is valid

    model:

        Account - parent class of the Users and Administrators classes which holds universal account information
        Administrators - in charge of the stors operations and are identified by password "779988"
        Users - the store's customers that can add items to their cart, buy their cart, and add money
        Items - the parent class to the products that the store sells (Factory Pattern)
        FoodItem - child of Items and makes a generic food product for the store (Factory Pattern)
        ToolItem - child of Items and makes a generic tool product for the store (Factory Pattern)
        ElectronicItem - child of Items and makes a generic electronic product for the store (Factory Pattern)
        ClothesItem - child of Items and makes a generic clothing product for the store (Factory Pattern)
        DecorationItem - child of Items and makes a generic decoration product for the store (Factory Pattern)
        ItemFactory - makes the requested item for the store's inventory (Factory Pattern)
        Store - the main class that incorperates all the other model classes to make a functioning store
        Command - the parent class to the commands that the store uses (Command Pattern)
        ShowCustomers - the child of the command class and shows the user all the store's customers (Command Pattern)
        ShowAdmins - the child of the command class and shows the user all the store's admins (Command Pattern)
        ShowInventory - the child of the command class and shows the user all the store's items they sell (Command Pattern)
        StoreCommandExecutor - gets a command request from the store and executes it (Command Pattern)
        RemoteStoreServer - used to create the server which the clients (AKA customers & admins) will use to access the store object

    view:

        AdminView - contains the UI for the admin users
        CustomerView - contains the UI for the customers
        LoginView - contains the UI for the users to login and access the store

-------------------------------------------------------------------------------------------------------------------------------------

How To Run:

    1) make clean

    2) make

    3) kill any running rmiregistry (kill -9 <pid>)

    4) make setup

    5) make runServer (in-csci-rrpc01.cs.iupui.edu)

    6) make runClient (in-csci-rrpc02.cs.iupui.edu) (or any other rrpc other than 01)
