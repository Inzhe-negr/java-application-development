package com.acme.dbo.txlog.messages;

public class StringMessage extends AbstractMessage {
    private int templatesCount;
    private final String value;

    public StringMessage(String message) {
        super("string: ");
        value = message;
        templatesCount = 1;
    }

    @Override
    public String decorate() {
        String accumulatedString = templatesCount > 1 ? String.format("%s (x%s)", value, templatesCount) : value;
        return super.prefixDecorate(String.valueOf(accumulatedString));
    }

    @Override
    public void accumulate(Message message) {
        if (isAccumulatable(message)) {
            templatesCount += ((StringMessage) message).templatesCount;
        }
    }

    @Override
    public boolean isAccumulatable(Message message) {
        return message instanceof StringMessage && value.equals(((StringMessage) message).value);
    }

}
