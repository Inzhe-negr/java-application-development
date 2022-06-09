package com.acme.dbo.txlog;

import com.acme.dbo.txlog.message.DefaultMessage;
import com.acme.dbo.txlog.message.Message;
import com.acme.dbo.txlog.saver.LogSaveException;
import com.acme.dbo.txlog.saver.LogSaver;

public class LogService {
    private final LogSaver logSaver;
    private Message accumulatedMessage = new DefaultMessage();

    public LogService(LogSaver logSaver) {
        this.logSaver = logSaver;
    }

    public void log(Message message) throws LogSaveException {
        if (accumulatedMessage.isAccumulative(message)) {
            accumulatedMessage = accumulatedMessage.accumulate(message);
        } else {
            flush(message);
        }
    }

    public void flush() throws LogSaveException {
        flush(new DefaultMessage());
    }

    private void flush(Message message) throws LogSaveException {
        try {
            if (!(accumulatedMessage instanceof DefaultMessage)) {
                logSaver.save(accumulatedMessage);
            }
        } catch (Exception e) {
            throw new LogSaveException("My exception raised", e);
        } finally {
            accumulatedMessage = message;
        }
    }
}
