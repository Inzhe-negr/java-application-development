package com.acme.dbo.txlog;

import com.acme.dbo.txlog.messages.Message;

import java.util.Objects;

public class ConsoleLogService implements LogService {
    private Message accumulatedMessage = null;

    @Override
    public void log(Message message) {
        if (Objects.nonNull(accumulatedMessage)) {
            print(message.accumulate(accumulatedMessage));
        }
        print(message.decorate());
        accumulatedMessage = message;
    }

    @Override
    public void flush() {
        print(accumulatedMessage.flush());
        accumulatedMessage = null;
    }

    private void print(String decoratedMessage) {
        if (Objects.nonNull(decoratedMessage)) {
            System.out.println(decoratedMessage);
        }
    }
}
