package com.acme.dbo.txlog.messages;

public class BoolMessage implements Message {
    private final boolean value;

    public BoolMessage(boolean message) {
        value = message;
    }

    @Override
    public String decorate() {
        return "primitive: " + value;
    }

    @Override
    public void accumulate(Message message) {

    }

    @Override
    public boolean isAccumulated(Message message) {
        return false;
    }
}
