package com.acme.dbo.txlog.message;

public abstract class AbstractDecoratedMessage implements Message {
    private final String prefix;

    protected AbstractDecoratedMessage(String prefix) {
        this.prefix = prefix;
    }

    protected String prefixDecorate(String value) {
        return prefix + value;
    }
}
