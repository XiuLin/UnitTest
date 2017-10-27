package didi.com.ut.common;

import android.support.annotation.Nullable;
import android.text.TextUtils;

import java.security.MessageDigest;

/**
 * Created by didi on 2017/10/25.
 */

public class Utils {

    /**
     * Returns true if the string is null or 0-length.
     * @param str the string to be examined
     * @return true if str is null or zero length
     */
    public static boolean isEmpty(@Nullable CharSequence str) {
        return str == null || str.length() == 0;
    }

    private static final char[] hexChar = {'0', '1', '2', '3', '4', '5', '6', '7',
            '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};


    static public String getSHA1(String content) {
        if (TextUtils.isEmpty(content))
            return "";
        try {
            MessageDigest sha1 = MessageDigest.getInstance("SHA1");
            byte[] bytes = content.getBytes();
            sha1.update(bytes, 0, bytes.length);
            return toHexString(sha1.digest());
        } catch (Exception e) {
            return "";
        }
    }

    private static String toHexString(byte b[]) {
        StringBuilder sb = new StringBuilder(b.length * 2);
        for (byte aB : b) {
            sb.append(hexChar[(aB & 0xf0) >>> 4]);
            sb.append(hexChar[aB & 0xf]);
        }
        return sb.toString();
    }
}
