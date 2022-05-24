package com.acme.dbo.txlog.messages;

public interface Message {
    String decorate();

    void accumulate(Message message);

    boolean isAccumulated(Message message);
}
