package com.gaiqun.command;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;

/**
 * @author gaiqun
 * @date 2020/1/20
 */
public class QueryOrderIdCommand extends HystrixCommand<Integer> {

    protected QueryOrderIdCommand() {
        super(Setter.withGroupKey(HystrixCommandGroupKey.Factory.asKey("")));
    }

    @Override
    protected Integer run() throws Exception {
        throw new Exception();
    }

    @Override
    protected Integer getFallback() {
        return -1;
    }
}
