package com.netshell.test.logging.log1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Log1 {
    private static final Logger LOGGER = LoggerFactory.getLogger(Log1.class);

    public static void log() {
        LOGGER.info("Log text from Log1");
    }

}
