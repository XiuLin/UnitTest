package didi.com.ut.ruletest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import didi.com.ut.BuildConfig;
import didi.com.ut.ContextHolder;

import static org.junit.Assert.assertEquals;

/**
 * Created by didi on 2017/10/25.
 */

/**
 * 不加这些注解会导致RuntimeEnvironment.application为null，为了能给Robolectric必要的环境初始化,不然有些东西
 * 找不到，比如AndroidManifest resource等
 * 这是遇到的坑之一
 */

@RunWith(RobolectricTestRunner.class)
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
     * 这里面有个地方需要注意，见ppt最后几页($MODULE_DIR$)，告诉怎么设置，不然会有一些运行错误，
     * 提示找不到AndroidManifest.xml
     * 这是遇到的坑之一
     */
    @Test
    public void testContextHolderIsEmpty() {

        assertEquals(true,null != ContextHolder.get());
    }

}
