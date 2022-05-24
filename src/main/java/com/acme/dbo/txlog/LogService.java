package com.acme.dbo.txlog;

import com.acme.dbo.txlog.messages.DefaultMessage;
import com.acme.dbo.txlog.messages.Message;
import com.acme.dbo.txlog.printers.ConsolePrinter;
import com.acme.dbo.txlog.printers.LogPrinter;

public class LogService {
    private final LogPrinter printer = new ConsolePrinter();
    private Message accumulatedMessage = new DefaultMessage();

    public void log(Message message) {
        if (accumulatedMessage.isAccumulated(message)) {
            accumulatedMessage.accumulate(message);
        } else {
            flush(message);
        }
    }

    public void flush() {
        flush(new DefaultMessage());
    }

    private void flush(Message message) {
        if (!(accumulatedMessage instanceof DefaultMessage)) {
            printer.print(accumulatedMessage.decorate());
        }
        accumulatedMessage = message;
    }
}
