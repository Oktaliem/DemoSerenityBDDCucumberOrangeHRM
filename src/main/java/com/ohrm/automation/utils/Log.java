package com.ohrm.automation.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Log {
    private static Logger logger = LoggerFactory.getLogger(Log.class);
    public Log(){}
    public void info(String message){logger.info(message);}
    public void error(String message){logger.error(message);
    }

}
