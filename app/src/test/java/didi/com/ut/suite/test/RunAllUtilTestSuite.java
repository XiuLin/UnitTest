package didi.com.ut.suite.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by didi on 2017/10/27.
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({TestClassOne.class,TestClassTwo.class})
public class RunAllUtilTestSuite {
    public RunAllUtilTestSuite(){}
}
