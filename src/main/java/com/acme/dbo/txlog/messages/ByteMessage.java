package com.acme.dbo.txlog.messages;

public class ByteMessage extends AbstractMessage {
    private final Byte value;

    public ByteMessage(Byte message) {
        super("primitive: ");
        value = message;
    }

    @Override
    public String decorate() {
        return super.prefixDecorate(String.valueOf(value));
    }
}
