package didi.com.unittest.sampletest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;

/**
 * Created by didi on 2017/10/24.
 */

public class ArithmeticTestOld {


    //Fixture
    @Before
    public void init() {
        System.out.print("init");
    }

    @After
    public void destroy() {
        System.out.print("destroy");
    }

    @BeforeClass
    public void initEx() {
        System.out.print("initEx");
    }

    @AfterClass
    public void destroyEx() {
        System.out.print("destroyEx");

    }




    //不支持时是否会抛出指定异常的单元测试方法大体如下：
    @Test (expected = NullPointerException.class)
    public void unSupportType() {

    }





    /**
     * 1.测试方法必须使用注解 org.junit.Test 修饰。
     * 2.测试方法必须使用 public void 修饰，而且不能带有任何参数。
     * @throws Exception
     */
    @Test
    public void addFunc() throws Exception {

        //JUnit 提供的一系列判断测试结果是否正确的静态断言方法
        assertEquals((Integer) 66, Arithmetic.addFunc(34,32));

        /**
         *  记住：您的单元测试代码不是用来证明您是对的，而是为了证明您没有错。
         *  因此单元测试的范围要全面，比如对边界值、正常值、错误值得测试；对
         *  代码可能出现的问题要全面预测，而这也正是需求分析、详细设计环节中
         *  要考虑的。显然，我们的测试才刚刚开始，继续补充一些对特殊情况的测试
         *
         *  {null, null,null},                              // 测试 null 时的处理情况
         *  {null, null,100},                               // 测试空字符串时的处理情况
         *  {null, 100,null},                               // 测试空字符串时的处理情况
         *  {null, 1999999999,1999999999},                  // 测试溢出的情况
         *  {null, -1999999999,-1999999999},                // 测试溢出的情况
         *  {0, -9999,9999},                                // 测试正负时的情况
         *  {-44, -22,-22}                                  // 测试负负的情况
         */

        /**
         * JUnit 将测试失败的情况分为两种：failure 和 error。
         * Failure 一般由单元测试使用的断言方法判断失败引起，
         * 它表示在测试点发现了问题；而 error 则是由代码异常引起，
         * 这是测试目的之外的发现，它可能产生于测试代码本身的错误
         * （测试代码也是代码，同样无法保证完全没有缺陷），也可能是被测试代码中的一个隐藏的 bug。
         */
//        assertEquals((Integer) 0, Arithmetic.addFunc(34,32));
//        assertEquals((Integer) 98, Arithmetic.addFunc(34,32));
//        assertEquals((Integer) 88, Arithmetic.addFunc(34,32));
    }

}