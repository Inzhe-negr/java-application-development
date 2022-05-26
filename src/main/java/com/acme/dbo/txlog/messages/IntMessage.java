package com.acme.dbo.txlog.messages;

public class IntMessage extends AbstractMessage {
    private int value;

    public IntMessage(int message) {
        super("primitive: ");
        value = message;
    }

    @Override
    public void accumulate(Message message) {
        if (this.isAccumulatable(message)) {
            value += ((IntMessage) message).value;
        }
    }

    @Override
    public boolean isAccumulatable(Message message) {
        return message instanceof IntMessage && ((IntMessage) message).value <= Integer.MAX_VALUE - value;
    }

    @Override
    public String decorate() {
        return super.prefixDecorate(String.valueOf(value));
    }
}
