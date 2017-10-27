package didi.com.ut.sampletest;

/**
 * Created by didi on 2017/10/24.
 */

public class Arithmetic {

    public static Integer addFunc (Integer a,Integer b) {
        if (null == a || b == null) {
            return null;
        }

        int tmpRet = a + b;
        if (a > 0 && b > 0 && tmpRet < 0){
            return null;
        }

        if (a < 0 && b < 0 && tmpRet > 0){
            return null;
        }

        return a + b;
    }
}
