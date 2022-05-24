package com.acme.dbo.txlog.messages;

public class ByteMessage extends CommonMessage {
    private final Byte value;

    public ByteMessage(Byte message) {
        value = message;
    }

    @Override
    public String decorate() {
        return "primitive: " + value;
    }
}
