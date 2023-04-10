package com.edufelizardo.maissaudepublica.util.execution;

import org.springframework.test.context.TestContext;
import org.springframework.test.context.TestContextManager;
import org.springframework.test.context.TestExecutionListener;

public class MyTestExecutionListener implements TestExecutionListener {

    public MyTestExecutionListener() {
    }

    @Override
    public void beforeTestClass(TestContext testContext) throws Exception {
        TestExecutionListener.super.beforeTestClass(testContext);
    }
}
