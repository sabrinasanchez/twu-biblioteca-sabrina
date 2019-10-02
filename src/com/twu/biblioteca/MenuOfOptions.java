package com.twu.biblioteca;

import java.util.HashMap;
import java.util.Map;

public class MenuOfOptions {
    // Storage of user options
    Map<String, Command> options = new HashMap<String, Command>();

    public void optionChosen(String choice){
        options.get(choice).execute();
    }

}
