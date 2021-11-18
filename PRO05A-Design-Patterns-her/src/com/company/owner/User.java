package com.company.owner;

public class User extends Owner {

    // Methods
    public void drive(){
        vehicles.firstElement().drive();
    }
    @Override
    public void printList(){
        System.out.println("---------------------------\n" +
                            "List of User:");
        super.printList();
    }
}
