package com.acme.dbo.txlog.message;

public class CharMessage extends AbstractNonAccumulativeMessage {
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
