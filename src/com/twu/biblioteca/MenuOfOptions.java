package com.twu.biblioteca;

import java.util.HashMap;
import java.util.Map;

public class MenuOfOptions {
    // Storage of user options
    Map<String, Command> options = new HashMap<String, Command>();

    // Set up options for user on menu
    public void setCommand(String s, Command option){
        options.put(s,option);
    }

    // User has chosen an option, so we execute
    public void optionChosen(String choice){
        options.get(choice).execute();
    }

}
