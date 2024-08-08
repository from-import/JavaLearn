package com.xxx.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogbackDemo {
    public static final Logger LOGGER = LoggerFactory.getLogger("LogbackDemo.class");


    public static void main(String[] args) {

        try{
            System.out.println("hello world");
            LOGGER.debug("main started");

        }
        catch (Exception c){
            System.out.println(c);
        }
    }

}
