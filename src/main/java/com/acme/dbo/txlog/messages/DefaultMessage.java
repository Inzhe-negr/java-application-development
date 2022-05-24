package com.acme.dbo.txlog.messages;

public class DefaultMessage implements Message {
    @Override
    public String decorate() {
        return null;
    }

    @Override
    public void accumulate(Message message) {

    }

    @Override
    public boolean isAccumulated(Message message) {
        return false;
    }
}
