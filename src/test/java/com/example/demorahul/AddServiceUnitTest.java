package com.example.demorahul;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AddServiceUnitTest {

    private AddService addService;

    @Before
    public void setUp() throws Exception {
        addService = new AddService();
    }

    @Test
    public void name() {
        Result add = addService.add(1, 2);
        Result expected = new Result();
        expected.setA(1);
        expected.setB(2);
        expected.setResult(3);
        Assert.assertEquals(expected,add);
    }

}