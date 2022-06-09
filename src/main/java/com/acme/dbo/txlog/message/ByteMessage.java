package com.acme.dbo.txlog.message;

public class ByteMessage extends AbstractNonAccumulativeMessage {
    private final byte value;

    public ByteMessage(byte message) {
        super("primitive: ");
        value = message;
    }

    @Override
    public String decorate() {
        return super.prefixDecorate(String.valueOf(value));
    }
}
