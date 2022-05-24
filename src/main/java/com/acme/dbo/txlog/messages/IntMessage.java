package com.acme.dbo.txlog.messages;

public class IntMessage extends AbstractMessage {
    private int value;

    public IntMessage(int message) {
        value = message;
    }

    @Override
    public String flush() {
        return "primitive: " + value;
    }

    @Override
    public String accumulate(Message message) {
        if (this.getClass() == message.getClass()) {
            IntMessage oldMessage = (IntMessage) message;
            if (oldMessage.value <= Integer.MAX_VALUE - value) {
                value += oldMessage.value;
                return null;
            }
        }
        return message.flush();
    }
}
