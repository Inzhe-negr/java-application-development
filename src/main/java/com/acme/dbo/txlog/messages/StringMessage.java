package com.acme.dbo.txlog.messages;

public class StringMessage extends CommonMessage {
    private int templatesCount;
    private final String value;

    public StringMessage(String message) {
        value = message;
        templatesCount = 1;
    }

    @Override
    public String flush() {
        String accumulatedString = templatesCount > 1 ? String.format("%s (x%s)", value, templatesCount) : value;
        return "string: " + accumulatedString;
    }

    @Override
    public String accumulate(Message message) {
        if (this.getClass() == message.getClass()) {
            StringMessage oldMessage = (StringMessage) message;
            if (value.equals(oldMessage.value)) {
                templatesCount += oldMessage.templatesCount;
                return null;
            }
        }
        return message.flush();
    }
}
