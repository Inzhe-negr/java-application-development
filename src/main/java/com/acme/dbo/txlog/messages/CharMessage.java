package com.acme.dbo.txlog.messages;

public class CharMessage extends CommonMessage {
    private final char value;

    public CharMessage(char message) {
        value = message;
    }

    @Override
    public String decorate() {
        return "char: " + value;
    }
}
