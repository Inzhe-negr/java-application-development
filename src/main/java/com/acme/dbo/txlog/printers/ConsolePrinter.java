package com.acme.dbo.txlog.printers;

public class ConsolePrinter implements LogPrinter {
    @Override
    public void print(String decoratedMessage) {
        System.out.println(decoratedMessage);
    }
}
