package com.acme.dbo.txlog.messages;

public class BoolMessage extends AbstractMessage {
    private final boolean value;

    public BoolMessage(boolean message) {
        super("primitive: ");
        value = message;
    }

    @Override
    public String decorate() {
        return super.prefixDecorate(String.valueOf(value));
    }
}
