package com.dsilva.log4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
	
	// IMP its static in nature so if you have multiple threads running 
	// they will share the the same log object
	private static Logger log=LogManager.getLogger(App.class.getName());
	
    public static void main( String[] args )
    {
    	
    	log.debug("hello i am debug");
    	log.info("hello i am info");
    	log.error("hello i am error");
    	log.fatal("hello i am fatal");
        System.out.println( "Hello World!" );
    }
}
