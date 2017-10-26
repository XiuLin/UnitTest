package didi.com.unittest;

import android.content.Context;

/**
 * Created by didi on 2017/10/25.
 */

public class ContextHolder {

    private static Context sContext;

    public static void set(Context context) {
        sContext = context;
    }

    public static Context get() {
        return sContext;
    }
}
