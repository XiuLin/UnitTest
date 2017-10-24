package didi.com.unittest.sampletest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

/**
 * Created by didi on 2017/10/24.
 */

@RunWith(Parameterized.class)
public class ArithmeticTest {

    private Integer expected;
    private Integer targetA;
    private Integer targetB;


    @Rule
    public Timeout timeout = new Timeout(1000);  //使用Timeout这个 Rule，

    /**
     * 参数化测试必须的构造函数
     * @param expected     期望的测试结果，对应参数集中的第一个参数
     * @param targetA      测试数据，对应参数集中的第二个参数
     * @param targetB      测试数据，对应参数集中的第三个参数
     */
    public ArithmeticTest(Integer expected , Integer targetA, Integer targetB){
        this.expected = expected;
        this.targetA = targetA;
        this.targetB = targetB;
    }

    @Parameterized.Parameters
    public static Collection words(){
        return Arrays.asList(new Object[][]{
                {100, 34,66},                                   // 测试一般的处理情况
                {null, null,null},                              // 测试 null 时的处理情况
                {null, null,100},                               // 测试空字符串时的处理情况
                {null, 100,null},                               // 测试空字符串时的处理情况
                {null, 1999999999,1999999999},                  // 测试溢出的情况
                {null, -1999999999,-1999999999},                // 测试溢出的情况
                {0, -9999,9999},                                // 测试正负时的情况
                {-44, -22,-22}                                  // 测试负负的情况
        });
    }

    @Test
    public void addFunc() throws Exception {
        assertEquals(expected, Arithmetic.addFunc(targetA,targetB));
    }

}