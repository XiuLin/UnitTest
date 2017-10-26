package didi.com.unittest.ruletest;

import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;
import org.robolectric.Robolectric;
import org.robolectric.RuntimeEnvironment;

import didi.com.unittest.ContextHolder;

/**
 * Created by didi on 2017/10/25.
 */

public class ContextRule implements TestRule {

    @Override
    public Statement apply(Statement base, Description description) {

        ContextHolder.set(RuntimeEnvironment.application);
        return base;
    }
}
