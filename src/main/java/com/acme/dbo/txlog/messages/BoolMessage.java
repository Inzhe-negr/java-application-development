package com.acme.dbo.txlog.messages;

public class BoolMessage extends AbstractMessage {
    private final boolean value;

    public BoolMessage(boolean message) {
        value = message;
    }

    @Override
    public String decorate() {
        return "primitive: " + value;
    }
}
