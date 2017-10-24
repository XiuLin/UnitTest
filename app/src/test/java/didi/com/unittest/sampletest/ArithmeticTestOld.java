package didi.com.unittest.sampletest;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by didi on 2017/10/24.
 */

public class ArithmeticTestOld {


    /**
     * 1.测试方法必须使用注解 org.junit.Test 修饰。
     * 2.测试方法必须使用 public void 修饰，而且不能带有任何参数。
     * @throws Exception
     */
    @Test
    public void addFunc() throws Exception {
        assertEquals((Integer) 66, Arithmetic.addFunc(34,32));
        assertEquals((Integer) 0, Arithmetic.addFunc(34,32));
        assertEquals((Integer) 98, Arithmetic.addFunc(34,32));
        assertEquals((Integer) 88, Arithmetic.addFunc(34,32));
    }

}