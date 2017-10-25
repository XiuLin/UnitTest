package didi.com.unittest.unsupportedtest;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by didi on 2017/10/25.
 */
public class UnsupportedTestTest {


    //不支持时是否会抛出指定异常的单元测试方法大体如下：
    @Test (expected = RuntimeException.class)
    public void unSupportType() {
        new UnsupportedTest().checkVersion(44);
    }

    @Test
    public void SupportType() {
        new UnsupportedTest().checkVersion(20);
    }

}