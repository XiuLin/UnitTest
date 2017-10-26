package didi.com.unittest.ruletest;

import android.app.Application;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.annotation.Config;

import didi.com.unittest.BuildConfig;
import didi.com.unittest.ContextHolder;

import static org.junit.Assert.assertEquals;

/**
 * Created by didi on 2017/10/25.
 */

@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class,packageName = "didi.com.unittest", sdk = 21)
public class CustomRuleTest {
    @Rule
    //public MethodNameExample methodNameExample = new MethodNameExample();
    public ContextRule contextRule = new ContextRule();
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    /**
     * 这里面有个地方需要注意，见ppt最后几页，告诉怎么设置，不然RuntimeEnvironment.application为null
     * 这是遇到的坑之一
     */
    @Test
    public void testContextHolderIsEmpty() {

        assertEquals(true,null != ContextHolder.get());
    }

}