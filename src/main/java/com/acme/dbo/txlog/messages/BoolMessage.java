package com.acme.dbo.txlog.messages;

public class BoolMessage extends CommonMessage {
    private final boolean value;

    public BoolMessage(boolean message) {
        value = message;
    }

    @Override
    public String decorate() {
        return "primitive: " + value;
    }
}
