package com.acme.dbo.txlog.messages;

public class CharMessage extends AbstractMessage {
    private final char value;

    public CharMessage(char message) {
        value = message;
    }

    @Override
    public String decorate() {
        return "char: " + value;
    }
}
