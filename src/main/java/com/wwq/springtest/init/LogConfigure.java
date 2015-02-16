/*
* Copyright (C) 2006-2015 Tuniu All rights reserved
* Author: wangweiqing
* Date: 2015/2/16
* Description:
*/

package com.wwq.springtest.init;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.joran.JoranConfigurator;
import ch.qos.logback.core.joran.spi.JoranException;
import org.slf4j.LoggerFactory;
import org.springframework.util.ResourceUtils;

import java.io.FileNotFoundException;
import java.net.URL;

public class LogConfigure {
    public static void registLogConfiguration(String logConfigLocation)
            throws FileNotFoundException, JoranException
    {
        //String resolvedLocation = SystemPropertyUtils.resolvePlaceholders(logConfigLocation);
        if (logConfigLocation.toLowerCase().endsWith(".xml")) {
            URL url = ResourceUtils.getURL(logConfigLocation);
            LoggerContext loggerContext = (LoggerContext) LoggerFactory.getILoggerFactory();
            loggerContext.reset();
            JoranConfigurator joranConfigurator = new JoranConfigurator();
            joranConfigurator.setContext(loggerContext);
            joranConfigurator.doConfigure(url);
        }
    }
}
