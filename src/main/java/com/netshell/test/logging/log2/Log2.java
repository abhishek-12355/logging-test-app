package com.netshell.test.logging.log2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Log2 {
    private static final Logger LOGGER = LoggerFactory.getLogger(Log2.class);

    public static void log() {
        LOGGER.info("Log text from Log2");
    }

}
