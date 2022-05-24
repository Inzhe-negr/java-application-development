package com.acme.dbo.txlog;

import com.acme.dbo.txlog.messages.*;

public class Facade {
    private static final LogService logService = new ConsoleLogService();

    public static void log(boolean message) {
        logService.log(new BoolMessage(message));
    }

    public static void log(Byte message) {
        logService.log(new ByteMessage(message));
    }

    public static void log(Integer message) {
        logService.log(new IntMessage(message));
    }

    public static void log(char message) {
        logService.log(new CharMessage(message));
    }

    public static void log(String message) {
        logService.log(new StringMessage(message));
    }

    public static void log(Object message) {
        logService.log(new ObjectMessage(message));
    }

    public static void flush() {
        logService.flush();
    }
}
