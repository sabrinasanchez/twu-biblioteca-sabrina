package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;

public class LoginTest {

    @Test
    public void shouldReturnFalseForInvalidNumber(){
        Login login = new Login();
        boolean result = login.validateLibraryNumber("f3g3jlp");
        assertEquals(false,result);
    }

    @Test
    public void shouldReturnTrueForInvalidNumber(){
        Login login = new Login();
        boolean result = login.validateLibraryNumber("f3g-3jlp");
        assertEquals(true,result);
    }

}