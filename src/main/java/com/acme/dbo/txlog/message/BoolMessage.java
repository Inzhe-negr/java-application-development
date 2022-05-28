package com.acme.dbo.txlog.message;

public class BoolMessage extends AbstractNonAccumulativeMessage {
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
