package com.acme.dbo.txlog.message;

public abstract class AbstractNonAccumulativeMessage extends AbstractDecoratedMessage {
    public AbstractNonAccumulativeMessage(String prefix){
        super(prefix);
    }

    @Override
    public Message accumulate(Message message) {
        return this;
    }

    @Override
    public boolean isAccumulative(Message message) {
        return false;
    }

    @Override
    public boolean isEmptyValue() {
        return false;
    }
}
