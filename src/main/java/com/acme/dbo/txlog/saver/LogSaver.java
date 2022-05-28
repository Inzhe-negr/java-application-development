package com.acme.dbo.txlog.saver;

public interface LogSaver {
    void save(String decoratedMessage);
}
