package com.revature;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GreeterTest 
{
    @Test
    void testGreet()
    {
        Greeter greeter = new Greeter();

        String expectedResult="Hello JIM";

        String actualResult = greeter.hello("Jim");

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
