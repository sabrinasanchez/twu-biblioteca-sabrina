package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;

public class LoginTest {

    @Test
    public void shouldReturnFalseForInvalidNumber(){
        Login login = new Login(null);
        boolean result = login.validateLibraryNumber("f3g3j9p");
        assertEquals(false,result);
    }

    @Test
    public void shouldReturnTrueForInvalidNumber(){
        Login login = new Login(null);
        boolean result = login.validateLibraryNumber("f3g-3jlp");
        assertEquals(true,result);
    }

}