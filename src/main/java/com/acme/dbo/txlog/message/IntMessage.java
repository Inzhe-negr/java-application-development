package com.acme.dbo.txlog.message;

public class IntMessage extends AbstractDecoratedMessage {
    private final int value;

    public IntMessage(int message) {
        super("primitive: ");
        value = message;
    }

    @Override
    public Message accumulate(Message message) {
        return isAccumulative(message)
                ? new IntMessage(this.value + getIntMessageValue(message))
                : this;
    }

    @Override
    public boolean isAccumulative(Message message) {
        return message instanceof IntMessage && getIntMessageValue(message) <= Integer.MAX_VALUE - value;
    }

    @Override
    public String decorate() {
        return super.prefixDecorate(String.valueOf(value));
    }

    private int getIntMessageValue(Message message) {
        return ((IntMessage) message).value;
    }
}
