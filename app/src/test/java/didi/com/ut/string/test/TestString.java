package didi.com.ut.string.test;

import android.app.Application;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.annotation.Config;

import didi.com.ut.BuildConfig;
import didi.com.ut.R;

import static org.junit.Assert.assertEquals;

/**
 * Created by didi on 2017/10/26.
 */


@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 21,qualifiers="en")
public class TestString {

    @Test
    public void testString() {
        Application application = RuntimeEnvironment.application;
        String appName = application.getString(R.string.app_name);
        String appMotherName = application.getString(R.string.app_mother_name);
        assertEquals("UnitTest----English", appName);
        assertEquals("Unit-Mother-Test",appMotherName);

    }
}
