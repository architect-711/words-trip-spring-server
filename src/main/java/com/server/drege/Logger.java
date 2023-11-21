package com.server.drege;

import org.slf4j.LoggerFactory;

public class Logger {
    private static org.slf4j.Logger logger = LoggerFactory.getLogger(DregeApplication.class);

    public static void log(String message, char type) {
        switch (type) {
            case 'i': logger.info(message);
            case 'e': logger.error(message);
            case 'w': logger.warn(message);
        }
    }
}
