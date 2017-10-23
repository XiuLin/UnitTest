package didi.com.unittest.asyntest;

import android.os.Handler;
import android.os.Looper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.when;

/**
 * Created by xl on 2017/10/22.
 */


@RunWith(PowerMockRunner.class)
@PrepareForTest(Looper.class)

public class RepoModelTest {

    @Test
    public void loadRepos() throws Exception {


        PowerMockito.mockStatic(Looper.class);
        Looper mockMainThreadLooper = PowerMockito.mock(Looper.class);
        when(Looper.getMainLooper()).thenReturn(mockMainThreadLooper);
        Handler mockMainThreadHandler = PowerMockito.mock(Handler.class);
        PowerMockito.whenNew(Handler.class).withArguments(mockMainThreadLooper).thenReturn(mockMainThreadHandler);
        when(mockMainThreadHandler.post(any(Runnable.class))).thenAnswer(new Answer() {

            @Override
            public Object answer(InvocationOnMock invocation) throws Throwable {
                invocation.getArgumentAt(0, Runnable.class).run();
                return null;
            }

        });
        Handler handler = new Handler(Looper.getMainLooper());


        RepoModel model = new RepoModel(handler);
        final List<Repo> result = new ArrayList<>();

        final CountDownLatch latch = new CountDownLatch(1); //创建CountDownLatch

        model.loadRepos(new RepoModel.RepoCallback() {
            @Override
            public void onSuccess(List<Repo> repos) {
                result.addAll(repos);
                latch.countDown();  //这里countDown，外面的await()才能结束
            }

            @Override
            public void onFailure(int code, String msg) {
                fail();
            }
        });

        latch.await();
        assertEquals(1, result.size());
    }

}