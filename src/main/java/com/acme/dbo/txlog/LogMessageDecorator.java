package com.acme.dbo.txlog;

import java.lang.reflect.Type;
import java.util.HashMap;

public class LogMessageDecorator {
    private static final String PRIMITIVE_SUFFIX = "primitive: ";
    private static final HashMap<Type, String> PREFIX_MAP = new HashMap<>();

    static {
        PREFIX_MAP.put(Boolean.class, PRIMITIVE_SUFFIX);
        PREFIX_MAP.put(Byte.class, PRIMITIVE_SUFFIX);
        PREFIX_MAP.put(Integer.class, PRIMITIVE_SUFFIX);
        PREFIX_MAP.put(Character.class, "char: ");
        PREFIX_MAP.put(String.class, "string: ");
        PREFIX_MAP.put(Object.class, "reference: ");
    }

    public static <T> String decorateLogData(T message) {
        String prefix = PREFIX_MAP.getOrDefault(message.getClass(), "");
        return prefix + message;
    }
}
