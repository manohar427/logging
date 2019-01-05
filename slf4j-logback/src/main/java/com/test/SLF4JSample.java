package com.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SLF4JSample {
    private static Logger LOGGER = LoggerFactory.getLogger(SLF4JSample.class);
    public static void main(String[] args) {
        LOGGER.info("Hi, {} to {} exmaple","Welcome","Manohar");
        LOGGER.debug("Hi, {} to {} exmaple","Welcome","Manohar");
        LOGGER.error("Hi, {} to {} exmaple","Welcome","Manohar");
    }
}