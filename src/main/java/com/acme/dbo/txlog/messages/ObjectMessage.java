package com.acme.dbo.txlog.messages;

public class ObjectMessage extends AbstractMessage {
    private final Object value;

    public ObjectMessage(Object message) {
        super("reference: ");
        value = message;
    }

    @Override
    public String decorate() {
        return super.prefixDecorate(String.valueOf(value));
    }
}
