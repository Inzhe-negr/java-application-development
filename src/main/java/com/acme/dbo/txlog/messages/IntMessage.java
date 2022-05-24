package com.acme.dbo.txlog.messages;

public class IntMessage implements Message {
    private int value;

    public IntMessage(int message) {
        value = message;
    }

    @Override
    public void accumulate(Message message) {
        if (isAccumulated(message)) {
            value += ((IntMessage) message).value;
        }
    }

    @Override
    public boolean isAccumulated(Message message) {
        return message instanceof IntMessage && ((IntMessage) message).value <= Integer.MAX_VALUE - value;
    }

    @Override
    public String decorate() {
        return "primitive: " + value;
    }
}
