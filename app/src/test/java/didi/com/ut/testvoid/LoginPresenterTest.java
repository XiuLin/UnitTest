package didi.com.ut.testvoid;

import org.junit.Test;
import org.mockito.Mockito;

/**
 * Created by didi on 2017/10/24.
 *
 * --------------------Mock Demo--------------------
 *
 */
public class LoginPresenterTest {
    @Test
    public void login() throws Exception {

        //验证performLogin得到调用，并且参数是我们预想的！！！
        UserManager mockedUserManager = Mockito.mock(UserManager.class);
        LoginPresenter loginPresenter = new LoginPresenter();
        loginPresenter.setUserManager(mockedUserManager);
        loginPresenter.login("didi","didichuxing.com");
        //loginPresenter.login("didi","didi");


        //Mockito.verify(mockedUserManager).performLogin("didi","didi");
        Mockito.verify(mockedUserManager).performLogin("didi","didichuxing.com");

        //the same as 上面
        Mockito.verify(mockedUserManager,Mockito.times(1)).performLogin("didi","didichuxing.com");


        //这个方法最多被调用了多少次
        Mockito.verify(mockedUserManager,Mockito.atMost(43)).performLogin("didi","didichuxing.com");


        //这个方法最少被调用了多少次
        Mockito.verify(mockedUserManager,Mockito.atLeast(33)).performLogin("didi","didichuxing.com");


        //从来没有被调用，比如在loginPresenter.login("didi","didi");
        Mockito.verify(mockedUserManager,Mockito.never()).performLogin("didi","didichuxing.com");

        /**
         * 这种匹配器可以测试的很全面，包括null，但是前后必须都是
         * 看看Mockito.any
         */

        Mockito.verify(mockedUserManager).performLogin(Mockito.anyString(), Mockito.anyString());
        //wrong
        Mockito.verify(mockedUserManager).performLogin(Mockito.anyString(), "asfsaf");
    }

}