package com.acme.dbo.txlog.my;

import com.acme.dbo.txlog.Facade;
import com.acme.dbo.txlog.SysoutCaptureAndAssertionAbility;
import com.acme.dbo.txlog.saver.LogSaveException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

public class MyTests implements SysoutCaptureAndAssertionAbility {
    //region given
    @Before
    public void setUpSystemOut() {
        resetOut();
        captureSysout();
    }

    @After
    public void tearDown() {
        resetOut();
    }
    //endregion


    @Test(expected = LogSaveException.class)
    public void shouldGetErrorWhenMessageIsNull() throws LogSaveException {
        //region when
        Facade.log(null);
        Facade.flush();
        //endregion
    }
}
