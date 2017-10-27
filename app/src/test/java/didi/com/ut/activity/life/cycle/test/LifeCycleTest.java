package didi.com.ut.activity.life.cycle.test;

import android.app.Activity;
import android.app.Application;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.annotation.Config;

import didi.com.ut.BuildConfig;
import didi.com.ut.MainActivity;
import didi.com.ut.R;

import static org.junit.Assert.assertEquals;

/**
 * Created by didi on 2017/10/26.
 */

@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 21)
public class LifeCycleTest {

    @Test
    public void testActivityLifeCycle() {

        System.out.print("Show MainActivity lifecycle:\n");
        //可以完整的跑完整个Activity的生命周期，也可以单独的一些比如create start
        Robolectric.buildActivity(MainActivity.class).
                create().
                start().
                resume().
                visible().pause().stop().destroy().
                get();

        System.out.print("MainActivity lifecycle finished......\n");

    }
}
