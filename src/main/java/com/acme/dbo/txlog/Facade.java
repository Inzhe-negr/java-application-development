package com.acme.dbo.txlog;

import com.acme.dbo.txlog.message.*;
import com.acme.dbo.txlog.saver.ConsoleSaver;
import com.acme.dbo.txlog.saver.LogSaveException;

public class Facade {
    private static final LogService logService = new LogService(new ConsoleSaver());

    public static void log(boolean message) throws LogSaveException {
        logService.log(new BoolMessage(message));
    }

    public static void log(byte message) throws LogSaveException {
        logService.log(new ByteMessage(message));
    }

    public static void log(int message) throws LogSaveException {
        logService.log(new IntMessage(message));
    }

    public static void log(char message) throws LogSaveException {
        logService.log(new CharMessage(message));
    }

    public static void log(String message) throws LogSaveException {
        logService.log(new StrMessage(message));
    }

    public static void log(Object message) throws LogSaveException {
        logService.log(new ObjMessage(message));
    }

    public static void flush() throws LogSaveException {
        logService.flush();
    }
}
