package didi.com.unittest.ruletest;

import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

/**
 * Created by didi on 2017/10/25.
 */

public class MethodNameExample implements TestRule {

    @Override
    public Statement apply(final Statement base, final Description description) {
        return new Statement() {
            @Override
            public void evaluate() throws Throwable {
                //想要在测试方法运行之前做一些事情，就在base.evaluate()之前做
                String className = description.getClassName();
                String methodName = description.getMethodName();

                base.evaluate();  //这其实就是运行测试方法

                //想要在测试方法运行之后做一些事情，就在base.evaluate()之后做
                System.out.println("Class name: "+className +", method name: "+methodName);
            }
        };
    }
}
