package com.klab.lai;

import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.Priority;  
//import org.apache.log4j.BasicConfigurator;
public class HelloWorld{
    static Logger logger = Logger.getLogger(HelloWorld.class.getName());
    public static void main(String [] args){
//        BasicConfigurator.configure();
        logger.info("start main method.");    
        System.out.println("hello klab com lai world");
        logger.info("Exiting main method.");    

    }
}
