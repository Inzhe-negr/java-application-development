package com.acme.dbo.txlog;

import java.lang.reflect.Type;
import java.util.HashMap;

public class LogMessageDecorator {
    private static final HashMap<Type, String> MY_MAP = new HashMap<>();

    static {
        MY_MAP.put(Boolean.class, "primitive: ");
        MY_MAP.put(Byte.class, "primitive: ");
        MY_MAP.put(Integer.class, "primitive: ");
        MY_MAP.put(Character.class, "char: ");
        MY_MAP.put(String.class, "string: ");
        MY_MAP.put(Object.class, "reference: ");
    }

    public static <T> String decorateLogData(T message) {
        String prefix = MY_MAP.get(message.getClass());
        return prefix + message;
    }
}
