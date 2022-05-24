package com.acme.dbo.txlog.messages;

public class ObjectMessage implements Message {
    private final Object value;

    public ObjectMessage(Object message) {
        value = message;
    }

    @Override
    public String decorate() {
        return "reference: " + value;
    }

    @Override
    public void accumulate(Message message) {

    }

    @Override
    public boolean isAccumulated(Message message) {
        return false;
    }
}
