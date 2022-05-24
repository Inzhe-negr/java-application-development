package com.acme.dbo.txlog.messages;

public class CommonMessage implements Message{
    @Override
    public String decorate() {
        return null;
    }

    @Override
    public String flush() {
        return null;
    }

    @Override
    public String accumulate(Message message) {
        if (this.getClass() != message.getClass()) {
            return message.flush();
        }
        return null;
    }
}
