package com.acme.dbo.txlog.saver;

public class LogSaveException extends Exception {
    public LogSaveException(String message) {
        super(message);
    }
    public LogSaveException(String message, Exception e) {
        super(message, e);
    }
}
