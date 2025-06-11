package com.pluralsight;

import com.pluralsight.ui.UserInterface;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");
        UserInterface ui  = new UserInterface();

        ui.display();
    }
}