package com.pluralsight.ui;

import com.pluralsight.models.Employee;
import org.w3c.dom.ls.LSOutput;

public class UserInterface {

    private Employee currentEmployee;
    private Console console;

    public UserInterface(){
        this.console = new Console();
    }

    public void display(){
        System.out.println("Welcome to the Northwind Manager..");
        currentEmployee = loginUser();
        System.out.println("Welcome, " + this.currentEmployee.getFirstName() + "!");

        showHomeMenu();
    }

    private Employee loginUser() {
        String s = console.promptForString("Just hit enter to login as Abdul", true);
        Employee e = new Employee(1, "Abdul", "Touray");
        return e;
    }

    private void showHomeMenu(){
        String[] menuOptions = {
                "list product category",
                "list all product",
                "list product by category",
                "list product by price",
                "list all supplier",
                "list product by supplier",
                "exit"
        };
        int userChoice = console.promptForOption(menuOptions);
        switch (userChoice) {
            case 1:
                listCategoryAll();
                break;
            case 2:
                listProductAll();
                break;
            case 3:
                listProductByCategory();
                break;
            case 4:
                listProductByPrice();
                break;
            case 5:
                listSupplierAll();
                break;
            case 6:
                listProductBySupplier();
                break;
            case 7:
                System.out.println("Exiting....");
        }
    }

    private void listCategoryAll() {
    }

    private void listProductAll() {
    }

    private void listProductByCategory() {
    }

    private void listProductByPrice() {
    }

    private void listSupplierAll() {
    }

    private void listProductBySupplier() {
    }


}
