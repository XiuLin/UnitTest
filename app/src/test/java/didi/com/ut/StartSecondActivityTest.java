package didi.com.ut;

import android.content.Intent;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;
import org.robolectric.shadows.ShadowApplication;

import static org.junit.Assert.assertEquals;

/**
 * Created by didi on 2017/10/26.
 */

@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 21)
public class StartSecondActivityTest {
    @Test
    public void testMainActivity() throws Exception {

        MainActivity mainActivity = Robolectric.setupActivity(MainActivity.class);

        System.out.print("MainActivity initialized\n");

        mainActivity.findViewById(R.id.button).performClick();

        Intent expectedIntent = new Intent(mainActivity, SecondActivity.class);
        Intent actual = ShadowApplication.getInstance().getNextStartedActivity();

        assertEquals(expectedIntent.getComponent(), actual.getComponent());
    }

}