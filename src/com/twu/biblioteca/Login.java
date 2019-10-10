package com.twu.biblioteca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Login {

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
            String inputNumber = reader.readLine();

            if(validateLibraryNumber(inputNumber)){
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
