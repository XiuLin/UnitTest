package didi.com.unittest.common;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Created by didi on 2017/10/25.
 */

public class FileUtils {

    public static void closeQuietly(OutputStream outputStream) {
        if (null != outputStream) {
            try {
                outputStream.close();
                outputStream = null;
            }catch (IOException e) {

            }
        }
    }

    /**
     *
     * @param file The file path of template
     * @return Returns a string containing all of the content readed from template file.
     */
    static public String readFile(File file) {
        if (file == null || !file.exists() || !file.canRead()) {
            return null;
        }

        // read
        ByteArrayOutputStream bis = null;
        InputStream reader = null;
        String rtn = null;
        try {
            bis = new ByteArrayOutputStream();
            reader = new FileInputStream(file);
            byte[] buff = new byte[8000];

            int bytesRead = 0;
            ByteArrayOutputStream bao = new ByteArrayOutputStream();

            while((bytesRead = reader.read(buff)) != -1) {
                bao.write(buff, 0, bytesRead);
            }

            rtn = bao.toString("UTF-8");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (bis != null) {
                try {
                    bis.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (reader != null) {
                try {
                    reader.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return rtn;
    }
}
