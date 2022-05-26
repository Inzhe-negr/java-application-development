package com.acme.dbo.txlog.messages;

public class CharMessage extends AbstractMessage {
    private final char value;

    public CharMessage(char message) {
        super("char: ");
        value = message;
    }

    @Override
    public String decorate() {
        return super.prefixDecorate(String.valueOf(value));
    }
}
