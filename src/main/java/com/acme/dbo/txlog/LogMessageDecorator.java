package com.acme.dbo.txlog;

public class LogMessageDecorator {
    private static final String PRIMITIVE_SUFFIX = "primitive: ";
    private static final String CHAR_SUFFIX = "char: ";
    private static final String STRING_SUFFIX = "string: ";
    private static final String REFERENCE_SUFFIX = "reference: ";

    static String decorate(Boolean message) {
        return decoratePrimitive(message.toString());
    }

    static String decorate(Byte message) {
        return decoratePrimitive(message.toString());
    }

    static String decorate(Integer message) {
        return decoratePrimitive(message.toString());
    }

    static String decorate(Character message) {
        return CHAR_SUFFIX + message;
    }

    static String decorate(String message) {
        return STRING_SUFFIX + message;
    }

    static String decorate(Object message) {
        return REFERENCE_SUFFIX + message;
    }

    private static String decoratePrimitive(String message) {
        return PRIMITIVE_SUFFIX + message;
    }
}
