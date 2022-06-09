package com.acme.dbo.txlog.message;

import java.util.Objects;

public class StrMessage extends AbstractDecoratedMessage {
    private final int templatesCount;
    private final String value;

    public StrMessage(String message) {
        this(message, 1);
    }

    public StrMessage(String message, int templatesCount) {
        super("string: ");
        value = message;
        this.templatesCount = templatesCount;
    }

    @Override
    public String decorate() {
        String accumulatedString = templatesCount > 1 ? String.format("%s (x%s)", value, templatesCount) : value;
        return super.prefixDecorate(String.valueOf(accumulatedString));
    }

    @Override
    public boolean isEmptyValue() {
        return Objects.isNull(value);
    }

    @Override
    public Message accumulate(Message message) {
        return isAccumulative(message)
                ? new StrMessage(value, templatesCount + ((StrMessage) message).templatesCount)
                : this;
    }

    @Override
    public boolean isAccumulative(Message message) {
        return message instanceof StrMessage && value.equals(((StrMessage) message).value);
    }

}
