package didi.com.unittest.ruletest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import java.io.File;
import java.util.concurrent.TimeUnit;

import didi.com.unittest.fixturetest.FixtureTestSample;

/**
 * Created by didi on 2017/10/25.
 */

public class RuleTest {

    @Rule
    public Timeout timeout = new Timeout(70, TimeUnit.MILLISECONDS);
    //public Timeout timeout = new Timeout(30, TimeUnit.MILLISECONDS);

    @Test
    public void testMethod1() throws Exception {
        //your tests
        File file = new File("/Users/didi/Downloads/cezD0McXdWvJI.jpg");
        new FixtureTestSample().checkFile(file,"e21ed1964d0b687c1a8c091e7ba28621e47ec267");
    }

    @Test
    public void testMethod2() throws Exception {
        //your tests2
    }
}
