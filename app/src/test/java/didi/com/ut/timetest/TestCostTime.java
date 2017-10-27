package didi.com.ut.timetest;

import org.junit.Test;

import java.io.File;

import didi.com.ut.fixturetest.FixtureTestSample;

/**
 * Created by didi on 2017/10/25.
 */

public class TestCostTime {

    //@Test(timeout = 20)
    @Test(timeout = 140)
    public void checkFileCostTime() {

        File file = new File("/Users/didi/Downloads/cezD0McXdWvJI.jpg");
        new FixtureTestSample().checkFile(file,"e21ed1964d0b687c1a8c091e7ba28621e47ec267");
    }
}
