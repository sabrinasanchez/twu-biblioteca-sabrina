package com.twu.biblioteca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Login {
    static String customerLibraryNumber;

    // Customers use a Library number: xxx-xxxx and password to login
    public static boolean validateLibraryNumber(String number) {
        String pattern = "^(.{3})([-])(.{4})$";

        if(number.matches(pattern)){
            return true;
        }
        return false;
    }

    // Function for login run
    public boolean loginApp() throws IOException {
        Menu menu = new Menu();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(menu.getHeader());

        while(true){
            System.out.println("Enter library number: ");
            customerLibraryNumber = reader.readLine();

            if(validateLibraryNumber(customerLibraryNumber)){
                System.out.println("Enter password: ");
                String inputPassword = reader.readLine();

                break;
            }
            else{
                System.out.println("Invalid Library Number! Try again (e.g. xxx-xxxx)");
            }
        }
        return true;
    }

}
