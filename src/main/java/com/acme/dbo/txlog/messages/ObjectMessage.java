package com.acme.dbo.txlog.messages;

public class ObjectMessage extends CommonMessage {
    private final Object value;

    public ObjectMessage(Object message) {
        value = message;
    }

    @Override
    public String decorate() {
        return "reference: " + value;
    }
}
