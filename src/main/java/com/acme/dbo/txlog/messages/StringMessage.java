package com.acme.dbo.txlog.messages;

public class StringMessage implements Message {
    private int templatesCount;
    private final String value;

    public StringMessage(String message) {
        value = message;
        templatesCount = 1;
    }

    @Override
    public String decorate() {
        String accumulatedString = templatesCount > 1 ? String.format("%s (x%s)", value, templatesCount) : value;
        return "string: " + accumulatedString;
    }

    @Override
    public void accumulate(Message message) {
        if (isAccumulated(message)) {
            templatesCount += ((StringMessage) message).templatesCount;
        }
    }

    @Override
    public boolean isAccumulated(Message message) {
        return message instanceof StringMessage && value.equals(((StringMessage) message).value);
    }

}
