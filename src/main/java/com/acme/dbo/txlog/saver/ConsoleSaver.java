package com.acme.dbo.txlog.saver;

import java.util.Objects;

public class ConsoleSaver implements LogSaver {
    @Override
    public void save(String decoratedMessage) {
        if (Objects.nonNull(decoratedMessage)) {
            System.out.println(decoratedMessage);
        }
    }
}
