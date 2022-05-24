package com.acme.dbo.txlog.messages;

public class ByteMessage implements Message {
    private final Byte value;

    public ByteMessage(Byte message) {
        value = message;
    }

    @Override
    public String decorate() {
        return "primitive: " + value;
    }

    @Override
    public void accumulate(Message message) {

    }

    @Override
    public boolean isAccumulated(Message message) {
        return false;
    }
}
