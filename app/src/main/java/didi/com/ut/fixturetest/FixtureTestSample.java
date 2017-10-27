package didi.com.ut.fixturetest;

import java.io.File;

import didi.com.ut.common.Utils;

import static didi.com.ut.common.FileUtils.readFile;

/**
 * Created by didi on 2017/10/25.
 */

public class FixtureTestSample {

    public boolean checkFile(File file,String targetSHA1) {

//        if (null == file) {
//            return false;
//        }

        if (!file.exists()) {
            return false;
        }

        if (Utils.isEmpty(targetSHA1)) {
            return false;
        }

        String content = readFile(file);
        String contentSHA1 = Utils.getSHA1(content);

        return targetSHA1.equals(contentSHA1);

    }

}
