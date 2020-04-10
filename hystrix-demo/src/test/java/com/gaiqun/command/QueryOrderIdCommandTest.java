package com.gaiqun.command;

import org.junit.Test;

/**
 * @author gaiqun
 * @date 2020/1/20
 */
public class QueryOrderIdCommandTest {
    @Test
    public void testQueryOrderId() {
        Integer r = new QueryOrderIdCommand().execute();
        System.out.println(r);
    }
}
