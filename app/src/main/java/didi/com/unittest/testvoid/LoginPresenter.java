package didi.com.unittest.testvoid;

/**
 * Created by didi on 2017/10/24.
 */

public class LoginPresenter {

    private UserManager mUserManager;


    public void setUserManager(UserManager userManager) {
        this.mUserManager = userManager;
    }

    public void login(String username, String password) {
        if (username == null || username.length() == 0) return;
        if (password == null || password.length() < 6) return;

        mUserManager.performLogin(username, password);
    }



}
