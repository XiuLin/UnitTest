package didi.com.ut.unsupportedtest;

/**
 * Created by didi on 2017/10/25.
 */

public class UnsupportedTest {

    public void checkVersion(int version) {
        if (version >= 21) {
            throw new RuntimeException("unsupported version!");
        }
    }
}
