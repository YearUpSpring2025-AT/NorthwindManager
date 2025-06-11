package com.pluralsight.ui;

import com.pluralsight.data.NorthwindDataManager;
import com.pluralsight.models.Category;
import com.pluralsight.models.Employee;
import com.pluralsight.models.Product;
import org.w3c.dom.ls.LSOutput;

import java.util.List;

public class UserInterface {

    private Employee currentEmployee;
    private Console console;
    private NorthwindDataManager dataManager;

    public UserInterface(NorthwindDataManager dataManager){
        this.console = new Console();
        this.dataManager = dataManager;
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
        while (true) {
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
                    System.exit(0);

            }
        }

    }

    private void listCategoryAll() {
        List<Category> categories = dataManager.getCategories();
        if (categories.stream().count() <= 0) {
            System.out.println("Category not found..");
        } else {
//            for (Category c : categories) {
//                System.out.println(c.getCategoryName());
//            }
            categories.forEach(c -> System.out.println(c.getCategoryName()));
        }
    }

    private void listProductAll() {
        List<Product> categories = dataManager.getProducts();
        if (categories.stream().count() <= 0) {
            System.out.println("Category not found..");
        } else {
//            for (Category c : categories) {
//                System.out.println(c.getCategoryName());
//            }
            categories.forEach(p -> System.out.println(p));
        }
    }

    private void listProductByCategory() {
    }

    private void listProductByPrice() {
        double minPrice = console.
    }

    private void listSupplierAll() {
    }

    private void listProductBySupplier() {
    }


}
