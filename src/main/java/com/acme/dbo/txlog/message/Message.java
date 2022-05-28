package com.acme.dbo.txlog.message;

public interface Message {
    String decorate();
    Message accumulate(Message message);
    boolean isAccumulative(Message message);
}
