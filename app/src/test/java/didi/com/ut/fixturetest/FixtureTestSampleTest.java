package didi.com.ut.fixturetest;

import org.junit.Before;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;

/**
 * Created by didi on 2017/10/25.
 */
public class FixtureTestSampleTest {

    File file;
    static int sTimes =0 ;

    //类级别的初始化
    //@BeforeClass

    //方法级别的初始化
    @Before
    public void init() {
        System.out.print("init times:"+ ++sTimes);
        this.file = new File("/Users/didi/Downloads/cezD0McXdWvJI.jpg");
    }

    @Test
    public void checkFile() throws Exception {
        assertEquals(true,
                new FixtureTestSample().checkFile(file,"e21ed1964d0b687c1a8c091e7ba28621e47ec267"));
    }

    @Test
    public void checkFileNullSHA1() throws Exception {

        assertEquals(false,
                new FixtureTestSample().checkFile(file,null));
    }

    @Test
    public void checkNullFile() throws Exception {

        assertEquals(false,
                new FixtureTestSample().checkFile(null,"e21ed1964d0b687c1a8c091e7ba28621e47ec267"));
    }

    @Test
    public void checkFileWrongSHA1() throws Exception {

        assertEquals(false,new FixtureTestSample().checkFile(file,"dfsfsf"));
    }

}