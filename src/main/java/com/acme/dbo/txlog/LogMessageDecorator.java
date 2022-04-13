package com.acme.dbo.txlog;

import java.lang.reflect.Type;
import java.util.HashMap;

public class LogMessageDecorator {
    private static final HashMap<Type, String> PREFIX_MAP = new HashMap<>();

    static {
        PREFIX_MAP.put(Boolean.class, "primitive: ");
        PREFIX_MAP.put(Byte.class, "primitive: ");
        PREFIX_MAP.put(Integer.class, "primitive: ");
        PREFIX_MAP.put(Character.class, "char: ");
        PREFIX_MAP.put(String.class, "string: ");
        PREFIX_MAP.put(Object.class, "reference: ");
    }

    public static <T> String decorateLogData(T message) {
        String prefix = PREFIX_MAP.getOrDefault(message.getClass(), "");
        return prefix + message;
    }
}
