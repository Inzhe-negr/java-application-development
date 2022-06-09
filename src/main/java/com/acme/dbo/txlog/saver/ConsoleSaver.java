package com.acme.dbo.txlog.saver;

import com.acme.dbo.txlog.message.Message;

public class ConsoleSaver implements LogSaver {
    @Override
    public void save(Message message) throws LogSaveException {
        if (message.isEmptyValue()) {
            throw new LogSaveException("Message is null!");
        } else {
            System.out.println(message.decorate());
        }
    }
}
