package didi.com.unittest.testvoid;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

/**
 * Created by didi on 2017/10/24.
 */
public class LoginPresenterTest {
    @Test
    public void login() throws Exception {

        UserManager mockedUserManager = Mockito.mock(UserManager.class);
        LoginPresenter loginPresenter = new LoginPresenter();
        loginPresenter.setUserManager(mockedUserManager);
        loginPresenter.login("didi","didichuxing.com");
        //loginPresenter.login("didi","didi");

        //Mockito.verify(mockedUserManager).performLogin("didi","didi");
        Mockito.verify(mockedUserManager).performLogin("didi","didichuxing.com");
    }

}