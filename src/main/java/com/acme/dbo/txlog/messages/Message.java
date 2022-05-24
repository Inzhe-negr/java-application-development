package com.acme.dbo.txlog.messages;

public interface Message {
    String decorate();

    String flush();

    String accumulate(Message message);
}
