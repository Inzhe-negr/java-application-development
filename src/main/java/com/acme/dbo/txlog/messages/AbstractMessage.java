package com.acme.dbo.txlog.messages;

public abstract class AbstractMessage implements Message {
    private String prefix;

    protected AbstractMessage(String prefix) {
        this.prefix = prefix;
    }

    protected String prefixDecorate(String value) {
        return prefix + value;
    }

    @Override
    public void accumulate(Message message) {
    }

    @Override
    public boolean isAccumulatable(Message message) {
        return false;
    }
}
