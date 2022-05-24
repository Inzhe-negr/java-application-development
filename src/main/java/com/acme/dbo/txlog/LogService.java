package com.acme.dbo.txlog;

import com.acme.dbo.txlog.messages.Message;

public interface LogService {
    void log(Message message);

    void flush();
}
