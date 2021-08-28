package com.codedifferently;

import org.junit.Assert;
import org.junit.Test;

public class SanboxTest {

    @Test
    public void welcomeMessageTest(){
        // given
        String expected = "Wutang Forever";

        // when
        String actual = Sandbox.welcomeMessage();

        //then
        Assert.assertEquals(expected, actual);
    }
}
