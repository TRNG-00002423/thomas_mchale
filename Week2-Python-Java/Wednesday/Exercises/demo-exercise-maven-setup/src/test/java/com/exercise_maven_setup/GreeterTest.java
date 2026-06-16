package com.exercise_maven_setup;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GreeterTest 
{
    @Test
    void testGreet()
    {
        Greeter greeter = new Greeter();

        String expectedResult="Hello, Jim";

        String actualResult = greeter.hello("Jim");

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void testGreet_Blank_Input()
    {
        Greeter greeter = new Greeter();
 
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            greeter.hello(""); 
        });
    }
}
