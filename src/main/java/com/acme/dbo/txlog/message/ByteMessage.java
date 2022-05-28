package com.acme.dbo.txlog.message;

public class ByteMessage extends AbstractNonAccumulativeMessage {
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
