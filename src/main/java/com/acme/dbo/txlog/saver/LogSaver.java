package com.acme.dbo.txlog.saver;

import com.acme.dbo.txlog.message.Message;

public interface LogSaver {
    void save(Message message) throws LogSaveException;
}
