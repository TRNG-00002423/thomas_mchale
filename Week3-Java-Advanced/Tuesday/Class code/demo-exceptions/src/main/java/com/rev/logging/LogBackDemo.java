package com.rev.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogBackDemo 
{
    private static final Logger logger = LoggerFactory.getLogger(LogBackDemo.class);
    public static void main(String[] args) {
        logger.info("Application Started....");
        try
        {
            int result =100/0;
        }
        catch (ArithmeticException e)
        {
            logger.error("An ArithmeticException has occured" + e);
        }
        finally
        {
            logger.info("Program has ended.");
        }
        

        // order of severity:
        logger.trace("Extremely Detailed");
        logger.debug("");
        logger.info("");
        logger.warn("");
        logger.error("");
    }   
}
