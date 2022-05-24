package com.acme.dbo.txlog.messages;

public class CharMessage implements Message {
    private final char value;

    public CharMessage(char message) {
        value = message;
    }

    @Override
    public String decorate() {
        return "char: " + value;
    }

    @Override
    public void accumulate(Message message) {

    }

    @Override
    public boolean isAccumulated(Message message) {
        return false;
    }
}
