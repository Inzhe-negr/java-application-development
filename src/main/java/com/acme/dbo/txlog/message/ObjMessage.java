package com.acme.dbo.txlog.message;

import java.util.Objects;

public class ObjMessage extends AbstractNonAccumulativeMessage {
    private final Object value;

    public ObjMessage(Object message) {
        super("reference: ");
        value = message;
    }

    @Override
    public String decorate() {
        return super.prefixDecorate(String.valueOf(value));
    }

    @Override
    public boolean isEmptyValue() {
        return Objects.isNull(value);
    }
}
