package com.acme.dbo.txlog;

import java.util.Objects;

import static com.acme.dbo.txlog.LogMessageDecorator.decorate;

public class Facade {
    private static Integer integerSummary = null;
    private static int stringCount = 0;
    private static String stringTemplate = null;

    public static void log(Boolean message) {
        flush();
        String logString = decorate(message);
        logString(logString);
    }

    public static void log(Byte message) {
        flush();
        String logString = decorate(message);
        logString(logString);
    }

    public static void log(Integer integer) {
        if (integerSummary == null || integerSummary > Integer.MAX_VALUE - integer) {
            flush();
            integerSummary = integer;
        } else {
            integerSummary += integer;
        }
    }

    public static void log(Character message) {
        flush();
        String logString = decorate(message);
        logString(logString);
    }

    public static void log(String message) {
        if (stringTemplate != null && stringTemplate.equals(message)) {
            stringCount++;
        } else {
            flush();
            stringTemplate = message;
            stringCount = 1;
        }
    }

    public static void log(Object message) {
        flush();
        String logString = decorate(message);
        logString(logString);
    }

    public static void flush() {
        flushString();
        flushInteger();
    }

    private static void flushString() {
        if (stringTemplate != null) {
            String stringWithCount = stringCount > 1 ? stringTemplate + " (x" + stringCount + ")" : stringTemplate;
            String logString = decorate(stringWithCount);
            logString(logString);
            stringTemplate = null;
            stringCount = 0;
        }
    }

    private static void flushInteger() {
        if (integerSummary != null) {
            String logString = decorate(integerSummary);
            logString(logString);
            integerSummary = null;
        }
    }

    private static void logString(String message) {
        System.out.println(message);
    }
}
