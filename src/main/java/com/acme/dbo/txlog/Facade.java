package com.acme.dbo.txlog;

import static com.acme.dbo.txlog.LogMessageDecorator.decorateLogData;

public class Facade {
    public static <T> void log(T message) {
        String logString = decorateLogData(message);
        logString(logString);
    }

    private static void logString(String message) {
        System.out.println(message);
    }
}
