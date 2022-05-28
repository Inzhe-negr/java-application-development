package com.acme.dbo.txlog.message;

public class DefaultMessage extends AbstractNonAccumulativeMessage {
    public DefaultMessage() {
        super(null);
    }

    @Override
    public String decorate() {
        return null;
    }
}
